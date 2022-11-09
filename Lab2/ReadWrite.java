package Lab2;

import Lab2.Exceptions.FileDoesNotExistExp;
import Lab2.Exceptions.OutOfSizeExp;

import java.io.*;
import java.util.Scanner;

public class ReadWrite {
    public static int readSize(File file) throws FileNotFoundException, OutOfSizeExp{
        int size = 0;
        try (Scanner in = new Scanner(file)) {
            while (in.hasNextInt()) {
                size = in.nextInt();
                if (size > 1_000_000) {
                    throw new OutOfSizeExp(2);
                }
            }
            return size;
        }catch (IOException e) {
            throw new FileDoesNotExistExp(3);
        }
    }

    public static void writeMatrix(int [][] matrix, File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write("\n");
            for (int i = 0; i < matrix.length; ++i) {
                for (int j = 0; j < matrix[0].length; ++j) {
                    writer.write(String.format("%" + matrix.length + "d", matrix[i][j]));
                    writer.write(" ");
                }
                writer.write("\n");
            }
            writer.flush();
        }catch (IOException e){
            throw e;
        }
    }

   public static void clear(File file) throws IOException {
       try (FileWriter fw = new FileWriter(file, false)) {
           fw.flush();
       }catch (IOException e){
           throw e;
       }
   }
}

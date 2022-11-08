package Lab2;

import Lab2.Exceptions.DivideByZeroExp;
import Lab2.Exceptions.FileDoesNotExistExp;
import Lab2.Exceptions.OutOfSizeExp;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    public static Logger logger;
    static {
        try(FileInputStream fileInputStream = new FileInputStream("./src/resourcesLab2/log.config")){
            LogManager.getLogManager().readConfiguration(fileInputStream);
            logger = Logger.getLogger(Main.class.getName());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File input = new File("./src/resourcesLab2/input.txt");
        File output = new File("./src/resourcesLab2/output.txt");

        int tryAgain = 1;

        while (tryAgain == 1) {
            try {
                ReadWrite.clear(output);
                int size = ReadWrite.readSize(input);
                int [][] matrix = CreateRotateDivide.createMatrix(size);

                for (int i = 0; i < 3; ++i) {
                    matrix = CreateRotateDivide.rotateMatrix90(matrix);
                    matrix = CreateRotateDivide.divideMatrix(matrix);
                    ReadWrite.writeMatrix(matrix, output);
                }
                tryAgain = 0;
            }catch (FileDoesNotExistExp e) {
                System.out.println("Got exception: " + e);
                tryAgain = 0;
            }catch (IOException k) {
                k.printStackTrace();
                tryAgain = 0;
            }catch (OutOfSizeExp f){
                System.out.println("Got exception: " + f);
                System.out.println("Choose the dimension < 1_000_000");
                tryAgain = 0;
            }catch (DivideByZeroExp d) {
                System.out.println("Got exception: " + d);
            }catch (OutOfMemoryError l){
                logger.log(Level.SEVERE, "OutOfMemory Error appeared " + l.getClass());
            }
        }
    }
}

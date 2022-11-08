package Lab2;

import Lab2.Exceptions.DivideByZeroExp;

import java.util.Random;

public class CreateRotateDivide {

    public static int[][] createMatrix(int size) {
        int [][] a = new int[size] [size];
        Random rnd = new Random();
        for (int i = 0; i < a.length; ++i){
            for ( int j = 0; j < a[0].length; ++j){
                a[i][j] = rnd.nextInt((2*size) + 1)- size;
            }
        }
        return a;
    }

    public static int[][] rotateMatrix90 ( int[][] a){
        int[][] b = new int[a.length][a[0].length];
        for (int i = 0; i < b.length; ++i) {
            for (int j = 0; j < b[0].length; ++j) {
                b[i][j] = a[j][a.length - i - 1];
            }
        }
        return b;
    }

    public static int[][] divideMatrix ( int[][] a) throws DivideByZeroExp {
        int[][] b = new int[a.length][a[0].length];
        int sum;
        for (int i = 0; i < b.length; ++i) {
            for (int j = 0; j < b[0].length; ++j) {
                b[i][j] = a[i][j];
                if (j == 0) {
                    sum = a[i][j + 1] + a[i][b[0].length - 1];
                }
                else if (j == b[0].length - 1){
                    sum = a[i][j - 1] + a[i][0];
                }
                else{
                    sum = a[i][j - 1] + a[i][j + 1];
                }
                if (sum == 0)
                {
                    throw new DivideByZeroExp(1);
                }
                b[i][j] /= sum;
            }
        }
        return b;
    }
}

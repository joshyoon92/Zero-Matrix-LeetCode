package com.company;

public class ZeroMatrix {
    public static void zeroMatrix(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i=0; i<row.length; i++){
            if (row[i]){
                nullRow(matrix,i);
            }
        }
        for (int j=0; j<col.length; j++){
            if (col[j]){
                nullCol(matrix,j);
            }
        }
    }
    public static void nullRow(int[][] matrix, int row){
        for (int i=0; i<matrix[0].length; i++){
            matrix[row][i] = 0;
        }
    }
    public static void nullCol(int[][] matrix, int col){
        for (int i=0; i<matrix.length;i++){
            matrix[i][col] = 0;
        }
    }
}

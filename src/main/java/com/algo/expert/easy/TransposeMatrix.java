package com.algo.expert.easy;

public class TransposeMatrix {

    public static int[][] transposeMatrix(int[][] matrix) {
        if (matrix.length > 0) {
            int[][] result = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    result[i][j] = matrix[j][i];
                }
            }
            return result;
        } else {
            return new int[0][0];
        }

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {5, 7, 9}, {3, 4, 6}};
        int[][] result = transposeMatrix(matrix);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

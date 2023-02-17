package com.DailyPractise.Date16_02;

import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {

        int[] [] matrix=acceptMatrix();
        printMatrix(matrix);
    }
    private static int[][] acceptMatrix() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column");
        int rows= sc.nextInt();
        int columns=sc.nextInt();
        int[][] matrix=new int[rows][columns];
        System.out.println("Enter values");
        for (int row = 0; rows <matrix.length ; row++) {
            for (int column = 0; column <matrix[row].length ; column++) {
                matrix[row][column]=sc.nextInt();
            }

        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("print matrix");
        for (int row = 0; row < matrix.length ; row++) {
            for (int column = 0; column <matrix[row].length ; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println("");

        }
    }


}

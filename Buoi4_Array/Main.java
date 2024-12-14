package Buoi4_Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Moi ban nhap vao so nguyen N: ");
//        int n = Integer.parseInt(scanner.nextLine());
//        double[] arr = new double[n];
//        for (int i = 0; i<n; i++) {
//            System.out.println("Moi ban nhap so thu " + (i+1) + ":");
//            arr[i] = scanner.nextDouble();
//        }
//        System.out.println("Cac so ban vua nhap la: ");
//        for (int i = 0; i<n;i++){
//            System.out.print(arr[i]+ " ");
//        }

//        System.out.print("Moi ban nhap vao so nguyen n: ");
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] arr = new int[n];
//        for (int i = 0; i<n;i++){
//            System.out.print("Moi ban nhap so thu " +(i+1) + ": ");
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println("Mang ban vua nhap la: ");
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i] + " ");
//        }
//        for (int i=0;i<n;i++){
//            if (arr[i] % 2 == 0){
//                arr[i] += 1;
//
//            }
//        }
//        System.out.println("\nMang sau khi phan tu chan tang len 1 don vi la: ");
//        for (int i=0;i<n;i++){
//
//            System.out.print( arr[i] + " ");
//        }

//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        System.out.println(matrix[2][0]);
        // index bat dau bang 0
        System.out.println("Moi ban nhap so hang cho mang hai chieu: ");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi ban nhap so cot cho mang hai chieu: ");
        int cols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][cols];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
//        in mang hai chieu
        System.out.println("Mang hai chieu ban vua nhap la: ");
        for (int i = 0;i<rows;i++){
            for (int j=0;i<cols;i++){
                System.out.println(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

package Buoi4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int [] array = new int[3];
//        String [] arrStr = {"trung", "tung"};
           Scanner scanner = new Scanner(System.in);
//        System.out.println("Moi ban nhap so nguyen N: ");
//        int N = Integer.parseInt(scanner.nextLine());
//        khai bao mang
//        int[] arr = new int[N];
//        vong lap for
//        for (int i =0;i<N;i++){
//            System.out.println("Moi ban nhap so thu: " + (i+1));
//            arr[i] = input;
//            input = Integer.parseInt(scanner.nextLine());
//            Cach viet tat
//            arr[i] = Integer.parseInt(scanner.nextLine());
//        }
//        for (int i=0;i<N;i++){
//            System.out.print(arr[i]+ "\t");
//        }
//        System.out.println("Moi ban nhap so nguyen n: ");
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] array = new int[n];
//        for (int i=0;i<n;i++){
//            System.out.println("Moi ban nhap so thu: " +(i+1));
//            array[i] = Integer.parseInt(scanner.nextLine());
//        }
//        for (int i=0;i<n;i++){
//            System.out.print(array[i] + "\t");
//        }
//        for (int i=0;i<n;i++){
//            if (array[i] % 2 ==0){
//                array[i] += 1;
//            }
//        }
//        for (int i=0;i<n;i++){
//            System.out.print( array[i] + "\t");
//        }
//  --      -------------------------------Mang hai chieu---------------------------------------------------------------
//        int row = 3;
//        int col = 2;
//        int[][] arr = new int[row][col];
//        for (int i=0; i< row;i++){
//            for (int j=0;i<col;j++){
//                System.out.println("Moi ban nhap arr["+i+"]"+"["+j+"]");
//                arr[i][j] = Integer.parseInt(scanner.nextLine());
//            }
//        }
//        for (int i=0; i< row;i++){
//            for (int j=0;j<col;j++){
//                System.out.print(arr[i][j] +"\t");
//            }
//            System.out.println();
//        }
//        System.out.println("Moi ban nhap so hang: ");
//        int row = Integer.parseInt(scanner.nextLine());
//        System.out.println("Moi ban nhap so cot: ");
//        int col = Integer.parseInt(scanner.nextLine());
//
//        int[][] arr = new int[row][col];
//
//        for (int i=0;i<row;i++){
//            for (int j=0;j<col;j++){
//                System.out.println("Moi ban nhap arr["+i+"]"+"["+j+"]:");
//                arr[i][j] = Integer.parseInt(scanner.nextLine());
//            }
//        }
//
//        for (int i=0; i< row;i++){
//            for (int j=0;j<col;j++){
//                System.out.print(arr[i][j] +"\t");
//            }
//            System.out.println();
//        }
//
//        int sum = 0;
//        for (int i=0; i< row;i++){
//            for (int j=0;j<col;j++){
//                if (arr[i][j] % 3 == 0){
//                    System.out.println(arr[i][j]+ "\t");
//                }
//            }
//            System.out.println();
//        }

//        int sum = 0;
//        for (int i=0; i< row;i++) {
//            for (int j = 0; j < col; j++) {
//
//                sum = sum + arr[i][j];
//            }
//        }
//        System.out.println("Tong ma tran la: " + sum);
        // Nhap so dong va so cot cua ma tran A
        System.out.print("Nhap so hang cua ma tran A: ");
        int rowA = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so cot cua ma tran A: ");
        int colA = Integer.parseInt(scanner.nextLine());
        // Nhap so dong va so cot cua ma tran B
        System.out.print("Nhap so hang cua ma tran B: ");
        int rowB = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so cot cua ma tran B: ");
        int colB = Integer.parseInt(scanner.nextLine());
        //Kiem tra so dong va so cot cua hai ma tran co bang nhau hay khong
        if (rowA != rowB || colA != colB) {
            System.out.println("Khong the thuc hien duoc!");
        }
        else {
            //Nhap mang A
            int [][] arrA = new int[rowA][colA];
            for (int i =0;i<rowA;i++){
                for (int j=0;j<colA;j++){
                    System.out.print("Moi ban nhap arr["+i+"]"+"["+j+"]:");
                    arrA[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            //Nhap mang B
            int [][] arrB = new int[rowB][colB];
            for (int i =0;i<rowB;i++){
                for (int j=0;j<colB;j++){
                    System.out.print("Moi ban nhap arr["+i+"]"+"["+j+"]:");
                    arrB[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            // Tong hai ma tran
            int [][] arrC = new int[rowA][colA];
            for (int i =0;i<rowA;i++){
                for (int j=0;j<colA;j++){
                    arrC[i][j] = arrA[i][j] + arrB[i][j];
                }
            }
            //In ra ket qua
            System.out.println("Tong cua 2 ma tran la: ");
            for (int i=0;i<rowA;i++){
                for (int j=0;j<colA;j++){
                    System.out.print(arrC[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}

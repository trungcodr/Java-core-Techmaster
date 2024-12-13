package Buoi4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int ar[] = new int[3];
//        for (int i = 0; i<ar.length;i++){
//            System.out.println("Moi ban nhap vao so thu" + (i+1) + ": ");
//            ar[i] = Integer.parseInt(scanner.nextLine());
//        }
//        for (int e : ar){
//            System.out.println(e);
//        }
        //Tinh tong cac so tu 0 - n
//       calculateSum(scanner);
       calSum(scanner);
    }

    //Quy tac dat ten ham
    //Ten ham bat dau bang chu cai thuong
    //Moi ham chi dung cho mot muc dich duy nhat // 1 tinh nang duy nhat
    //Ten ham khong duoc dat trung nhau

    //Ham tinh tong
//    public static void calculateSum(Scanner scanner){
//
//        System.out.println("Moi ban nhap so nguyen n: ");
//        int n = Integer.parseInt(scanner.nextLine());
//        int sum = 0;
//        for (int i =1;i<=n;i++){
//            sum += i;
//        }
//        System.out.println(sum);
//    }

    //Ham co kieu tra ve vd int, float, double, boolen phai co return
//    public static int calculateMul(Scanner scanner){
//
//        System.out.println("Moi ban nhap so nguyen n: ");
//        int n = Integer.parseInt(scanner.nextLine());
//        int mul = 1;
//        for (int i =1;i<=n;i++){
//            mul*= i;
//        }
//        System.out.println(mul);
//        return mul;
//    }

    //Cho so nguyen n, thuc hien luu cac so vao mang -> tinh tong
    public static void calSum(Scanner scanner){
        int arr[] = inputArray(scanner);

        int sum = 0;
        for (int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Tong: " + sum);
    }

    public static int[] inputArray(Scanner scanner){
        System.out.println("Moi ban nhap so nguyen n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int [] arr = new int[n];
        for (int i = 0; i<n;i++){
            System.out.println("Moi ban nhap so thu " +(i+1)+ ": ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }
}

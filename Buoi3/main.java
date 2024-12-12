package Buoi3;

import java.util.Scanner;

import static java.lang.Integer.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap a: ");
//        double a = Double.parseDouble(scanner.nextLine());
//        System.out.println("Nhap b: ");
//        double b = Double.parseDouble(scanner.nextLine());
//        System.out.println("Gia tri cua a la: " + a);
//        System.out.println("Gia tri cua b la: " + b);
//
//        double equation;
//
//        if (a == 0 && b ==0 ){
//            System.out.println("Phuong trinh vo so nghiem!");
//        }
//        else if (a == 0 && b != 0) {
//            System.out.println("Phuong trinh vo nghiem!");
//        }
//        else {
//            equation = -b/a;
//            System.out.println("Phuong trinh co nghiem la:" + equation);
//        }
//
//   ---------------------------------------------Bai tap 3-------------------------------------------------------------
//        System.out.println("Nhap so dien ban su dung: ");
//        int numElec = Integer.parseInt(scanner.nextLine());
//        if (numElec > 0 &&numElec <=50) {
//            int moneyElec1 = numElec * 1000;
//            System.out.println("Tien dien can tra: " + moneyElec1);
//        }
//        else if (numElec < 0) {
//            System.out.println("Ban can nhap lai!");
//        }
//        else {
//            int moneyElec2 = numElec * 1200;
//            System.out.println("Tien dien ban can tra: " + moneyElec2);
//        }
//  ------------------------------------------------Bai tap 4-----------------------------------------------------------
//        String userSer = "techmaster";
//        String passSer = "hoclacoviec";
//        System.out.println("Nhap username: ");
//        String username = scanner.nextLine();
//        System.out.println("Nhap password: ");
//        String password = scanner.nextLine();
//        if (!userSer.equals(username) || !passSer.equals(password)){
//            System.out.println("Tai khoan khong ton tai, vui long thu lai!");
//        }
//        else {
//            System.out.println("Dang nhap thanh cong");
//  -----------------------------------------------Switch Case----------------------------------------------------------
//        System.out.println("Moi ban nhap vao tu muon dich: ");
//        String word = scanner.nextLine();
//        switch (word){
//            case "one":
//                System.out.println("So mot");
//                break;
//            case "two":
//                System.out.println("So hai");
//                break;
//            default:
//                System.out.println("Khong hop le");
//        }
//  ----------------------------------------------Bai tap Switch Case---------------------------------------------------
//        System.out.println("Moi ban nhap so tien: ");
//        int money = Integer.parseInt(scanner.nextLine());
//        System.out.println("Moi ban chon loai tien: ");
//        String typeMoney = scanner.nextLine();
//        switch (typeMoney){
//            case "usd":
//                System.out.println("USD sang VND la: " + (money * 24000));
//                break;
//            case "eur":
//                System.out.println("EUR sang VND la: " + (money * 28000));
//                break;
//            default:
//                System.out.println("Khong hop le! ");
//        }
//  -------------------------------------------------For----------------------------------------------------------------
//        System.out.println("Moi ban nhap n: ");
//        int n = parseInt(scanner.nextLine());
//        int sum = 1;
//        int mul = 1;
//        for (int i = 2; i <=n; i++){
//            sum += i;
//            sum = sum + i -> 1+2+3+4
//        }
//        System.out.println("Tong tat ca so nguyen tu phan tu 0 - n la: " + sum );
//
//        for (int i = 2; i <=n; i++){
//            mul *= i;
//        }
//        System.out.println(mul);
//  ------------------------------------------------While---------------------------------------------------------------
//        int n = 10;
//        while (n>0){
//            System.out.println(n);
//            n--;
//        }
//
//  ----------------------------------------------------Bai tap 8-------------------------------------------------------
        String choose = "";
        int sum = 0;
        do {
            System.out.println("Moi ban nhap so nguyen: ");
            int n = Integer.parseInt(scanner.nextLine());
            sum += n;
            System.out.println("Do you want to continue(Y/N): ");
            choose = scanner.nextLine();
        }
         while (choose.equalsIgnoreCase("y"));
        System.out.println("Tong cua cac so nguyen ban vua nhap la: " + sum);
    }
}

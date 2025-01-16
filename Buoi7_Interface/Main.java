package Buoi7_Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap tieu de: ");
        String title = scanner.nextLine();
        System.out.println("Nhap tac gia: ");
        String author = scanner.nextLine();
        System.out.println("Nhap ngay cong bo(YYYY-MM-DD): ");
        String publicDate = scanner.nextLine();
        System.out.println("Nhap danh gia: ");
        double rate = Double.parseDouble(scanner.nextLine());

        News news = new News(title,author,publicDate,rate);
        news.display();
    }
}

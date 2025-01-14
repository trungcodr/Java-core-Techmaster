package Buoi7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi ban nhap tieu de: ");
        String title = scanner.nextLine();
        System.out.println("Moi ban nhap tac gia: ");
        String author = scanner.nextLine();
        System.out.println("Moi ban nhap ngay cong bo(YYYY-MM-DD): ");
        String publicDate = scanner.nextLine();
        System.out.println("Moi ban nhap danh gia(1-5): ");
        double rate = Double.parseDouble(scanner.nextLine());

        News news = new News(title,author,rate,publicDate);
        //Hien thi thong tin
        System.out.println("Thong tin tac pham: ");
        news.display();

    }
}

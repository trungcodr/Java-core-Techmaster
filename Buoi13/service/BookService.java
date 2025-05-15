package Buoi13.service;

import Buoi13.entities.Book;

import java.util.List;
import java.util.Scanner;

public class BookService implements IService<Book>{

    @Override
    public Book add(Scanner scanner) {
        System.out.println("Moi ban nhap ten sach: ");
        String title = scanner.nextLine();
        System.out.println("Moi ban nhap tac gia: ");
        String author = scanner.nextLine();
        System.out.println("Moi ban nhap so luong sach: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        return new Book(title,author,quantity);
    }

    @Override
    public void delete(Scanner scanner, List<Book> obj) {
        System.out.println("Moi ban nhap id sach: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Book book : obj){
            if (id == book.getId()){
                obj.remove(book);
            }
        }
    }

    @Override
    public void update(Scanner scanner, List<Book> obj) {
        System.out.println("Moi ban nhap id sach  muon cap nhat: ");
        int id = Integer.parseInt(scanner.nextLine());

//        boolean found = false;
        for (Book book : obj){
            if (id == book.getId()){
//                found = true;
                //Nhap thong tin moi
                System.out.println("Nhap ten sach moi: ");
                String newTitle = scanner.nextLine();
                book.setTitle(newTitle);

                System.out.println("Nhap ten tac gia moi: ");
                String newAuthor = scanner.nextLine();
                book.setAuthor(newAuthor);

                System.out.println("Nhap so luong sach moi: ");
                int newQuantity = Integer.parseInt(scanner.nextLine());
                book.setQuantity(newQuantity);
                break;
            }
        }
    }
}

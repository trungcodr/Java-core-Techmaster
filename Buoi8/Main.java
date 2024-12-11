package Buoi8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//LAB 1
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so thanh vien trong gia dinh: ");
        int numberMember = Integer.parseInt(scanner.nextLine());
        //Tao array list de luu Member vao
        ArrayList<Member> list = new ArrayList<>();
        for (int i = 0;i<numberMember;i++){
            System.out.println("Nhap id thanh vien: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap ten thanh vien: ");
            String name = scanner.nextLine();
            System.out.println("Nhap ngay sinh cua thanh vien: ");
            String dob = scanner.nextLine();
            System.out.println("Nhap cong viec cua thanh vien: ");
            String job = scanner.nextLine();
            list.add(new Member(id,name,dob,job));
        }
        //In danh sach thanh vien
//        for (int i = 0; i<list.size();i++){
//            Member member = list.get(i);
//            System.out.println("Danh sach thanh vien: " + member );
//
//        }
        //Su dung vong lap for each
        for (Member member : list){
            System.out.println("Danh sach thanh vien: " + member);
        }
    }
}

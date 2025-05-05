package Buoi8_ArrayList_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Member> members = new ArrayList<>();
        System.out.println("Nhap so luong thanh vien trong gia dinh: ");
        int numMember = Integer.parseInt(scanner.nextLine());
        for (int i =0;i<numMember;i++){
            System.out.println("Moi ban nhap thanh vien thu " + (i+1)+": ");
            System.out.println("Nhap id: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap ho va ten: ");
            String name = scanner.nextLine();
            System.out.println("Nhap sinh nhat(yyyy-mm-dd): ");
            String dob = scanner.nextLine();
            System.out.println("Nhap cong viec: ");
            String job = scanner.nextLine();
            //Member member = new Member(id,name,dob,job)
            //members.add(member)
            members.add(new Member(id,name,dob,job));
        }
//        for (int i = 0 ; i< members.size();i++){
//            System.out.println("Thong tin cac thanh vien: ");
//            Member member = members.get(i);
//            System.out.println(member);
//        }
        System.out.println(members);
    }
}

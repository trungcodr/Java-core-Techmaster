package Buoi5_OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Khoi tao doi doi tuong (object)
//        Person vietnamese = new Person();
//        System.out.println(vietnamese);
//        vietnamese.setAddress("HN");
//        System.out.println(vietnamese.getAddress());
//        Person chinese = new Person("sdo",34,"Shanghai");
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Moi ban nhap ten cua mot hoc sinh: " );
//        String name = scanner.nextLine();
//        System.out.println("Moi ban nhap ten lop hoc: ");
//        String nameClass =scanner.nextLine();
//        System.out.println("Moi ban nhap ten bo mon: ");
//        String depatment = scanner.nextLine();
        //Thong qua ham khoi tao
//        Student trung = new Student(name,nameClass,depatment);
//        System.out.println(trung);
        //Thong qua set
//        trung.setNameStudent(name);
//        trung.setNameClass(nameClass);
//        trung.setDepartment(depatment);
//  ------------------------------------------------Bai 1---------------------------------------------------------------
//        System.out.println("Nhap id san pham: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhap ten san pham: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhap gia san pham: ");
//        double price = Double.parseDouble(scanner.nextLine());
//        Product item = new Product(id, name, price);
//        System.out.println(item);
//        System.out.println("Thue nhap khau cua san pham: " + item.tax());
//  -------------------------------------------------Bai 2--------------------------------------------------------------
//        System.out.println("Nhap id nhan vien: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhap ten nhan vien: ");
//        String name = scanner.nextLine();
//        System.out.println("Nhap dia chi nhan vien: ");
//        String addess = scanner.nextLine();
//        System.out.println("Nhap tuoi nhan vien: ");
//        int age = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhap kinh nghiem cua nhan vien: ");
//        double exprrience = Double.parseDouble(scanner.nextLine());
//        System.out.println("Nhap noi lam viec: ");
//        String placeWork = scanner.nextLine();
//        Employee trung = new Employee(id, name, addess, age, exprrience, placeWork);
//        System.out.println(trung);

//  -------------------------------------------------Bai 3--------------------------------------------------------------

        System.out.print("So luong nhan vien: ");
        int number = Integer.parseInt(scanner.nextLine());

        Employee3[] employees = new Employee3[number];

        for (int i=0;i<number;i++){
            System.out.println("Nhap thong tin cho nhan vien thu "+ (i+1) + ": ");

            System.out.print("ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Exp: ");
            double exp = Double.parseDouble(scanner.nextLine());

            Employee3 employee = new Employee3(id,name,age,exp);
            employees[i] = employee;
        }
        for (int i = 0; i<number;i++){
            System.out.println(employees[i]);
        }
    }
}

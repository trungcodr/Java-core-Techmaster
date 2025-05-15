package Buoi13.service;

import Buoi13.entities.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements IService<Customer> {

    @Override
    public Customer add(Scanner scanner) {
        System.out.println("Nhap ten khach hang: ");
        String name = scanner.nextLine();
        System.out.println("Nhap so dien thoai khach hang: ");
        String phone = scanner.nextLine();
        return new Customer(name,phone);
    }

    @Override
    public void delete(Scanner scanner, List<Customer> obj) {
        System.out.println("Moi ban nhap id khach hang: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer customer : obj){
            if (id == customer.getId()){
                obj.remove(customer);
            }
        }
    }

    @Override
    public void update(Scanner scanner, List<Customer> obj) {
        System.out.println("Moi ban nhap id khach hang muon cap nhat: ");
        int id = Integer.parseInt(scanner.nextLine());
//        boolean found = false;
        for (Customer customer : obj){
            if (id == customer.getId()){
//                found = true;
                System.out.println("Moi ban nhap ten khach hang moi: ");
                String newName = scanner.nextLine();
                System.out.println("Moi ban nhap so dien thoai moi: ");
                String newPhone = scanner.nextLine();

            }
        }
    }
}

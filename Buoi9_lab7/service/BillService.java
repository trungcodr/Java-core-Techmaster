package Buoi9_lab7.service;

import Buoi9_lab7.entities.Customer;
import Buoi9_lab7.entities.Bill;

import java.util.List;
import java.util.Scanner;

public class BillService {
    CustomerService customerService = new CustomerService();
    public Bill inputInfo(Scanner scanner){
        System.out.println("Mời b nhập id KH sử dụng điện: ");
        String cusId = scanner.nextLine();
        System.out.println("Nhập chỉ số cũ: ");
        int oldNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chỉ số mới: ");
        int newNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kỳ hđ: ");
        String tern = scanner.nextLine();
        return new Bill(oldNumber, newNumber,tern, cusId);
    }

    public void printInfo(List<Bill> bills, List<Customer>customers){
        for (Bill bill: bills){
            System.out.println("Customer: ");
            customerService.findById(bill.getCustomerId(), customers);
            System.out.println("Bill id: "+bill.getId());
        }
    }
    //Tinh tien
    public double money(int oldNumber,int newNumber){
        return (newNumber-oldNumber)*750;
    }
}

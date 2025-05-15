package Buoi9_lab7.view;

import Buoi9_lab7.entities.Bill;
import Buoi9_lab7.entities.Customer;
import Buoi9_lab7.service.BillService;
import Buoi9_lab7.service.CustomerService;

import java.util.List;
import java.util.Scanner;

public class Menu {
    CustomerService customerService = new CustomerService();
    BillService billService = new BillService();
    public void displayMenu(Scanner scanner, List<Customer> customers, List<Bill> bills){
        System.out.println("1.Nhap thong tin khach hang: ");
        System.out.println("2.Hien thi thong tin khach hang: ");
        System.out.println("3.Nhap thong tin bien lai: ");
        System.out.println("4.Hien thi thong tin bien lai: ");
        System.out.println("Moi ban lua chon: ");
        selectMenu(scanner,customers,bills);
    }

    public void selectMenu(Scanner scanner, List<Customer> customers, List<Bill> bills){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                Customer customer = customerService.inputInfo(scanner);
                customers.add(customer);
                break;
            case 2:
                System.out.println(customers);
                break;
            case 3:
                Bill bill = billService.inputInfo(scanner);
                bills.add(bill);
                break;
            case 4:
                System.out.println(bills);
                break;
        }
    }
}

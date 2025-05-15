package Buoi9_lab7.service;

import Buoi9_lab7.entities.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerService {

    public Customer inputInfo(Scanner scanner){
            System.out.println("Moi ban nhap ho ten chu nha: ");
            String name = scanner.nextLine();
            System.out.println("Moi ban nhap so nha: ");
            String numHouse = scanner.nextLine();
            System.out.println("Moi ban nhap ma so cong to dien: ");
            String meterCode = scanner.nextLine();
            return new Customer(name,numHouse,meterCode);
    }

    public Customer findById(String id,List<Customer> customers){
        for (Customer customer : customers){
            if (customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }
}

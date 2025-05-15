package Buoi9_lab7;

import Buoi9_lab7.entities.Bill;
import Buoi9_lab7.entities.Customer;
import Buoi9_lab7.view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        List<Bill> bills = new ArrayList<>();
        Menu menu = new Menu();
        do {
            menu.displayMenu(scanner,customers,bills);
        }
        while (true);
    }
}

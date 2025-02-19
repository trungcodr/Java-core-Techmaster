package Buoi8_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten doi 1: ");
        Team t1 = new Team(scanner.nextLine());
        for (int i = 0; i< 5;i++){
            System.out.println("Nhap ten tuong " + (i+1) + ": ");
            String nameCham = scanner.nextLine();
            System.out.println("Nhap vi tri " +  (i+1) + ": ");
            String position = scanner.nextLine();
            t1.addChampion(new Champion(nameCham,position));
        }


        System.out.println("Nhap ten doi 2: ");
        Team t2 = new Team(scanner.nextLine());
        for (int i = 0; i< 5;i++){
            System.out.println("Nhap ten tuong " + (i+1) + ": ");
            String nameCham = scanner.nextLine();
            System.out.println("Nhap vi tri " +  (i+1) + ": ");
            String position = scanner.nextLine();
            t2.addChampion(new Champion(nameCham,position));
        }

        // Input for match start time
        System.out.print("Enter the match start time: ");
        String startTime = scanner.nextLine();

        // Create and display match
        SummonRift match = new SummonRift(t1,t2, startTime);
        System.out.println("--- Match Information ---");
        match.display();
    }
}

package Buoi8_2;

import Buoi8.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<HouseHold> houseHoldList= new ArrayList<>();

        System.out.println("Nhap so luong ho dan: ");
        int numHouseHold = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i< numHouseHold;i++){
            System.out.println("Nhap thong tin cho ho dan thu " + (i+1)+": ");
            System.out.println("Moi ban nhap ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Moi ban nhap so nha: ");
            int numHouse = Integer.parseInt(scanner.nextLine());

            HouseHold houseHold = new HouseHold(id,numHouse);

            System.out.println("Nhap so luong thanh vien trong mot ho dan: ");
            int numMember = Integer.parseInt(scanner.nextLine());
            for (int j = 0;j<numMember;j++){
                System.out.println("Moi ban nhap ho va ten: ");
                String name = scanner.nextLine();
                System.out.println("Moi ban nhap ngay sinh(YYYY-MM-DD): ");
                String birthDay = scanner.nextLine();
                System.out.println("Moi ban nhap nghe ngiep: ");
                String job = scanner.nextLine();

                Person person = new Person(name,birthDay,job);
                houseHold.addMember(person);
            }
            houseHoldList.add(houseHold);
        }
        //In thong tin
        for (HouseHold houseHold : houseHoldList){
            System.out.println(houseHold);
        }
    }
}

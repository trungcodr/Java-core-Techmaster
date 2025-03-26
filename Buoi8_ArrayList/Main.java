package Buoi8_ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
//        arrayList.remove(0);
        Collections.sort(arrayList);
        System.out.println(arrayList);
//        System.out.println("Phan tu thu hai: " +arrayList.get(1));
        List<String> list = new ArrayList<>(Arrays.asList("Trung","Nguyet"));
//        list.remove("Trung");
        System.out.println(list);
        //Cha = new Con

    }
}

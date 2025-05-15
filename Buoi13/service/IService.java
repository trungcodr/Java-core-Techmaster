package Buoi13.service;

import java.util.List;
import java.util.Scanner;

public interface IService <T>{
    T add(Scanner scanner);
    void delete(Scanner scanner, List<T> obj);
    void update(Scanner scanner, List<T> obj);

}

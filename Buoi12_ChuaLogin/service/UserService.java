package Buoi12_ChuaLogin.service;

import Buoi12_ChuaLogin.entities.User;

import java.util.List;
import java.util.Scanner;

public class UserService {
    public User login(Scanner scanner, List<User> users){
        System.out.println("Mời b nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Mời b nhập password: ");
        String password = scanner.nextLine();
        User user = findByUsernameAndPassword(username, password, users);
        if(user !=null){
            System.out.println("Login successful");
        } else {
            System.out.println("Login fail");
        }
        return user;
    }

    public User findByUsernameAndPassword(String username, String password, List<User> users){
        for (User user: users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }
}

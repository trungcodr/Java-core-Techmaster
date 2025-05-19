package Buoi12_ChuaLogin.view;

import Buoi12_ChuaLogin.entities.Product;
import Buoi12_ChuaLogin.entities.User;
import Buoi12_ChuaLogin.service.ProductService;
import Buoi12_ChuaLogin.service.UserService;
import Buoi12_ChuaLogin.utils.Constant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    UserService userService = new UserService();
    ProductService productService = new ProductService();
    public void displayMenu(Scanner scanner, ArrayList<User> users,List<Product> products) {
        System.out.println("1 - Đăng nhập\n" +
                "\n" +
                "2 - Đăng ký\n");
        System.out.println("Mời b chọn:");
        selectMenu(scanner, users,products);
    }

    public void selectMenu(Scanner scanner, ArrayList<User> users,List<Product>products) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                User user = userService.login(scanner, users);
                System.out.println(user);
                if (user != null) {
                    if (Constant.ROLE_ADMIN == user.getRole()) {
                        displayMenuForAdmin();
                    } else if (Constant.ROLE_CUSTOMER == user.getRole()) {
                        displayMenuForCustomer();
                    } else if (Constant.ROLE_SELLER == user.getRole()) {
                        displayMenuForSeller(scanner,products);
                    }
                }
                break;
            case 2:
                break;

        }
    }

    public void displayMenuPostLogin() {
        System.out.println("1 - Thay đổi username\n" +
                "\n" +
                "2 - Thay đổi email\n" +
                "\n" +
                "3 - Thay đổi mật khẩu\n" +
                "\n" +
                "4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                "\n" +
                "0 - Thoát chương trình\n");
        System.out.println("Mời b lựa chọn: ");
    }

    public void displayMenuForAdmin() {
        System.out.println("1- Thêm sản phẩm");
        System.out.println("2- Xóa sản phẩm");
    }

    public void displayMenuForCustomer() {
        System.out.println("1- Xem sản phẩm");
        System.out.println("2- xem chi tiet san pham: ");
        System.out.println("3- Tim kiem san pham theo khoang gia");
    }

    public void displayMenuForSeller(Scanner scanner,List<Product>products) {
        System.out.println("1- Xem danh sach san pham");
        System.out.println("2- Chinh sua thong tin gia san pham");
        System.out.println("3- Xoa san pham");
        System.out.println("Moi ban nhap lua chon: ");
        selectMenuForSeller(scanner,products);
    }

    public void selectMenuForSeller(Scanner scanner, List<Product> products) {
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                productService.createProduct(scanner,products);
                break;
            case 2:
                productService.editPriceProduct(scanner,products);
                break;
        }
    }
}

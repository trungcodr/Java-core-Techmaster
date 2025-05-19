package Buoi12_ChuaLogin.service;

import Buoi12_ChuaLogin.entities.Product;
import Buoi12_ChuaLogin.entities.User;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    public void createProduct(Scanner scanner, List<Product> products){
        System.out.println("Moi ban nhap ten san pham: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Moi ban nhap gia tien san pham: ");
        BigDecimal priceProduct = new BigDecimal(scanner.nextLine());
        Product product = new Product(nameProduct,priceProduct);
        products.add(product);
    }

    public void editPriceProduct(Scanner scanner,List<Product>products){
        System.out.println("Nhap ID san pham can chinh sua: ");
        int productId = Integer.parseInt(scanner.nextLine());
        Product product = findProductById(productId,products);
        if (product != null){
            System.out.println("Moi ban nhap gia moi: ");
            BigDecimal newPrice = new BigDecimal(scanner.nextLine());
            product.setPrice(newPrice);
            System.out.println("San pham da duoc cap nhat gia moi: " + product);
        } else {
            System.out.println("San pham khong ton tai");
        }
    }

    public Product findProductById(int id,List<Product> products){
        for (Product product : products){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }
}

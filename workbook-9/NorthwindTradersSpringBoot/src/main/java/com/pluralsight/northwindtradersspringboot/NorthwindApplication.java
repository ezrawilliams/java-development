package com.pluralsight.northwindtradersspringboot;

import com.pluralsight.northwindtradersspringboot.dao.ProductDAO;
import com.pluralsight.northwindtradersspringboot.dao.SimpleProductDAO;
import com.pluralsight.northwindtradersspringboot.model.Product;
import com.pluralsight.northwindtradersspringboot.service.JdbcProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class NorthwindApplication implements CommandLineRunner {

    @Autowired
   private ProductDAO simpleProductDAO;
    //private JdbcProductDAO simpleProductDAO;
    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. List Products");
        System.out.println("2. Add Products");
        System.out.println("3. Delete Product");
        System.out.println("4. Update Product");
        System.out.println("5. Search for Product");
        System.out.println("0. Exit");
        int option = scanner.nextInt();
        while (option != 0){
            switch (option){
                case 1:
                    System.out.println(simpleProductDAO.getAll());
                    break;
                case 2:
                    System.out.print("Product ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Product category: ");
                    String category = scanner.nextLine();
                    System.out.print("Product price: ");
                    double price = scanner.nextDouble();
                    Product product = new Product(id, name, category, price);
                    simpleProductDAO.add(product);
                    System.out.println(simpleProductDAO.getAll());
                    break;
                case 3:
                    System.out.print("What is the id of the product you would like to delete? ");
                    int id2 = scanner.nextInt();
                    simpleProductDAO.delete(id2);
                    break;
                case 4:
                    Product product1 = new Product(2, "Chang2","Beverages",20.00);
                    simpleProductDAO.update(product1);
                    System.out.println(simpleProductDAO.getAll());
                    break;
                case 5:
                    System.out.print("What is the id of the product you would like to search for? ");
                    int id3 = scanner.nextInt();
                    System.out.println(simpleProductDAO.search(id3));
                    break;
            }
            System.out.println("Do you want to go again? 1, 2, 3, 4, 5 or 0 to exit");
            option = scanner.nextInt();
        }

    }
}

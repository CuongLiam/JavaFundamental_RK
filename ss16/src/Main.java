import classes.ElectronicProduct;
import classes.FoodProduct;
import classes.Product;
import classes.ProductRepository;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E01", "Laptop", 20000000, 24));
        repo.add(new ElectronicProduct("E02", "Smart TV", 15000000, 12));

        repo.add(new FoodProduct("F01", "Milk", 30000, 10));
        repo.add(new FoodProduct("F02", "Bread", 20000, 5));

        System.out.println("=== PRODUCT LIST ===");

        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Final Price: " + p.calculateFinalPrice());
            System.out.println("---------------------");
        }

        System.out.println("=== FIND PRODUCT BY ID ===");
        Product found = repo.findById("E01");

        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Product not found");
        }

        System.out.println("=== SORT BY PRICE ASC ===");

        List<Product> list = repo.findAll();

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        for (Product p : list) {
            p.displayInfo();
            System.out.println("Final Price: " + p.calculateFinalPrice());
        }

        System.out.println("=== STATISTICS ===");

        Map<String, Integer> stats = new HashMap<>();

        for (Product p : list) {
            String type;

            if (p instanceof ElectronicProduct) {
                type = "Electronic";
            } else if (p instanceof FoodProduct) {
                type = "Food";
            } else {
                type = "Other";
            }

            stats.put(type, stats.getOrDefault(type, 0) + 1);
        }

        System.out.println(stats);
    }
}
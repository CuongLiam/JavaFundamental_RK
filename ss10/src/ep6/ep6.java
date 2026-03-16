package ep6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ep6 {
    public class Product {
        protected String productName;
        protected double price;

        public Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product: " + productName + ", Price: " + price;
        }
    }

    @SuppressWarnings("Convert2Lambda")
    public static void ep6Main() {
        ep6 ep6 = new ep6();
        List<Product> products = new ArrayList<>();
        products.add(ep6.new Product("Laptop", 150.0));
        products.add(ep6.new Product("Mouse", 200.0));
        products.add(ep6.new Product("Keyboard", 5000.0));

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("San pham duoc sap xep theo gia tang dan:");
        for (Product product : products) {
            System.out.println(product);
        }

        products.sort((p1, p2) -> p1.productName.compareTo(p2.productName));
        System.out.println("San pham duoc sap xep theo ten tang dan (lambda expression):");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

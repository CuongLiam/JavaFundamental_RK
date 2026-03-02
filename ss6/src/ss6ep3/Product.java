package ss6ep3;

public class Product {
    private final String productID;
    private final String productName;
    private double price;

    public Product(String productID, String productName, double price) {
        this.productID = productID;
        this.productName = productName;
        setPrice(price);
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Gia khong hop le. Gia tri phai lon hon 0!");
            this.price = 0;
        }
    }

    public void displayInfo() {
        System.out.println("Ma san pham: " + productID);
        System.out.println("Ten san pham: " + productName);
        System.out.printf("Gia san pham: %.2f%n", price);
        System.out.println();
    }
}
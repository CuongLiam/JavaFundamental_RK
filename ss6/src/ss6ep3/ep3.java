package ss6ep3;

public class ep3 {
    public static void ep3Main(){
        Product product = new Product("P001", "Laptop Dell", 1500.0);
        product.displayInfo();

        product.setPrice(-500.0);
        product.displayInfo();

        product.setPrice(1200.0);
        product.displayInfo();
    }
}

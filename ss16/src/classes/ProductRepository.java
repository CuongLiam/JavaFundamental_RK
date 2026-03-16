package classes;

import types.interfaces;

import java.util.*;

public class ProductRepository implements interfaces.IRepository<Product> {

    private List<Product> products = new ArrayList<>();
    private Map<String, Product> productMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || productMap.containsKey(item.getId())) {
            return false;
        }
        products.add(item);
        productMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        Product p = productMap.remove(id);
        if (p == null) {
            return false;
        }
        products.remove(p);


        return true;
    }

    @Override
    public Product findById(String id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}

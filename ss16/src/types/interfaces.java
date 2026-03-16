package types;

import java.awt.*;
import java.util.List;


public class interfaces {


    public interface IRepository<T> {
        boolean add(T item);
        boolean removeById(String id);
        T findById(String id);
        List<T> findAll();
    }
}

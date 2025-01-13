package Lab5.Q4;

import java.util.Comparator;

public class OrderByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getProductPrice() - o1.getProductPrice());
    }
}

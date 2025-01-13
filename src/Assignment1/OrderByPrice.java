package Assignment1;

import java.util.Comparator;

public class OrderByPrice implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return (int) (o2.getPrice() - o1.getPrice());
    }
}

package Lab5.Q4;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProductApp {
    public static void main(String[] args) {
        Queue<Product> queue = new PriorityQueue<Product>(new OrderByPrice());
        queue.offer(new Product(1,"Cricket Bat", 100));
        queue.offer(new Product(2,"Cricket Ball", 110));
        queue.offer(new Product(3,"Cricket Gloves", 120));
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

package Assignment1;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private List<Item> itemList = new ArrayList<Item>();

    public Inventory(String filePath){
        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                String itemId = tokens[0];
                int quantity = Integer.parseInt(tokens[1]);
                double price = Double.parseDouble(tokens[2]);
                Item item = new Item(itemId, quantity, price);
                this.itemList.add(item);
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }

    public void display() {
        for(Item it : itemList)
            System.out.println(it);
    }

    public void sort() {
        Collections.sort(itemList);
    }

    public void sortViaPrice() {
        itemList.sort(new OrderByPrice());
    }
}

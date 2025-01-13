package Assignment1;

public class InventoryApp {
    public static void main(String[] args) {
        Inventory inventory = new Inventory("inventory.txt");
//        unsorted
        System.out.println("Original order of items.");
        inventory.display();
//        sorted via the names
        inventory.sort();
        System.out.println("After sorting");
        inventory.display();
//        sorted via price
        System.out.println("Sorting via price");
        inventory.sortViaPrice();
        inventory.display();
    }
}

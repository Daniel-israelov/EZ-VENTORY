package src.ezVentory;

import java.util.LinkedList;
import java.util.List;

public class Supplier {
    private String name;
    private int id;
    private List<Item> items = new LinkedList<>();

    public Supplier(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Assigning an item to a certain supplier.
     * Before adding it to the current supplier items list, the method runs a for loop
     * to check if the item is not being supplied by other supplier.
     * @param itemToAdd - The item to be assigned to the current supplier
     * @param store - Holds the list of all suppliers and their items
     * @return boolean.
     */
    public boolean addItem(Item itemToAdd, Store store) {
        for (Supplier supplier : store.suppliers) {
            if (supplier.items.contains(itemToAdd))
                return false; //ToDo --> add some error message
        }
        items.add(itemToAdd);
        return true;
    }

    /**
     * Removing item from the list of items being supplied by the current supplier.
     * First, checking if the item is assigned to the current supplier.
     * If yes -> remove the item.
     * @param itemToRemove - The item we wish to remove
     * @return boolean.
     */
    public boolean removeItem(Item itemToRemove){
        if(items.contains(itemToRemove)){
            items.remove(itemToRemove);
            return true;
        }
        return false;
    }
}

package src.ezVentory;

import java.util.LinkedList;
import java.util.List;

public class Supplier {
    private String name;
    private int id;
    private List<Item> items = new LinkedList<>();

    public Supplier(String name, int id) {
        setName(name);
        setId(id);
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
     * Iterating through each supplier items list to check if the item
     * already exist on the database of all items.
     * @param itemToAdd - The item to be assigned to the current supplier
     * @param store - Holds the list of all suppliers and their items
     * @return true - if item added to list, else - false.
     */
    public boolean addItem(Item itemToAdd, Store store) {
        for (Supplier supplier : store.suppliers) {
            for (Item item: supplier.items){ //iterating through all items of each supplier
                if(item.getBarCode().equals(itemToAdd.getBarCode()))
                    return false;
            }
        }
        items.add(itemToAdd);
        return true;
        //ToDo --> add action message
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
        //ToDo --> add action message
    }
}

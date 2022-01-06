package src.ezVentory;

import java.util.LinkedList;
import java.util.List;

public class Supplier {
    private String name;
    private int id;
    private final List<Item> items = new LinkedList<>();

    public Supplier(String name, int id) {
        setName(name);
        setId(id);
    }

    public List<Item> getItems() {
        return items;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Iterating through each supplier items list to check if the item
     * already exist on the database of all items.
     * (same item can't be supplied by more than 1 supplier).
     * @param itemToAdd - The item to be assigned to the current supplier
     * @param store - Holds the list of all suppliers and their items
     * @return true - if item added to list, else - false.
     */
    public boolean addItem(Item itemToAdd, Store store) {
        List<Supplier> allSupplier = store.getSuppliers();

        for(Supplier sup : allSupplier){
            for(Item it : sup.getItems())
                if(it.equals(itemToAdd))
                    return false;
        }
        this.items.add(itemToAdd);
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
        for(Item it: this.items){
            if(it.equals(itemToRemove)){
                items.remove(it);
                return true;
            }
        }
        return false;
        //ToDo --> add action message
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(!(obj instanceof Supplier)) return false;

        return this.id == ((Supplier) obj).id;
    }
}

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
    //adding item to the list of items of the current supplier
    public boolean addItem(Item itemToAdd){
        if(!items.contains(itemToAdd)){
            items.add(itemToAdd);
            return true;
        }
        return false;
    }
    //removing item from list
    public boolean removeItem(Item itemToRemove){
        if(items.contains(itemToRemove)){
            items.remove(itemToRemove);
            return true;
        }
        return false;
    }
}

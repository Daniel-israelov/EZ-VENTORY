package src.ezVentory;

import java.util.LinkedList;
import java.util.List;

public class OnSale {
    //ToDo --> Find a way to update this list from 'Item' class (observer ?)
    private final List<Item> items = new LinkedList<>();

    /**
     * Adding new item to list of items on sale
     * @param item - item to be added to the list of items on sale
     * @return true - if item added, else - false
     */
    public boolean addItem(Item  item){
        if(!item.getIsOnSale()) return false;

        for(Item it : items){
            if(it.equals(item))
                return false;
        }
        items.add(item);
        return true;
    }
    public boolean removeItem(Item item){
        for(Item it : items){
            if(it.equals(item)) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }
    public List<Item> getItems() {
        return this.items;
    }
}

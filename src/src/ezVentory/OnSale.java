package src.ezVentory;

import java.util.LinkedList;
import java.util.List;

public class OnSale {
    private final List<Item> items = new LinkedList<>();
    private double salePrice;

    /**
     * Adding new item to list of items on sale
     * @param item - item to be added to the list of items on sale
     * @return true - if item added, else - false
     */
    public boolean addItem(Item  item){
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

    public void setSalePrice(double salePrice){
        this.salePrice = salePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public List<Item> getItems() {
        return items;
    }
}

package src.ezVentory;

import java.util.LinkedList;
import java.util.List;

public class OnSale {
    private List<Item> items = new LinkedList<>();
    private double salePrice;

    public OnSale(double salePrice) {
        setSalePrice(salePrice);
    }

    /**
     * This method is called whenever the user wishes to add an item to the list
     * of items on sale. Before adding the item, the method checks if the item
     * is already on the list.
     * @param item - some item to add.
     * @return true/false
     */
    public boolean addItem(Item item){
        if(!items.contains(item) && item.isOnSale()){
            items.add(item);
            return true;
        }
        return false;
    }

    /**
     * This method is called whenever the user wishes to remove an item from the list
     * of items on sale. Before removing it, the method checks if the item
     * is already on the list.
     * @param item - some item to remove.
     * @return true/false
     */
    public boolean removeItem(Item item){
        if(items.contains(item)){
            items.remove(item);
            return true;
        }
        return false;
    }
    public void setSalePrice(double salePrice){
        this.salePrice = salePrice;
    }
    public double getSalePrice() {
        return salePrice;
    }
    public List<Item> getItemsList(){
        return items;
    }
}

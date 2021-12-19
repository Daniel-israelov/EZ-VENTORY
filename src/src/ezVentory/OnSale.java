package src.ezVentory;

import java.util.LinkedList;
import java.util.List;

public class OnSale {
    private List<Item> items = new LinkedList<>();
    private double salePrice;

    public OnSale(double salePrice) {
        this.salePrice = salePrice;
    }

    //adding an item to sale list
    public boolean addItem(Item item){
        if(!items.contains(item)){ // checking if item already on sale before adding it
            items.add(item);
            return true;
        }
        return false; //indicates that the item is already on the list
    }
    //removing item from sale list
    public boolean removeItem(Item item){
        if(items.contains(item)){
            items.remove(item);
            return true;
        }
        return false; //indicates that the item is not on the list, hence not on sale
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

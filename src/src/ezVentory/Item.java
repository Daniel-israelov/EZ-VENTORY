package src.ezVentory;

public class Item {
    private String name;
    private String barCode;
    private double costPrice;
    private double sellPrice;
    private int inventoryAmount;
    private boolean isOnSale;

    public Item(String name, String barCode, double costPrice, double sellPrice, int inventoryAmount, boolean isOnSale) {
        this.name = name;
        this.barCode = barCode;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.inventoryAmount = inventoryAmount;
        this.isOnSale = isOnSale;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBarCode() {
        return barCode;
    }
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
    public double getCostPrice() {
        return costPrice;
    }
    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }
    public double getSellPrice() {
        return sellPrice;
    }
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
    public int getInventoryAmount() {
        return inventoryAmount;
    }
    public void setInventoryAmount(int inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }
    public boolean isOnSale() {
        return isOnSale;
    }
    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }
}

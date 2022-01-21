package src.ezVentory;

public class Item {
    private String name;
    private String barcode;
    private double costPrice;
    private double sellPrice;
    private int inventoryAmount;
    private boolean isOnSale;
    private String depName;
    private double salePrice;

    public Item(String name, String barcode, double costPrice, double sellPrice) {
        this.name = name;
        this.barcode = barcode;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.depName = depName;
        setInventoryAmount(0);
        setOnSale(false);
        setSalePrice(0);
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getBarcode() {

        return barcode;
    }
    public void setBarcode(String barcode) {

        this.barcode = barcode;
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
    public boolean getIsOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;

    }

    public void setSalePrice(double salePrice){
        if(this.getIsOnSale())
            this.salePrice = salePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(!(obj instanceof Item i)) return false;

        return this.barcode.equals(i.getBarcode());
    }
    public String getDepName() {
        return depName;
    }
    public void setDepName(String depName) {
        this.depName = depName;
    }
    public void addToSaleList(){
        if(this.isOnSale)
            OnSale.getInstance().addItem(this);
    }

    public Item(String name, String barcode, double costPrice, double sellPrice, int inventoryAmount, boolean isOnSale, String depName) {
        setName(name);
        setBarcode(barcode);
        setCostPrice(costPrice);
        setSellPrice(sellPrice);
        setInventoryAmount(inventoryAmount);
        setOnSale(isOnSale);
        setDepName(depName);
    }
}

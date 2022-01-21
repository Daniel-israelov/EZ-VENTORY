package src.ezVentory;



public class MainProgram {
    public static void main(String[] args) {
        Store myStore = Store.getInstance();
        Department drinks = new Department("Drinks", 1);
        Department food = new Department("Food", 2);
        myStore.addDepartment(drinks);
        myStore.addDepartment(food);

        Supplier cola = new Supplier("Coca Cola", 777);
        Item item1 = new Item("Cola", "123", 3.29, 4.9, 15, false, "Drinks");
        Item item2 = new Item("Fanta", "456", 3.29, 4.9, 15, false, "Drinks");
        Item item3 = new Item("Sprite", "789", 3.29, 4.9, 15, false, "Drinks");
        Item item4 = new Item("Bebsi", "321", 3.29, 4.9, 15, false, "Drinks");

        cola.addItem(item1);
        cola.addItem(item2);
        cola.addItem(item3);
        cola.addItem(item4);

        Supplier osem = new Supplier("Osem", 1234);
        Item item5 = new Item("Bamba", "159", 3.29, 4.9, 15, false, "Food");
        Item item6 = new Item("Bisli", "951", 3.29, 4.9, 15, true, "Food");
        Item item7 = new Item("Pasta", "753", 3.29, 4.9, 15, true, "Food");
        Item item8 = new Item("Doritos", "357", 3.29, 4.9, 15, false, "Food");

        osem.addItem(item5);
        osem.addItem(item6);
        osem.addItem(item7);
        osem.addItem(item8);

        myStore.addSupplier(cola);
        myStore.addSupplier(osem);

/*        SuppMngr sm = new SuppMngr();
        sm.setVisible(true);*/

/*        ItemMaker im = new ItemMaker();
        im.setVisible(true);*/

        ItemsTable it = new ItemsTable();
        it.setVisible(true);
    }
}

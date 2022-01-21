package src.ezVentory;


import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        Store myStore = Store.getInstance();
        Department drinks = new Department("Drinks", 1);
        Department food = new Department("Food", 2);
        Department toilets = new Department("Toilets", 3);
        Department homeCln = new Department("Home cleaning", 4);
        myStore.addDepartment(drinks);
        myStore.addDepartment(food);
        myStore.addDepartment(toilets);
        myStore.addDepartment(homeCln);

        Supplier cola = new Supplier("Coca Cola", 777);
        Item item1 = new Item("Cola", "123", 3.29, 4.9, 15, false, "Drinks");
        Item item2 = new Item("Fanta", "456", 3.29, 4.9, 23, false, "Drinks");
        Item item3 = new Item("Sprite", "789", 3.29, 4.9, 54, false, "Drinks");
        Item item4 = new Item("Cola Zero", "321", 3.29, 4.9, 61, false, "Drinks");

        cola.addItem(item1);
        cola.addItem(item2);
        cola.addItem(item3);
        cola.addItem(item4);

        Supplier osem = new Supplier("Osem", 1234);
        Item item5 = new Item("Bamba", "159", 2.43, 5.9, 103, false, "Food");
        Item item6 = new Item("Bisli", "951", 2.67, 6.9, 75, true, "Food");
        Item item7 = new Item("Pasta", "753", 4.50, 13.9, 57, true, "Food");
        Item item8 = new Item("Doritos", "357", 3.29, 4.9, 23, false, "Food");

        item6.setSalePrice(3.9);
        item7.setSalePrice(8.90);

        osem.addItem(item5);
        osem.addItem(item6);
        osem.addItem(item7);
        osem.addItem(item8);

        Supplier sano = new Supplier("Sano", 753);
        Item item9 = new Item("Sano Soft", "111", 12.43, 29.90, 45, true, "Toilets");
        Item item10 = new Item("Wet wipes", "222", 6.23, 10.90, 61, false, "Toilets");
        Item item11 = new Item("Anti calk", "333", 8.45, 15.9, 19, true, "Home cleaning");

        sano.addItem(item9);
        sano.addItem(item10);
        sano.addItem(item11);

        myStore.addSupplier(sano);
        myStore.addSupplier(cola);
        myStore.addSupplier(osem);

        HashMap<String, String> ui = new HashMap<>();
        ui.put("852", "123456789");
        LoginPage lgs = new LoginPage(ui);


        SuppMngr sm = new SuppMngr();
        sm.setVisible(true);

        ItemMaker ic = new ItemMaker();
        ic.setVisible(true);

        ItemsTable is = new ItemsTable();
        is.setVisible(true);
    }
}
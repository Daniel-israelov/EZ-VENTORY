package src.ezVentory;

public class Cashier extends Staff{
    public Cashier(String firstName, String lastName, String id, String password, int accessType, String roleName) {
        super(firstName, lastName, id, password, accessType, roleName);
    }


/*
    public boolean addItemToSoldList(Supplier sup ){
        for (Supplier supplier : store.getSuppliers()) {
            if (supplier.equals(sup)) {
                store.removeSupplier(supplier);
                return true;
            }
        }
        return false;
    }

 */

}
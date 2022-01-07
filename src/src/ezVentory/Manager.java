package src.ezVentory;

public class Manager extends Staff {
    public Store store;

    public Manager(String firstName, String lastName, String id, String password, int accessType) {
        super(firstName, lastName, id, password, accessType);
    }

    public void createOrder() {

    }

    public void addEmployee() {

    }

    public void removeOrder( ){

    }


    public boolean removeSupplier(Supplier sup ){
        for (Supplier supplier : store.getSuppliers()) {
            if (supplier.equals(sup)) {
                store.removeSupplier(supplier);
                return true;
            }
        }
        return false;

    }

    public boolean removeEmployee(Employee emp) {
        for (Employee employee : store.getEmployees()) {
            if (employee.equals(emp)) {
                store.removeEmployee(employee);
                return true;
            }
        }
        return false;
    }


}




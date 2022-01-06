package src.ezVentory;

public class EmployeeFactory {
    public Employee getEmployee(String employeeType){
        if(employeeType == null)
            return null;

        if(employeeType.equalsIgnoreCase("STAFF"))
            return new Staff();

        if(employeeType.equalsIgnoreCase("STORE MANAGER"))
            return new Manager();

        if(employeeType.equalsIgnoreCase("SHIFT MANAGER"))
            return new ShiftManager();

        if(employeeType.equalsIgnoreCase("STORAGE MANAGER"))
            return new StorageManager();

        if(employeeType.equalsIgnoreCase("STORE KEEPER"))
            return new StoreKeeper();

        if(employeeType.equalsIgnoreCase("CASHIER"))
            return new Cashier();

        return null;
    }
}

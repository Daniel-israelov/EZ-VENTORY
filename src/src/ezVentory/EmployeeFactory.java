package src.ezVentory;

import java.util.Scanner;

public class EmployeeFactory {
    public Employee getEmployee(String employeeType){
        if(employeeType == null)
            return null;

        Scanner sc = new Scanner(System.in);
        String firstName, lastName, id, password, roleName;
        int accessType;

        firstName = sc.next();
        lastName = sc.next();
        id = sc.next();
        password = sc.next();
        accessType = sc.nextInt();
        roleName = sc.next();

        if(employeeType.equalsIgnoreCase("STAFF"))
            return new Staff(firstName, lastName, id, password, accessType, roleName);


        if(employeeType.equalsIgnoreCase("STORE MANAGER"))
            return new Manager(firstName, lastName, id, password, accessType, roleName);

/*        if(employeeType.equalsIgnoreCase("SHIFT MANAGER"))
            return new ShiftManager();

        if(employeeType.equalsIgnoreCase("STORAGE MANAGER"))
            return new StorageManager();

        if(employeeType.equalsIgnoreCase("STORE KEEPER"))
            return new StoreKeeper();
*/

        if(employeeType.equalsIgnoreCase("CASHIER"))
            return new Cashier(firstName, lastName, id, password, accessType, roleName);

        return null;
    }
}

package src.ezVentory;

public class Manager extends Staff{
    public Store store;
    public Manager(String firstName, String lastName, String id, String password, int accessType) {
        super(firstName, lastName, id, password, accessType);
    }

    public void createOrder(){

    }

    public void addEmployee(){

    }

    public boolean removeEmployee(Employee emp){
        for(Employee employee : store.getEmployees() ){
            if(employee.equals(emp)){
                store.removeEmployee(employee);
                return true;
            }
        }
        return false;
    }







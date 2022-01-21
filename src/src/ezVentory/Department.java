package src.ezVentory;

import java.util.LinkedList;
import java.util.List;

public class Department {
    private String name;
    private int id;
    private final List<Item> items = new LinkedList<>();


    public Department(String name, int id) {
        setName(name);
        setId(id);
    }

    public List<Item> getItemsList(){
        return items;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Iterating through each department items list to check if the item
     * already exist on the database of all items.
     * @param addToDep - The item to be assigned to the current department
     * @return true - if item added to list, else - false.
     */

    public boolean addItem(Item addToDep) {
        List<Department> allDepartments = Store.getInstance().getDepartments();
        for(Department dep : allDepartments){
            for(Item item : dep.getItemsList())
                if(item.equals(addToDep))
                    return false;
        }
        this.items.add(addToDep);
        return true;
    }

    /**
     * Removing item from the list of items of the current department.
     * @param removeFromDep - The item we wish to remove from current department.
     * @return boolean.
     */

    public boolean removeItem(Item removeFromDep){
        for(Item item: this.items){
            if(item.equals(removeFromDep))
                items.remove(item);
                return true;
        }
        return false;
    }


}
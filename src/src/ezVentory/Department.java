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

    public boolean addItem(Item addToDep, Store store) {
        List<Department> allDepartments = store.getDepartments();
        for(Department dep : allDepartments){
            for(Item it : dep.getItemsList())
                if(it.equals(addToDep))
                    return false;
        }
        this.items.add(addToDep);
        return true;
    }

    // removing item from department

    public boolean removeItem(Item removeFromDep){
        for(Item it: this.items){
            if(it.equals(removeFromDep))
                return false;
        }
        this.items.add(removeFromDep);
        return true;
    }


}
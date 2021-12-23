package FirstTest;
import java.util.LinkedList;
import java.util.List;

public class department {
    private String name;
    private int id;
    List<Item> items = new LinkedList<>();


    public department(String name, int id) {
        this.name = name;
        this.id = id;
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

    public boolean addItem(Item addToDep) {
        if (!items.contains(addToDep)) { // checking if item already in the department
            items.add(addToDep);
            return true;
        }
        return false;
    }
    // removing item from department
    public boolean removeItem(Item removeFromDep){
        if(items.contains(removeFromDep)){
            items.remove(removeFromDep);
            return true;
        }
        return false;
    }
    public List<Item> getItemsList(){
        return items;
    }



}
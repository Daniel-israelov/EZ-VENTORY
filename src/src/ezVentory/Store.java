package src.ezVentory;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store {
    private String name;
    private List<Employee> employees = new LinkedList<>();
    private List<BuisnessDay> openHrs = new ArrayList<>();
    private List<Department> departments = new LinkedList<>();
    private List<Supplier> suppliers = new LinkedList<>();
    private Economics economic;
    private Report report;

    //
    public boolean addDepartment(Department department) {
        if(!this.departments.contains(department))
        {
            this.departments.add(department);
            return true;
        }
        return false;
    }

    public boolean removeDepartment(Department department)
    {
        if(this.departments.contains(department))
        {
            this.departments.remove(department);
            return true;
        }
        return false;
    }

    public boolean changeHrs(String open, String close)
    {
        this.openHrs.setOpenHr(open);
        this.openHrs.setCloseHr(close);
    }
}

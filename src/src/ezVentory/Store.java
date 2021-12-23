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


    public Store(String name)
    {
        this.name = name;
    }

    /**
     * add department to Department list
     * @param department
     * @return True if added or False if it doesn't exist
     */
    public boolean addDepartment(Department department) {
        if(!this.departments.contains(department)) // received Department and checking if the class exists or needs to change to an object?
        {
            this.departments.add(department);
            return true;
        }
        return false;
    }

    /**
     * remove department from the department list
     * @param department
     * @return True if removed or False if department does not exist
     */
    public boolean removeDepartment(Department department)
    {
        if(this.departments.contains(department))
        {
            this.departments.remove(department);
            return true;
        }
        return false;
    }

    /**
     * send to BusinessDay methods to set the open and close hours
     * @param open
     * @param close
     */
    public void changeHrs(String open, String close)
    {
          this.openHrs.setOpenHr(open);
          this.openHrs.setCloseHr(close);
    }

    /**
     * remove day from store
     * @param day
     * @return True if removed and False if employee doesn't exist
     */
    public void removeDay(String day)
    {
        for(BusinessDay bDay : openHrs){
            if(bDay.getDay().equals(day)) {
                openHrs.remove(bDay);
                return true;
            }
        }
        return false;
    }

    /**
     * add employee to the store list
     * @param employee
     * @return True if added and False if employee already exists
     */
    public boolean addEmployee(Employee employee) {
        if(!this.departments.contains(department))
        {
            this.departments.add(department);
            return true;
        }
        return false;
    }

    /**
     * remove Employee from the store list
     * @param employee
     * @return True if removed and False if employee does not exist
     */
    public boolean removeEmployee(Employee employee)
    {
        if(this.Employee.contains(employee))
        {
            this.Employee.remove(employee);
            return true;
        }
        return false;
    }

    /**
     * add department to the department list
     * @param supplier
     * @return True if added and False if already exists
     */
    public boolean addSupplier(Supplier supplier) {
        if(!this.supplier.contains(supplier))
        {
            this.supplier.add(supplier);
            return true;
        }
        return false;
    }

    /**
     * remove Supplier from the store list
     * @param supplier
     * @return True if removed and False if supplier does not exist
     */
    public boolean removeSupplier(Supplier supplier)
    {
        if(this.supplier.contains(supplier))
        {
            this.supplier.remove(supplier);
            return true;
        }
        return false;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @param report
     * @return daily report from the Report class
     */
    public Report getReport(Report report)
    {
        return report.dailyReport();
    }
}

package src.ezVentory;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store {
    private String name;
    private final List<Employee> employees = new LinkedList<>();
    private final List<BusinessDay> openHrs = new ArrayList<>();
    private final List<Department> departments = new LinkedList<>();
    private final List<Supplier> suppliers = new LinkedList<>();
    private Economics economic;
    private Report report;

    /**
     * public Store(String name);
     * public void setName(String name);
     * public String getName();
     * public List<Employee> getEmployees();
     * public List<BusinessDay> getOpenHrs();
     * public List<Department> getDepartments();
     * public List<Supplier> getSuppliers();
     * public Economics getEconomic();
     * public Report getReport();
     * public boolean addDepartment(Department department);
     * public boolean removeDepartment(Department department)
     * public void changeHrs(String open, String close);
     * public boolean removeDay(String day);
     * public boolean addEmployee(Employee employee) ;
     * public boolean removeEmployee(Employee employee);
     * public boolean addSupplier(Supplier supplier);
     * public boolean removeSupplier(Supplier supplier);
     * public Report getReport(Report report);
     * public boolean addDay(String day);
     */

    public Store(String name)
    {
        setName(name);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public List<Employee> getEmployees()
    {
        return employees;
    }

    public List<BusinessDay> getOpenHrs()
    {
        return openHrs;
    }

    public List<Department> getDepartments()
    {
        return departments;
    }

    public List<Supplier> getSuppliers()
    {
        return suppliers;
    }

    public Economics getEconomic()
    {
        return economic;
    }

    public Report getReport()
    {
        return report;
    }

    /**
     * add department to Department list
     * @param department
     * @return True if added or False if it doesn't exist
     */
    public boolean addDepartment(Department department)
    {
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
     * remove day from store
     * @param day
     * @return True if removed and False if not exists
     */
    public boolean removeDay(String day)
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
    public boolean addEmployee(Employee employee)
    {
        for(Employee emp : employees){
            if(emp.equals(employee))
                return false;
        }
        employees.add(employee);
        return true;
    }

    /**
     * remove Employee from the store list
     * @param employee
     * @return True if removed and False if employee does not exist
     */
    public boolean removeEmployee(Employee employee)
    {
        return employees.remove(employee); // need to check if the employee removed because the equals not recognize different addresses
    }

    /**
     * add department to the department list
     * @param supplier
     * @return True if added and False if already exists
     */
    public boolean addSupplier(Supplier supplier)
    {
        if(!this.suppliers.contains(supplier))
        {
            this.suppliers.add(supplier);
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
        if(this.suppliers.contains(supplier))
        {
            this.suppliers.remove(supplier);
            return true;
        }
        return false;
    }

    /**
     * @param report
     * @return daily report from the Report class
     */
    public Report getReport(Report report)
    {
        return report;
    }

    /**
     *  add day to store
     *  @param day
     *  @return True if added and False if exists
     */
    public boolean addDay(BusinessDay day)
    {
        for(BusinessDay bDay : openHrs){
            if(bDay.getDay().equals(day.getDay())) {
                return false;
            }
        }
        openHrs.add(day);
        return true;
    }
}

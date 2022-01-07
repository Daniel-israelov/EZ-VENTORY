package src.ezVentory;

public class Staff extends Employee{
    protected String roleName;

    public Staff(String firstName, String lastName, String id, String password, int accessType, String roleName) {
        super(firstName, lastName, id, password, accessType);
        setRoleName(roleName);
    }

    public Staff(String firstName, String lastName, String id, String password, int accessType) {
        super();
    }

    @Override
    public int getAccessType() {
        return this.accessType;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }



}

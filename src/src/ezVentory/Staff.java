package src.ezVentory;

public class Staff extends Employee{
    public Staff(String firstName, String lastName, String id, String password, int accessType) {
        super(firstName, lastName, id, password, accessType);
    }

    @Override
    public int getAccessType() {
        return this.accessType;
    }
    protected String roleName;

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }



}

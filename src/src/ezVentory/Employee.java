package src.ezVentory;

public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected String id;
    protected String password;
    protected int accessType;

    public Employee(String firstName, String lastName, String id, String password, int accessType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.password = password;
        this.accessType = accessType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public abstract int getAccessType();

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;//checking if the obj is equals to the obj that called to the function
        if(!(obj instanceof Employee))return false;//checking if the obj is employee and nothing else
        return this.id.equals(((Employee) obj).getId());//checking if the Id matches
    }
}


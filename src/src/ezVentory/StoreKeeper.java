package src.ezVentory;

public class StoreKeeper extends Staff implements Person{
    public StoreKeeper(String firstName, String lastName, String id, String password, int accessType, String roleName) {
        super(firstName, lastName, id, password, accessType, roleName);
    }
}

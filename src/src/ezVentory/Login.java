package src.ezVentory;

import java.util.HashMap;

public class Login {

    Store store;

    private int systemMode;

    public void setSystemMode(int systemMode) {
        this.systemMode = systemMode;
    }

    public boolean validation(Employee emp){
        for(Employee employee:store.getEmployees()){
            if(employee.equals(emp)){
                setSystemMode(emp.getAccessType());
                return true;
            }
        }
        return false;
    }


    /*
     HashMap<String,String> loginInfo = new HashMap<String,String>();
    Login(){
        loginInfo.put("admin","123");

    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }

     */
}

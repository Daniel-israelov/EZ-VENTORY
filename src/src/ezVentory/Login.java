package src.ezVentory;

import java.util.HashMap;

public class Login {
    HashMap<String,String> loginInfo = new HashMap<String,String>();
    Login(){
        loginInfo.put("employee1","123");
        loginInfo.put("employee2","1234");
        loginInfo.put("employee3","12345");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}

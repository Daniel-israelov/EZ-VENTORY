package src.ezVentory;

public class BusinessDay {
    private String openHr;
    private String closeHr;
    private String day;

    public BusinessDay(String openHr, String closeHr, String day){
        this.openHr=openHr;
        this.closeHr=closeHr;
        this.day=day;
    }

    public String getOpenHr() {
        return openHr;
    }
    public void setOpenHr(String openHr) {
        this.openHr = openHr;
    }
    public String getCloseHr(){
        return closeHr;
    }
    public void setCloseHr(String closeHr){
        this.closeHr=closeHr;
    }
    public String getDay(){
        return day;
    }
    public void setDay(String day){
        this.day=day;
    }
}
package src.ezVentory;
import java.util.Date;

public class BusinessDay {
    private String openHr;
    private String closeHr;
    private String day;
    private Date thisDate = new Date();


    public BusinessDay(String openHr, String closeHr, String day, Date thisDate){
        setOpenHr(openHr);
        setCloseHr(closeHr);
        setDay(day);
        setDate(thisDate);
    }

    public String getOpenHr() {
        return openHr;
    }
    public void setOpenHr(String openHr) {this.openHr = openHr;}
    public String getCloseHr(){
        return closeHr;
    }
    public void setCloseHr(String closeHr){
        this.closeHr=closeHr;
    }
    public String getDay(){return day;}
    public void setDay(String day) {this.day=day;}
    public Date getDate(){return thisDate;}
    public void setDate(Date date) {this.thisDate=thisDate;}

}
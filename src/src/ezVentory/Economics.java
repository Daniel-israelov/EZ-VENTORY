package src.ezVentory;
import java.util.LinkedList;
import java.util.List;

public class Economics {
    private double dailyBudget;
    private double dailyProfit;
    private double dailyExpense;
    private List<Item> soldItem = new LinkedList<>();
    
    public Economics(double dailyBudget) {
        setDailyBudget(dailyBudget);
        setDailyProfit(0);
        setDailyExpense(0);
    }

    public void setDailyBudget(double dailyBudget)
    {
        this.dailyBudget = dailyBudget;
    }
    
    public void setDailyProfit(double dailyProfit)
    {
        this.dailyProfit = dailyProfit;
    }
    
    public void setDailyExpense(double dailyExpense)
    {
        this.dailyExpense = dailyExpense;
    }
    
    public double getBudget() {return dailyBudget; }
    public double getProfit() {return dailyProfit; }
    public double getExpense() {return dailyExpense; }
    
    //adding item to the list of items of the current supplier
    public boolean addSoldItem(Item soldItemToAdd){
        if(!soldItem.contains(soldItemToAdd)){
            soldItem.add(soldItemToAdd);
            return true;
        }
        return false;
    }
    // if an item returned we will remove it from list
}

package src.ezVentory;
import java.util.LinkedList;
import java.util.List;

public class Economics {
    private double dailyBudget;
    private double dailyProfit;
    private double dailyExpense;
    private List<Item> soldItem = new LinkedList<>();

    public Economics(double dailyBudget) {
        this.dailyBudget = dailyBudget;
        this.dailyProfit = 0;
        this.dailyExpense = 0;
    }

    public void setBudget(double dailyBudget) {
        this.dailyBudget = dailyBudget;
    }
    public double getBudget() {return dailyBudget; }
    public double getProfit() {return dailyProfit; }
    public double getDailyExpense() {return dailyExpense; }
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

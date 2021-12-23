package src.ezVentory;
import java.util.LinkedList;
import java.util.List;

public class Economics {
    private double dailyBudget;
    private double dailyProfit;
    private double dailyExpense;
    private List<Item> soldItem = new LinkedList<>();
    //private List<Item> returnedItem = new LinkedList<>(); -> list of returned items//
    
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
        if(this.dailyProfit >= 0)
            this.dailyProfit += dailyProfit;
        else this.dailyProfit = dailyProfit;
    }
    
    public void setDailyExpense(double dailyExpense)
    {
        this.dailyExpense = dailyExpense;
    }
    
    public double getDailyBudget() {return dailyBudget; }

    public double getDailyProfit()
    {
        return this.dailyProfit;
    }

    public double getDailyExpense() {return dailyExpense; }

    /**
     * add items to soldItem list for the dailyReport and for the dailyProfit to the end of the day
     * @param soldItemToAdd - every sold item from cashier added to the soldItem list
     * no need to check if item is valid
     */
    public void addSoldItem(Item soldItemToAdd)
    {
        this.soldItem.add(soldItemToAdd);
        this.dailyProfit += soldItemToAdd.getSellPrice();

        /*if(!soldItem.contains(soldItemToAdd)){
            soldItem.add(soldItemToAdd);
            return true;
        }
        return false;*/
    }

    /**
     * check if order is within budget
     * @param sum - from Manager createOrder, before we confirm the order
     * @return True if the order is within the budget and False if not
     */
    public boolean validExpense(double sum)
    {
        if(getDailyBudget()>=getDailyExpense()+sum)
        {
            setDailyExpense(getDailyExpense()+sum);
            return true;
        }
        return false;
    }


}

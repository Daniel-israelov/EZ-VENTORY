package src.ezVentory;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.io.*;

public class Report {
    void dailyReport(Economics daily) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter
                    ("C:\\desktop\\JavaProjects\\EZventory\\EZ-VENTORY\\Reports\\dayliReport.txt"));
          //  bw.write("Date: "+ +"\n");
            bw.write("Dayli budget: "+ daily.getDailyBudget()+"\n");
            bw.write("Dayli profit: "+ daily.getDailyProfit()+"\n");
            bw.write("Dayli expense: "+ daily.getDailyExpense()+"\n");
            bw.close();
        }catch(Exception ex){
            return;
        }

    }
    void reportBySupplier(Store store){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter
                    ("C:\\desktop\\JavaProjects\\EZventory\\EZ-VENTORY\\Reports\\dayliReport.txt"));
            List<Supplier> allSupplier = store.getSuppliers();
            for(Supplier sup : allSupplier){
                for (int i=0;i<allSupplier.size();i++){
                   // bw.write("Date: "+);
                    bw.write("Supplier name: "+sup.getName()+"\n");
                    bw.write("Supplier ID: "+sup.getId()+"\n");
                    bw.write("Items in stock:\n");
                        for(int j=1; j<sup.getItems().size();j++){
                            bw.write(j+". "+sup.getItems().get(j-1)+"\n");
                    }
                }
            }
            bw.close();
        }catch(Exception ex){
            return;
        }

    }


    void reportByDepartment(Item item, Store store){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter
                    ("C:\\desktop\\JavaProjects\\EZventory\\EZ-VENTORY\\Reports\\dayliReport.txt"));
            List<Department> allDepartments = store.getDepartments();
            for(Department dep : allDepartments){
                for (int i=0;i<allDepartments.size();i++){
                  //  bw.write("Date: "+);
                    bw.write("Department name: "+dep.getName()+"\n");
                    bw.write("Supplier ID: "+dep.getId()+"\n");
                    bw.write("Items in stock:\n");
                        for(int j=1; j<dep.getItemsList().size();j++){
                             bw.write(j+". "+dep.getItemsList().get(j-1)+"\n");
                    }
                }
            }
            bw.close();
        }catch(Exception ex){
            return;
        }

    }
    void reportsHistory(){

    }
}

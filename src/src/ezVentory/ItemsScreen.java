package src.ezVentory;

import javax.swing.*;

public class ItemsScreen extends JFrame{
    protected JPanel viewOptions;
    protected JComboBox suppliersComboBox;
    protected JTextField supplierTextField;
    protected JTextField departmentTextField;
    protected JComboBox departmentComboBox;
    protected JTextField saleTextField;
    protected JComboBox saleComboBox;
    protected JTable itemsTable;

    public ItemsScreen(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void buildTable(){
        String[] columns = {"Name", "Barcode", "Cost", "Price", "Inventory", "Sale status", "Sale price", "Supplier", "Department"};
        String[][] temp_data = {
                {"Bamba", "12345", "3.25", "4.90", "50", "Active", "3.90", "Osem", "Candies"},
                {"Bisli", "54321", "3.25", "4.90", "50", "Inactive", "0.00", "Osem", "Candies"}};

        itemsTable = new JTable(temp_data, columns);
        itemsTable.setBounds(30,40,300,400);

        JScrollPane sp = new JScrollPane(itemsTable);
        add(sp);
    }
}

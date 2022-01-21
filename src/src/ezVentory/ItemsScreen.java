package src.ezVentory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemsScreen extends JFrame implements ActionListener {
    protected JPanel viewOption;
    protected JComboBox<String> suppliersComboBox;
    protected JTextField supplierTextField;
    protected JTextField departmentTextField;
    protected JComboBox<String> departmentComboBox;
    protected JTextField saleTextField;
    protected JComboBox<String> saleComboBox;
    protected JTable itemsTable;
    protected JButton saveBtn;
    protected JButton cancelBtn;
    protected JPanel screenPanel;
    protected JPanel btnPanel;
    protected JScrollPane sp;
    protected DefaultTableModel tableModel;

    public ItemsScreen(){
        //noinspection BoundFieldAssignment
        screenPanel = new JPanel();

        setSize(700,500);
        buildBtnPanel();
        buildComboBoxes();
        buildTable();
        buildViewOptionPanel();

        this.departmentTextField.setEditable(false);
        this.supplierTextField.setEditable(false);
        this.saleTextField.setEditable(false);

        add(screenPanel);
        add(viewOption, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        setLocationRelativeTo(null); // window opens at screen center
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void buildViewOptionPanel(){
        //noinspection BoundFieldAssignment
        viewOption = new JPanel();
        viewOption.setLayout(new GridLayout());
        viewOption.add(supplierTextField);
        viewOption.add(suppliersComboBox);
        viewOption.add(departmentTextField);
        viewOption.add(departmentComboBox);
        viewOption.add(saleTextField);
        viewOption.add(saleComboBox);
    }

    public void buildTableModel(){
        tableModel = new DefaultTableModel();
        String[] columns = {"Name", "Barcode", "Cost", "Price", "Inventory", "Sale status", "Sale price", "Supplier", "Department"};
        Store s = Store.getInstance();

        for(String col : columns)
            tableModel.addColumn(col);

        for(Supplier sup : s.getSuppliers()){
            for(Item it : sup.getItems()){
                String saleStatus = (it.getIsOnSale()) ? "Active" : "Inactive";
                String[] itemVals = {it.getName(), it.getBarcode(), String.valueOf(it.getCostPrice()), String.valueOf(it.getSellPrice()), String.valueOf(it.getInventoryAmount()), saleStatus,
                        String.valueOf(it.getSalePrice()), sup.getName(), it.getDepName()};
                tableModel.addRow(itemVals);
            }
        }
    }

    public void buildTable(){
        buildTableModel();
        //noinspection BoundFieldAssignment
        itemsTable = new JTable(tableModel);
        //noinspection BoundFieldAssignment
        sp = new JScrollPane(itemsTable);
    }

    public void buildComboBoxes(){
        Store s = Store.getInstance();

        suppliersComboBox.addItem("All");
        for(Supplier sup : s.getSuppliers())
            suppliersComboBox.addItem(sup.getName());

        departmentComboBox.addItem("All");
        for(Department dep : s.getDepartments())
            departmentComboBox.addItem(dep.getName());

        saleComboBox.addItem("All");
        saleComboBox.addItem("Active");
        saleComboBox.addItem("Inactive");
    }

    public void buildBtnPanel(){
        //noinspection BoundFieldAssignment
        btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout());
        btnPanel.add(saveBtn, BorderLayout.WEST);
        btnPanel.add(cancelBtn, BorderLayout.EAST);
        saveBtn.setActionCommand("save");
        saveBtn.addActionListener(this);
        cancelBtn.setActionCommand("cancel");
        cancelBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("cancel")){
            //ToDo --> Load home screen
            setVisible(false);
        }
        else if (e.getActionCommand().equals("save")){
            //ToDo --> Update changes and return to home screen
            //Store s = Store.getInstance();
            setVisible(false);
        }
    }
}

package src.ezVentory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ItemScreen extends JFrame{
    JFrame frame = new JFrame();
    JPanel tablePanel = new JPanel();
    String[] columnHeaders = {"Name", "Barcode", "Cost", "Price", "Amount","OnSale" };
    String[] itemData = {"Bamba", "123456", "3.25", "4.9", "50", "No"};
    JTable itemsTable = new JTable();
    DefaultTableModel itemsTableModel = new DefaultTableModel();

    ItemScreen(){
        for(String head : columnHeaders)
            itemsTableModel.addColumn(head);

        itemsTableModel.addRow(columnHeaders);
        itemsTableModel.addRow(itemData);
        itemsTableModel.addRow(itemData);
        itemsTableModel.addRow(itemData);

        itemsTable.setModel(itemsTableModel);
        itemsTable.setLayout(new FlowLayout());

        itemsTable.setBounds(30,40,200,300);
        tablePanel.add(itemsTable);

        frame.add(itemsTable);
        frame.setSize(700,400);
        frame.setVisible(true);
    }
}

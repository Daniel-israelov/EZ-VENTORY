package src.ezVentory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemCreator extends JFrame implements ActionListener {
    private JTextField header;
    private JTextField tfName;
    private JTextField nameVal;
    private JTextField tfDepName;
    private JTextField tfCost;
    private JTextField tfBarcode;
    private JTextField tfSell;
    private JTextField barcodeVal;
    private JTextField costVal;
    private JTextField sellVal;
    private JComboBox<String> depBox;
    private JButton cancelBtn;
    private JButton saveBtn;
    private JPanel mainPanel;
    private JTextField tfSupp;
    private JComboBox<String> suppBox;
    private JPanel panelHeader;
    private JPanel pItem;
    private GridLayout gl;

    ItemCreator(){
        buildGUI();
        buildButtons();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void buildButtons() {
        pItem.add(cancelBtn);
        pItem.add(saveBtn);
        saveBtn.setActionCommand("save");
        cancelBtn.setActionCommand("cancel");
        saveBtn.addActionListener(this);
        cancelBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("save")){
            Item item = new Item(nameVal.getText(), barcodeVal.getText(), Double.parseDouble(costVal.getText()),Double.parseDouble(sellVal.getText()));

            String supName = (String)suppBox.getSelectedItem();
            String depName = (String)depBox.getSelectedItem();

            Store s = Store.getInstance();

            for(Supplier sup : s.getSuppliers()){
                if(sup.getName().equals(supName)){
                    sup.addItem(item);
                    break;
                }
            }

            for(Department dep : s.getDepartments()){
                if(dep.getName().equals(depName)){
                    dep.addItem(item);
                    break;
                }
            }
            setVisible(false);
        }
        else if(e.getActionCommand().equals("cancel"))
            setVisible(false);
    }

    private void buildGUI() {
        gl = new GridLayout(0,2);
        setSize(700,500);

        buildPanels();
        buildComboBox();

        add(panelHeader, BorderLayout.NORTH);
        add(pItem);
    }

    private void buildPanels() {
        //noinspection BoundFieldAssignment
        panelHeader = new JPanel();
        panelHeader.add(header);

        //noinspection BoundFieldAssignment
        pItem = new JPanel();
        pItem.setLayout(gl);
        pItem.add(tfName);
        pItem.add(nameVal);
        pItem.add(tfBarcode);
        pItem.add(barcodeVal);
        pItem.add(tfCost);
        pItem.add(costVal);
        pItem.add(tfSell);
        pItem.add(sellVal);
        pItem.add(tfDepName);
        pItem.add(depBox);
        pItem.add(tfSupp);
        pItem.add(suppBox);

        //noinspection BoundFieldAssignment
        mainPanel = new JPanel();
        mainPanel.add(panelHeader, BorderLayout.NORTH);
        mainPanel.add(pItem, BorderLayout.SOUTH);
    }

    private void buildComboBox() {
        depBox.addItem("SELECT");
        for(Department dep : Store.getInstance().getDepartments())
            depBox.addItem(dep.getName());

        suppBox.addItem("SELECT");
        for(Supplier sup : Store.getInstance().getSuppliers())
            suppBox.addItem(sup.getName());
    }
}

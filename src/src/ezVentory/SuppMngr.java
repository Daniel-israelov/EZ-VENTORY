package src.ezVentory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuppMngr extends JFrame implements ActionListener{
    private JPanel mainPanel;
    private JPanel pHeadAdd;
    private JTextField headerAdd;
    private JPanel pSuppCreate;
    private JPanel pSuppRemove;
    private JPanel pHeadDel;
    private JTextField tfName;
    private JTextField nameVal;
    private JTextField tfID;
    private JTextField idVal;
    private JButton createBtn;
    private JButton resetBtn;
    private JTextField headerRem;
    private JTextArea suppInfo;
    private JComboBox<String> suppBox;
    private JTextField tfSuppSlct;
    private JButton dltSuppBtn;
    private JButton backBtn;
    private JPanel remBigPanel;
    private JPanel addBigPanel;
    private JPanel bigPanel;

    SuppMngr(){
        buildSuppCreatePanel();
        buildSuppDeletePanel();
        buildSuppBox();
        buildMainPanel();
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(bigPanel);
    }

    private void buildMainPanel() {
        //noinspection BoundFieldAssignment
        bigPanel = new JPanel();
        GridLayout gl = new GridLayout(0,1);
        //noinspection BoundFieldAssignment
        mainPanel = new JPanel();
        mainPanel.setLayout(gl);
        mainPanel.add(pHeadAdd);
        mainPanel.add(pSuppCreate);
        mainPanel.add(pHeadDel);
        mainPanel.add(pSuppRemove);
        bigPanel.add(mainPanel);
    }

    private void buildSuppBox() {
        suppBox.addItem("SELECT");
        for(Supplier sup : Store.getInstance().getSuppliers())
            suppBox.addItem(sup.getName());
        suppBox.addActionListener(e -> {
            for(Supplier sup : Store.getInstance().getSuppliers()){
                if(sup.getName().equals(suppBox.getSelectedItem())){
                    suppInfo.setText("Supplier: " + sup.getName() + "\n" + "ID#: " + sup.getId() + "\n" + "Total items: " + sup.getItems().size());
                    break;
                }
            }
        });
    }

    private void buildSuppDeletePanel() {
        //noinspection BoundFieldAssignment
        pHeadDel = new JPanel();
        pHeadDel.add(headerRem);
        pHeadDel.setSize(pHeadDel.getPreferredSize());

        GridLayout gl3 = new GridLayout(0,3);
        //noinspection BoundFieldAssignment
        pSuppRemove = new JPanel();
        pSuppRemove.setLayout(gl3);
        pSuppRemove.add(tfSuppSlct);
        pSuppRemove.add(suppBox);
        pSuppRemove.add(suppInfo);
        pSuppRemove.add(dltSuppBtn);
        pSuppRemove.add(backBtn);
        dltSuppBtn.addActionListener(this);
        backBtn.addActionListener(this);
        dltSuppBtn.setActionCommand("delete");
        backBtn.setActionCommand("back");
    }

    private void buildSuppCreatePanel() {
        //noinspection BoundFieldAssignment
        pHeadAdd = new JPanel();
        pHeadAdd.add(headerAdd);

        GridLayout gl2 = new GridLayout(0,3);
        //noinspection BoundFieldAssignment
        pSuppCreate = new JPanel();
        pSuppCreate.setLayout(gl2);
        pSuppCreate.add(tfName);
        pSuppCreate.add(nameVal);
        pSuppCreate.add(createBtn);
        pSuppCreate.add(tfID);
        pSuppCreate.add(idVal);
        pSuppCreate.add(resetBtn);
        resetBtn.addActionListener(this);
        createBtn.addActionListener(this);
        resetBtn.setActionCommand("reset");
        createBtn.setActionCommand("create");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("create")){
            Supplier sup = new Supplier(nameVal.getText(),Integer.parseInt(idVal.getText()));
            Store.getInstance().addSupplier(sup);
            suppBox.addItem(sup.getName());
        }
        else if(e.getActionCommand().equals("reset")){
            nameVal.setText("");
            idVal.setText("");
        }
        else if(e.getActionCommand().equals("delete")){
            Supplier sup = new Supplier("Coca cola", 777);
            Store.getInstance().removeSupplier(sup);
            suppBox.removeItem(suppBox.getSelectedItem());
        }
        else if(e.getActionCommand().equals("back")){
            setVisible(false);
        }
    }
}

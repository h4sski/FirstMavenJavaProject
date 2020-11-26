package com.firstDBConnection;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Wrapper;

public class GUI {
    private JFrame frame = new JFrame("My First GUI");
    private JButton button1;

    private JPanel tablePanel3;
    private JScrollPane tablePanel;
    private JTable table1;
    private JScrollPane tablePanel2;
    private JTable table2;

    public GUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300,700);
        frame.setVisible(true);


        frame.add(Container());

        frame.setVisible(true);
    }

    private JPanel Container() {
        JPanel container = new JPanel();
        container.add(MenuPanel());
        container.add(TablePanel());
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        return container;
    }

    private JPanel MenuPanel() {
        JPanel menu = new JPanel();
        JButton b1 = Button1("Menu");
        menu.add(b1);
        JButton b2 = Button1("Edit");
        menu.add(b2);
        JButton b3 = Button1("View");
        menu.add(b3);
        JButton b4 = Button1("Help");
        menu.add(b4);

//        menu.setLayout(new BoxLayout(menu, BoxLayout.LINE_AXIS));
        menu.setLayout(new GridLayout());
        menu.setMaximumSize(new Dimension(1000, 200));

        return menu;
    }

    public JPanel TablePanel() {
        JPanel returnPanel = new JPanel();
        ECRs ecrsTable = new ECRs();
        table1 = new JTable(ecrsTable.getECRsTableObjectArray(), ecrsTable.getColumnHeaders());

        for (int i = 0; i< table1.getColumnCount(); i++) {
            if (!ecrsTable.getColumnHeaders()[i].equals("Description")) {
                table1.getColumnModel().getColumn(i).setWidth(ecrsTable.getColumnWidth()[i]);
                table1.getColumnModel().getColumn(i).setMinWidth(ecrsTable.getColumnWidth()[i]);
                table1.getColumnModel().getColumn(i).setMaxWidth(ecrsTable.getColumnWidth()[i]);
//                System.out.println("column# = " + i + " has width = " + columnWidth[i]);
            }
        }

//        table2 = SortTable(table1);

        table1.setAutoCreateRowSorter(true);


        tablePanel = new JScrollPane(table1);

        tablePanel3 = new JPanel();
        tablePanel3.setLayout(new BoxLayout(tablePanel3, BoxLayout.X_AXIS));
        JButton b1 = Button1("Refresh");
        tablePanel3.add(b1);
        tablePanel3.add(tablePanel);
//        frame.add(tablePanel3);

//        tablePanel = new JScrollPane(table1);
//        tablePanel.setLayout(new FlowLayout());
//        frame.add(tablePanel);
//        tablePanel2 = new JScrollPane(table2);
//        frame.add(tablePanel2);
        returnPanel.add(tablePanel3);
        returnPanel.setLayout(new GridLayout());
        return returnPanel;
    }

    public JTable SortTable(JTable tableSource) {
        JTable tableOutput = tableSource;

        System.out.println("Inside SortTable");
        return tableOutput;
    }

    private JButton Button1(String label){
        final JButton btn = new JButton();
        btn.setText(label);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn.setText("well done");
            }
        });
        return btn;
    }

    public void setData(GUI data) {
    }

    public void getData(GUI data) {
    }

    public boolean isModified(GUI data) {
        return false;
    }
}

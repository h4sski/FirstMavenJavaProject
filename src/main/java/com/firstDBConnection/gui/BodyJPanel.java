package com.firstDBConnection.gui;

import com.firstDBConnection.ECRs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyJPanel {
    JPanel bodyPanel = new JPanel();

    public BodyJPanel() {
        bodyPanel.add(MenuPanel());
        bodyPanel.add(MiddlePanel());
        bodyPanel.setLayout(new BoxLayout(bodyPanel, BoxLayout.Y_AXIS));
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

    private JPanel MiddlePanel() {
        JPanel returningMiddlePanel = new JPanel();
        returningMiddlePanel.add(MiddleLeftPanel());
        returningMiddlePanel.add(MiddleCenterPanel());
        returningMiddlePanel.add(MiddleRightPanel());
//        returningMiddlePanel.add(TablePanel());
        returningMiddlePanel.setLayout(new BoxLayout(returningMiddlePanel, BoxLayout.X_AXIS));
        return returningMiddlePanel;
    }

    private JPanel MiddleLeftPanel() {
        JPanel middleLeftPanel = new JPanel();
        middleLeftPanel.add(this.Button1("Left"));
        return middleLeftPanel;
    }
    private JPanel MiddleCenterPanel() {
        return null;
    }
    private JPanel MiddleRightPanel() {
        return null;
    }
    private JPanel TablePanel() {
        JPanel returningPanel = new JPanel();
        ECRs ecrsTable = new ECRs();
        JTable table1 = new JTable(ecrsTable.getECRsTableObjectArray(), ecrsTable.getColumnHeaders());

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


        JScrollPane tablePanel = new JScrollPane(table1);

        JPanel tablePanel3 = new JPanel();
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
        returningPanel.add(tablePanel3);
        returningPanel.setLayout(new GridLayout());
        return returningPanel;
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

    public JPanel getBodyJPanel() {
        return bodyPanel;
    }
}

package com.firstDBConnection;



import com.firstDBConnection.gui.BodyJPanel;

import javax.swing.*;

public class GUI {
    private JFrame frame = new JFrame("My First GUI");

    public GUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300,700);
        frame.setVisible(true);

        frame.add(new BodyJPanel().getBodyJPanel());
        frame.setVisible(true);
    }

    public void setData(GUI data) {
    }

    public void getData(GUI data) {
    }

    public boolean isModified(GUI data) {
        return false;
    }
}

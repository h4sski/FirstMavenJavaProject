package com.firstDBConnection;

import javax.swing.*;

public class FirstDBConnection {


    public static void main(String[] args) {
//        new HelloWorld();
        new GUI();
//        newFrame();
    }

    public static void newFrame() {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }

}

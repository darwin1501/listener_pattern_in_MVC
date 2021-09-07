package com.darwin.view;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class UserView implements PropertyChangeListener {

    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton saveBtn;

    private String username;

    public UserView(){
//        frame
        //          frame creation
        frame = new JFrame("Change Username");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
//        label
        label = new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
        label.setBounds(150,50,100,50);
        frame.add(label);
//      textfield
        textField = new JTextField();
        textField.setBounds(150,130,100,50);
        frame.add(textField);
//            button
        saveBtn = new JButton();
        saveBtn.setBounds(125, 200, 150,50);
        saveBtn.setText("Change Username");
        frame.add(saveBtn);

        frame.setVisible(true);
    }

    public JFrame getFrame(){
        return frame;
    }

    public String getUsername() {return username; }

    public JButton getSaveBtn(){
        return saveBtn;
    }

    public JLabel getLabel(){
        return label;
    }

    public JTextField getTextField(){
        return textField;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setUsername((String) evt.getNewValue());
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
//        update label
        getLabel().setText(getUsername());
//        System.out.println("A username has changed in View");
    }
}

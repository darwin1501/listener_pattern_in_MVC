package com.darwin.model;

import com.darwin.view.UserView;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class UserModel {

    private String username;

    private PropertyChangeSupport support;

    public UserModel(){
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener object){
        support.addPropertyChangeListener(object);
    }

    public void removePropertyChangeListener(PropertyChangeListener object){
        support.removePropertyChangeListener(object);
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String newUsername){
        support.firePropertyChange("username", this.username,newUsername );
        this.username  = newUsername;
//        System.out.println("username has changed in model");
    }
}

package com.darwin.controller;

import com.darwin.model.UserModel;
import com.darwin.view.UserView;

public class UserController {

//    observable
    private UserView userView;
//    observer
    private UserModel userModel;

    public UserController(UserView userView, UserModel userModel){
        this.userView = userView;
        this.userModel = userModel;
        initController();
    }

    public void initController(){

        userModel.addPropertyChangeListener(userView);

        userView.getSaveBtn().addActionListener((e)->{
//            System.out.println("A username on model has changed by Controller");
            userModel.setUsername(userView.getTextField().getText());
        });
    }
}

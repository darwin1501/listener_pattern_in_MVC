package com.darwin;

import com.darwin.controller.UserController;
import com.darwin.model.UserModel;
import com.darwin.view.UserView;

public class App {

    public static void main(String[] args) {
        UserView userView = new UserView();
        UserModel userModel = new UserModel();

        UserController userController = new UserController(userView, userModel);

    }
}

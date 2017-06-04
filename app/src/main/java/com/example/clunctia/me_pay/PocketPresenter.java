package com.example.clunctia.me_pay;

import java.util.Observable;
import java.util.Observer;

import Data.User;

/**
 * Created by Clunctia on 6/3/2017.
 */

public class PocketPresenter implements Observer{

    private User user;
    private PocketView view;

    public PocketPresenter(){
        user.getInstance();
    }



    public User getUser(){
        return user;
    }

    @Override
    public void update(Observable o, Object arg) {

    }

    public void createDialog(int b){
        view.createDialog(b);
    }
}

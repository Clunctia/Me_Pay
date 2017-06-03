package com.example.clunctia.me_pay;

import java.util.Observable;
import java.util.Observer;

import Data.User;

/**
 * Created by Clunctia on 6/3/2017.
 */

public class PocketPresenter implements Observer{

    private User user;

    public PocketPresenter(){
        user.getInstance();
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}

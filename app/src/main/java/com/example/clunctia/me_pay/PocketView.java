package com.example.clunctia.me_pay;

import java.util.ArrayList;

import Data.Pocket;

/**
 * Created by Clunctia on 6/3/2017.
 */

public interface PocketView {
    void displayPocket(ArrayList<Pocket> pockets);
    void createDialog(int a);
}

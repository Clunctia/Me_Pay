package Data;

/**
 * Created by Clunctia on 6/3/2017.
 */

public class Pocket {
    private double amount;
    private static Pocket instance;
    private User user;

    public Pocket(){
        amount = 0;
    }

    public double updateAmount(double amount){
        amount += amount;
        return amount;
    }

    public static Pocket getInstance(){
        if(instance == null) instance = new Pocket();
        return instance;
    }

}

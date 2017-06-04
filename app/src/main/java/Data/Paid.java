package Data;

/**
 * Created by Clunctia on 6/3/2017.
 */

public class Paid {
    private String name;
    private int date;
    private int month;
    private Log logs;

    public Paid(){
        name = "";
        date = 0;
        month = 0;
        logs = new Log();
    }

    public String getName(){
        return name;
    }



}

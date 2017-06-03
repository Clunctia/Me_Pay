package Data;

/**
 * Created by Clunctia on 6/3/2017.
 */

public class User {
    private String id;
    private String name;
    private double money;

    private Pocket pocket;

    private static User instance;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        money = 0;
        pocket = new Pocket();
    }

    public static User getInstance() {
        if (instance == null) instance = new User("00", "Me");
        return instance;
    }

    public String getId() {return id;}

    public String getName() {return name;}

    public double getMoney() {return money;}

    public void addMoney(double amount) { money += amount; }

    public Pocket getPocket() { return pocket;    }

    public boolean pay(double amount) {
        if (money - money < 0) {
            return false;
        } else {
            money -= amount;
            return true;
        }
    }
}

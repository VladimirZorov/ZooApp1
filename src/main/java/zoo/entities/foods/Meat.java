package zoo.entities.foods;

public class Meat extends BaseFood{
    public static final int CALORIES = 70;
    public static final double PRICE = 10.00;

    protected Meat() {
        super(CALORIES, PRICE);
    }
}
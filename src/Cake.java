/**
 * Created by jlaba on 10.10.2016.
 */
public class Cake extends Candy {
    private boolean marmalade;

    public Cake(int sugar, int price, int calories, boolean marmalade) {
        super(sugar, price, calories);
        this.marmalade = marmalade;
    }
}

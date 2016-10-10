/**
 * Created by jlaba on 10.10.2016.
 */
public class CandyWithNuts extends Candy {
    private boolean nuts;

    public CandyWithNuts(int sugar, int price, int calories, boolean nuts) {
        super(sugar, price, calories);
        this.nuts = nuts;
    }
}

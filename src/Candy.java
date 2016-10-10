/**
 * Created by jlaba on 10.10.2016.
 */
public class Candy {
    private int sugar;
    private int price;
    private int calories;

    public Candy(int sugar, int price, int calories) {
        this.sugar = sugar;
        this.price = price;
        this.calories = calories;
    }
    public int getPrice() {
        return this.price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

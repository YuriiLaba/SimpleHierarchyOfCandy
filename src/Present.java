/**
 * Created by jlaba on 10.10.2016.
 */
public class Present {
    int count = 0;
    private int max = 5;
    private Candy[] p = new Candy[max];
    private int i = 0;

    public Candy[] add(Candy o){
        p[i] = o;
        i++;
        return p;
    }

    public void candyFind(double first, double second) {
        for(int u = 0; u <p.length; u++) {
            if(p[u] != null){
                count +=1;
            }
        }
        for(int c = 0; c < count; c++) {
            if(p[c].getPrice() < second && p[c].getPrice() > first){
                System.out.println(p[c].getPrice());
            }
        }
    }
    public Candy[] sort() {
        for(int i = 0; i < count; i++) {
            int valueToSort = p[i].getPrice();
            int j = i;
            while (j > 0 && p[j - 1].getPrice() > valueToSort) {
                p[j] = p[j - 1];
                j--;
            }
            p[j].setPrice(valueToSort);
        }
        return p;
    }

}

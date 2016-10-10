/**
 * Created by jlaba on 10.10.2016.
 */
public class Main {
    public static void main(String [] args){
        Cake obj1 = new Cake(12,16,15, true);
        Cake obj2 = new Cake(12,15,15, true);
        CandyWithNuts obj3 = new CandyWithNuts(15,18,40, false);
        CandyWithNuts obj4 = new CandyWithNuts(10,13,90, true);
        Cake obj5 = new Cake(17,18,3, false);
        Present y = new Present();
        y.add(obj1);
        y.add(obj2);
        y.add(obj3);
        y.add(obj4);
        y.add(obj5);
        y.candyFind(13.0,15.0);
        y.sort();

    }
}

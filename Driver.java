import java.util.List;
import java.util.ArrayList;

class Driver{
        // Driver Code
        public static void main(String[] args) {
        SantaPresentBag bag =  new SantaPresentBag();
        List<Present> presents = new ArrayList<Present>();
        Present a = new Present(5, "red");
        Present b = new Present(4,"blue");
        Present c = new Present(15, "green");
        Present d = new Present(14, "yellow");
        Present e = new Present(12, "green");
        Present f = new Present(2, "blue");
        Present g = new Present(6, "red");
        presents.add(a);
        presents.add(b);
        presents.add(c);
        presents.add(d);
        presents.add(e);
        presents.add(f);
        presents.add(g);
        System.out.println("Santa's Bag: "+ bag.organizeSantaPresentBag(presents));
    }
} 
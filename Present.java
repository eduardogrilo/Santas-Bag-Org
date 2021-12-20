import java.util.List;
import java.util.ArrayList;

class Present {

    public Integer weight;
    public String color;

    public Present(Integer weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Present{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}

class SantaPresentBag {
    final int MAX_WEIGHT = 50;

    public List<Present> organizeSantaPresentBag(List<Present> presents) {
        // Add code here
        int total = 0;
        String color = "";
        Present heaviest = new Present(0, "");
        Present copy_heaviest = new Present(0, "");
        List<Present> presentbag = new ArrayList<Present>();
        List<Present> copy = new ArrayList<Present>(presents);

        while (total <= MAX_WEIGHT) {
            // Get the heaviest present
            for (Present index : copy) {
                if (index.weight >= heaviest.weight) {
                    copy_heaviest = new Present(index.weight, index.color);
                    heaviest = index;
                } 
            }
            total = total + copy_heaviest.weight;
            
            // Avoid an adjacent present
            if (copy_heaviest.color != color && total < MAX_WEIGHT) { 
                presentbag.add(copy_heaviest);
                copy.remove(heaviest);
                color = copy_heaviest.color;  
            }
            if (total > MAX_WEIGHT)  {
                total = total - copy_heaviest.weight;
            }
            heaviest.weight = 0;

        }
        return presentbag;
    }
}

class Driver{
        // Driver Code
        public static void main(String[] args) {
        SantaPresentBag bag =  new SantaPresentBag();
        List<Present> presents = new ArrayList<Present>();
        System.out.println("return da BAG:");
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
        System.out.println("return da BAG:"+ bag.organizeSantaPresentBag(presents));
    
    }
} 
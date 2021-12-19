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
        Present heaviest_present = new Present(0, "");
        List <Present> bag = new ArrayList<Present>();

        while(total <= MAX_WEIGHT){
            // Get the heaviest present
            for (Present present : presents) {
                if (present.weight >= heaviest_present.weight){
                    heaviest_present = present;
                }
            }
            // Avoid a adjacent present
            if(heaviest_present.color != color){
                bag.add(heaviest_present);
                color = heaviest_present.color;
                total = total + heaviest_present.weight;
            }
        }
    return bag;
    }
}

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
        Present f = new Present(6, "red");
        presents.add(a);
        presents.add(b);
        presents.add(c);
        presents.add(d);
        presents.add(e);
        presents.add(f);
        System.out.println("return da BAG:"+ bag.organizeSantaPresentBag(presents));
    
    }
} 
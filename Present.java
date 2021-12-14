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

    public List<Present> organizeSantaPresentBag(List<Present> presents) {
        // Add code here
        String blue = "blue";
        String red = "red";
        String green = "green";
        String yellow = "yellow";        
        presents.clear();

        return List.of();
       
    }
}

class Driver
{
        // Driver Code
        public static void main(String[] args)   
       {
        SantaPresentBag bag =  new SantaPresentBag();
        List<Present> presentWeights = new ArrayList<Present>();
        Present a = new Present(5, "red");
        Present b = new Present(4,"blue");
        Present c = new Present(15, "green");
        Present d = new Present(14, "yellow");
        Present e = new Present(12, "green");
        Present f = new Present(6, "red");
        presentWeights.add(a);
        presentWeights.add(b);
        presentWeights.add(c);
        presentWeights.add(d);
        presentWeights.add(e);
        System.out.println("return da BAG:"+ bag.organizeSantaPresentBag(presentWeights));
    
    }
} 
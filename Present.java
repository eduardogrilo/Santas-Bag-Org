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
        int totalweight = 0;
        String color = "";
        Present heaviest = new Present(0, "");
        Present copy_heaviest = new Present(0, "");
        List<Present> presentbag = new ArrayList<Present>();
        List<Present> copy_presentbag = new ArrayList<Present>(presents);

        while (totalweight <= MAX_WEIGHT) {
            // Get the heaviest present
            for (Present index : copy_presentbag) {
                if (index.weight >= heaviest.weight) {
                    copy_heaviest = new Present(index.weight, index.color);
                    heaviest = index;
                }
            }
            
            if (heaviest.weight == 0) {
                    break;                
            }
            totalweight += copy_heaviest.weight;
            
            // Avoid an adjacent present
            if (copy_heaviest.color != color && totalweight < MAX_WEIGHT) { 
                presentbag.add(copy_heaviest);
                copy_presentbag.remove(heaviest);
                color = copy_heaviest.color;  
            }
    
            if (totalweight > MAX_WEIGHT)  {
                totalweight -= copy_heaviest.weight;
            }
            heaviest.weight = 0;
        }
        return presentbag;
    }
}
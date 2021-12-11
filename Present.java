import java.util.List;

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

public class SantaPresentBag {

    public List<Present> organizeSantaPresentBag(List<Present> presents) {

        // Add code here

        return List.of();
    }

}

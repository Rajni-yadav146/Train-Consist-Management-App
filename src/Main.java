import java.util.*;

class GoodsBogie {
    String type;   // Cylindrical, Rectangular, Open, etc.
    String cargo;  // Petroleum, Coal, Grain, etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        // Create list of goods bogies
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Rectangular", "Grain")
        );

        // Safety validation using stream
        boolean isSafe = bogies.stream()
                .allMatch(b -> 
                    !b.getType().equalsIgnoreCase("Cylindrical") 
                    || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Output result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is NOT SAFE ❌");
        }
    }
}

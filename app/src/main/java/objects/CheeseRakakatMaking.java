package objects;

public class CheeseRakakatMaking {
    public CheeseRakakatMaking() {
        System.out.println("Preparing cheese rakakat");
    }

    public CheeseRakakatMaking adding() {
        System.out.println("Add mozzarella cheese, oregano, toasted sesame seeds, coriander leaves and mix thoroughly in a bowl.");
        return this;
    }

    public CheeseRakakatMaking roll() {
        System.out.println("Spread an adequate amount of filling on the sheet, roll it over to form a log and seal the edges using some water.");
        return this;
    }

    public CheeseRakakatMaking fry() {
        System.out.println("Heat the oil on medium flame in a deep pot or pan and deep fry the prepared cheese rolls until golden. Take them out on a paper towel.");
        return this;
    }

    public CheeseRakakat serve() {
        System.out.println("Serving cheese rakakat.");
        return new CheeseRakakat();
    }

    private static class CheeseRakakat {
    }

    public static void main(String[] args) {
        CheeseRakakatMaking cheeseRakakatMaking = new CheeseRakakatMaking();
        cheeseRakakatMaking
                .adding()
                .roll()
                .fry()
                .serve();
    }
}

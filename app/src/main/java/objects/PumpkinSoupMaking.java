package objects;

public class PumpkinSoupMaking {
    public PumpkinSoupMaking() {
        System.out.println("Preparing pumpkin soup");
    }

    // Heat oil in a large saucepan over low heat
    public PumpkinSoupMaking heatOil() {
        System.out.println("Heating oil in a large saucepan over low heat");
        return this;
    }

    // Add onion and leak and cook for 2-3  minutes, until softened but not colored
    public PumpkinSoupMaking addOnion() {
        System.out.println("Adding onion and leak...");
        System.out.println("cooking for 2-3  minutes, until softened but not colored...");
        return this;
    }

    // Add garlic and spices and cook, stirring, for 30 seconds
    public PumpkinSoupMaking addSpices() {
        System.out.println("Adding garlic...");
        System.out.println("Adding spices...");
        System.out.println("Cooking for 30 seconds...");
        return this;
    }

    // Add pumpkin, potato and stock and bring to the boil
    public PumpkinSoupMaking addStock() {
        System.out.println("Adding pumpkin...");
        System.out.println("Adding potatoes...");
        System.out.println("Adding stock...");
        System.out.println("Started boiling...");
        return this;
    }

    // Turn heat to low, cover and simmer for 30 minutes
    public PumpkinSoupMaking simmer(int minutes) {
        System.out.println("Terning heat to low...");
        System.out.println("covering and simmering for "+ minutes +"minutes...");
        return this;
    }

    // Allow to cook slightly, then blend in batches
    public PumpkinSoupMaking blend() {
        System.out.println("Cooking slightly...");
        System.out.println("Blending in batches...");
        return this;
    }

    // Return soup to pan, stir through cream and reheat gently
    public PumpkinSoupMaking reheat() {
        System.out.println("Returning to pan...");
        System.out.println("stir through cream...");
        System.out.println("againg cooking gently");
        return this;
    }

    // season
    public PumpkinSoupMaking season() {
        System.out.println("Seasoning the pumpkin soup...");
        return this;
    }

    // serve
    public PumpkinSoup serve() {
        System.out.println("Serving soup");
        return new PumpkinSoup();
    }

    private static class PumpkinSoup {}

    public static void main(String[] args) {
        PumpkinSoupMaking pumpkinSoup = new PumpkinSoupMaking();
        pumpkinSoup
                .heatOil()
                .addOnion()
                .addSpices()
                .addStock()
                .simmer(30)
                .blend()
                .reheat()
                .season()
                .serve();
    }
}

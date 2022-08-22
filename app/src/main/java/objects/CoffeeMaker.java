package objects;

public class CoffeeMaker {

    public CoffeeMaker() {
        System.out.println("Preparing coffee maker...");
    }

    public CoffeeMaker prepareCoffeeMix(double instantCoffee, double sugar) {
        System.out.printf("Mixing %s tablespoons sugar with %s coffee", sugar, instantCoffee);
        System.out.println();
        return this;
    }

    public CoffeeMaker addHotWater(int water) {
        System.out.println("Adding hot water to the coffee mix " + water);
        return this;
    }

    public CoffeeMaker mix() {
        System.out.println("Mixing contents in the maker");
        return this;
    }

    public CoffeeMaker stirAndBeat(int time) {
        System.out.printf("Stirring the contents in coffee for %s minutes", time);
        System.out.println();
        return this;
    }

    public CoffeeMaker pourMilk(double milkQuantity) {
        System.out.println("Adding %s cup milk to the coffee mix");
        return this;
    }

    public Coffee serve() {
        System.out.println("Serving coffee");
        return new Coffee();
    }

    private static class Coffee {}

    public static void main(String[] args) {
        //
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker
                .prepareCoffeeMix(1.5, 1.5)
                .addHotWater(3)
                .mix()
                .stirAndBeat(3)
                .pourMilk(0.5)
                .mix()
                .serve();
    }
}

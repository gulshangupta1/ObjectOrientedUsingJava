package capstone1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple", "Medium", "Red", "Hard"));
        fruitList.add(new Fruit("Banana", "Medium", "Yellow", "Soft"));
        fruitList.add(new Fruit("Orange", "Medium", "Orange", "Soft"));
        fruitList.add(new Fruit("Grapes", "Medium", "Small", "Crunchy"));
        fruitList.add(new Fruit("Blue Berry", "Small", "Blue", "Crunchy"));
        fruitList.add(new Fruit("Yellakki Banana", "Small", "Yellow", "Hard"));
        fruitList.add(new Fruit("Watermelon", "Large", "Green", "Hard"));
        fruitList.add(new Fruit("Apple", "Medium", "Red", "Crunchy"));
        fruitList.add(new Fruit("Apple", "Medium", "Red", "Soft"));
        fruitList.add(new Fruit("Apple", "Medium", "Red", "Soft"));
        fruitList.add(new Fruit("Apple", "Medium", "Red", "Soft"));
        fruitList.add(new Fruit("Watermelon", "Large", "Green", "Hard"));
        fruitList.add(new Fruit("Watermelon", "Large", "Green", "Hard"));
        fruitList.add(new Fruit("Watermelon", "Large", "Green", "Hard"));
        fruitList.add(new Fruit("Banana", "Medium", "Yellow", "Soft"));

        System.out.println("Total number of fruits: "+ fruitList.size());

        // Small Baket
//        Basket basket1 = new Basket("Small");
//        basket1.arrangeLayer(fruitList, 0);
//        basket1.printBasketLayers();


        // Medium basket
        Basket basket2 = new Basket("Medium");
        basket2.arrangeLayer(Segregate.segregateBySize(fruitList,"Large"), 0);
        basket2.arrangeLayer(Segregate.segregateBySize(fruitList,"Medium"), 1);
        basket2.arrangeLayer(Segregate.segregateBySize(fruitList,"Small"), 2);
        basket2.printBasketLayers();

    }
}

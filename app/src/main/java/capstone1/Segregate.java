package capstone1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Segregate {
    // this method will return the list which is filtered by fruit name
    public static List<Fruit> segregateByName(List<Fruit> fruits, String fruitName) {
        return (ArrayList<Fruit>) fruits.stream().filter(fruit -> fruit.getName().equals(fruitName)).collect(Collectors.toList());
    }

    // this method will return the list which is filtered by fruit color
    public static List<Fruit> segregateByColor(List<Fruit> fruits, String colorName) {
        return (ArrayList<Fruit>) fruits.stream().filter(fruit -> fruit.getName().equalsIgnoreCase(colorName)).collect(Collectors.toList());
    }

    // this method will return the list which is filtered by fruit size
    public static List<Fruit> segregateBySize(List<Fruit> fruits, String size) {
        return (ArrayList<Fruit>) fruits.stream().filter(fruit -> fruit.getSize().equalsIgnoreCase(size)).collect(Collectors.toList());
    }

    // this method will return the list which is filtered by fruit type
    public static List<Fruit> segregateByType(List<Fruit> fruits, String size) {
        return (ArrayList<Fruit>) fruits.stream().filter(fruit -> fruit.getType().equalsIgnoreCase(size)).collect(Collectors.toList());
    }
}

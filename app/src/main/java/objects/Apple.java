package objects;

import objectorientedusingjava.App;

public class Apple {
    private String name;
    private String taste;
    private String color;

    public Apple(String name, String taste, String color) {
        this.name = name;
        this.taste = taste;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Apple a1 = new Apple("Red Delicious", "More Sweet", "Red");
        Apple a2 = new Apple("Fuji", "Medium Sweet", "Red");
        Apple a3 = new Apple("Golden Delicious", "Less Sweet", "Yellow");
        Apple a4 = new Apple("Crispin", "Medium Sweet", "Green");
        Apple a5 = new Apple("Shizuka", "More Sweet", "Green");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
    }
}

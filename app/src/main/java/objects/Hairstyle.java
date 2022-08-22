package objects;

public class Hairstyle {
    private String name;
    private String hairColor;
    private String gender;
    private int price;

    public Hairstyle(String name, String hairColor, String gender, int price) {
        this.name = name;
        this.hairColor = hairColor;
        this.gender = gender;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hairstyle{" +
                "name='" + name + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", gender='" + gender + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Hairstyle h1 = new Hairstyle("Buzz Cut", "Black", "Male", 250);
        Hairstyle h2 = new Hairstyle("Crew Cut", "Red", "Male", 200);
        Hairstyle h3 = new Hairstyle("Ponytail", "Black", "Female", 550);
        Hairstyle h4 = new Hairstyle("Long", "Brown", "Female", 600);
        Hairstyle h5 = new Hairstyle("Short Blonde", "Golden", "Female", 400);
        Hairstyle h6 = new Hairstyle("Military Haircut", "Black", "Male", 300);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(h6);
    }
}

package objects;

public class Boy {
    private int age;

    public int getAge() {
        return age;
    }

    public Boy(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        if(this.age > age) {
            System.out.println("Age cannot be decreased.");
            return;
        }

        this.age = age;
    }
}

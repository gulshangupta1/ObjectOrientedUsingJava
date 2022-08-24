package capstone2;

public class Test {
    public static void main(String[] args) {
        Item apple = new Item("Apple", 25);
        Item milk = new Item("Milk", 50);
        Item newsPaper = new Item("News Paper", 20);

        Customer customer1 = new Customer(101, "Shadab", new Wallet(1000, true));

        customer1.addToCart(apple, 2);
        customer1.addToCart(milk, 10);
        customer1.addToCart(milk, 1);
        customer1.printCart();
        customer1.printWalletBalance();
        customer1.applyMilkOffer();
        customer1.printCart();
        customer1.getDiscount();

        customer1.purchase();
        customer1.printCart();
        customer1.printWalletBalance();

        System.out.println("========================================");

        Customer customer2 = new Customer(102, "Rahul", new Wallet(5000, true));
        customer2.addToCart(apple, 4);
        customer2.addToCart(milk, 12);
        customer2.printCart();
        customer2.removeFromCart(apple, 1);
        customer2.printCart();
        customer2.printWalletBalance();
        customer2.applyMilkOffer();
        customer2.printCart();
        customer2.getDiscount();

        customer2.purchase();
        customer2.printCart();
        customer2.printWalletBalance();


//        customer1.addToCart(apple, 1);
//        customer1.addToCart(milk, 2);
//
//        customer1.printCart();
//
//        customer1.purchase();
//        customer1.applyMilkOffer();
//        customer1.printCart();
//
//        customer1.printWalletBalance();

    }
}

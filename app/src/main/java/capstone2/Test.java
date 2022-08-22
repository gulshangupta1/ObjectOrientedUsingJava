package capstone2;

public class Test {
    public static void main(String[] args) {
        Item apple = new Item("Apple", 25);
        Item milk = new Item("Milk", 50);
        Item newsPaper = new Item("News Paper", 20);

        Customer customer1 = new Customer(101, "Shadab", new Wallet(1000, true));

        customer1.addToCart(apple, 2);
        customer1.addToCart(milk, 3);
        customer1.printCart();
        customer1.printWalletBalance();
        customer1.applyMilkOffer();
        customer1.printCart();
        customer1.getDiscount();

        customer1.purchase();
        customer1.printCart();
        customer1.printWalletBalance();











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

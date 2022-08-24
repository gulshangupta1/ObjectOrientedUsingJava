package capstone2;

public class Customer {
    int customerId; // represents customer id
    String customerName;       // represents customer name
    private final Cart cart;    // creates final Cart object for every customer object (has-a relationship)
    private final Wallet wallet;    // creates final Wallet object for every customer object (has-a relationship)

    private boolean milkOfferFlag = false;  // if offer applied the offer will not available again


    // to create Customer object we need to pass customer id, customer name and Wallet object
    public Customer(int customerId, String customerName, Wallet wallet) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.wallet = wallet;   // initializing Customer wallet object
        // creating Cart object when a new Customer object is created (has-a relationship)
        this.cart = new Cart();
    }

    // getter for customer id
    public int getCustomerId() {
        return customerId;
    }

    // setter for customer name
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    // getter for customer name
    public String getCustomerName() {
        return customerName;
    }

    // setter for customer name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // method for adding items to cart to call this method we neew to pass Item object and quantity of Item
    public void addToCart(Item item, int quantity) {
        // It will call Cart class addToCart() to add item into cart. Every customer object has a cart object
        this.cart.addToCart(item, quantity);
    }

    // method for adding items to cart to call this method we neew to pass Item object and quantity of Item
    public void removeFromCart(Item item, int quantity) {
        this.cart.removeFromCart(item, quantity);
    }

    // this method is used to provide discount to customer
    public void getDiscount() {
        // It will call Wallet class getDiscount(cartObject) method
        this.wallet.getDiscount(this.cart);     // Every Customer has-a Wallet and Cart object
    }

    // this method is used to purchase cart items
    public boolean purchase() {
        // Before purchasing first customer needs to pay the cart amount
        // Checking payment done or not by Wallet class pay() method
        boolean payment = this.wallet.pay(this.cart.getTotalCartBalance());
        if (payment) {  // If payment done then customer can purchase
            this.cart.clearCart();  // After purchase cart will be empty for that calling Cart class clearCart() method
            System.out.println("Purchased Successfully");
            return true;
        }
        else    //cart will be not empty if payment not done
            System.out.println("Insufficient Balance");
        return false;
    }

    // this method is used to print cart data of a customer
    public void printCart() {
        // calling Cart class printCart(cartObject) method and passing customer specific cart object
        this.cart.printCart(this.cart); // passing cart object
    }

    // used to apply milk offer
    public void applyMilkOffer() {
        // this will call Cart class applyMilkOffer(cartObject) to apply milk offer this method returns boolean value
        if (this.cart.applyMilkOffer(this.cart))    // if true then offer applied
            System.out.println("Milk offer applied");
        else    // else offer not applied
            System.out.println("Milk offer not applied");
    }

    // It will print wallet balance of a customer
    public void printWalletBalance() {
        // to print wallet balance calling Wallet class printWalletBalance(walletObject) method
        this.wallet.printWalletBalance(this.wallet);    // passing Wallet object of a customer (every customer object has-a wallet object)
    }

    // Used to add money to customer wallet passing amount
    public void addMoneyToWallet(double amount) {
        // calling Wallet class addMoneyToWallet(double) method to add money
        this.wallet.addMoneyToWallet(amount);   // passing amount
    }

    // This method will print total cart balance
    public void printTotalCartBalance() {
        System.out.println("Total cart amount: "+ this.cart.getTotalCartBalance());
    }
}

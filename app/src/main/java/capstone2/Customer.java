package capstone2;

public class Customer {
    int customerId;
    String customerName;
    private final Cart cart;
    private final Wallet wallet;

    private boolean milkOfferFlag = false;


    public Customer(int customerId, String customerName, Wallet wallet) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.wallet = wallet;
        this.cart = new Cart();
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void addToCart(Item item, int quantity) {
        cart.addToCart(item, quantity);
    }

    public void getDiscount() {
        this.wallet.getDiscount(cart);
    }

    public void purchase() {
        boolean payment = this.wallet.pay(this.cart.getTotalCartBalance());
        if (payment) {
            this.cart.clearCart();
            System.out.println("Purchased Successfully");
        }
    }

    public void printCart() {
        cart.printCart(this.cart);
    }

    public void applyMilkOffer() {
        this.cart.applyMilkOffer(this.cart);
    }

    public void printWalletBalance() {
        this.wallet.printWalletBalance(this.wallet);
    }

    public void addMoneyToWallet(double amount) {
        wallet.addMoneyToWallet(amount);
    }

    public void printTotalCartBalance() {
        System.out.println("Total cart amount: "+ cart.getTotalCartBalance());
    }
}

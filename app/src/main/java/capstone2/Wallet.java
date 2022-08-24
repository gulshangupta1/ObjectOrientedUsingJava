package capstone2;

public class Wallet {
    private double walletBalance;   // represents total wallet balance
    private boolean hasOffer = true;    // represents that wallet provider providing offer or not
    public static final double discountInPercent = 5.0;     // represents total discount in percentage

    // To create Wallet object need to pass wallet balance and has offer or not
    public Wallet(double walletBalance, boolean hasOffer) {
        this.walletBalance = walletBalance;
        this.hasOffer = hasOffer;
    }

    // getter for wallet balance
    public double getWalletBalance() {
        return walletBalance;
    }

    // getter for has offer
    public boolean isHasOffer() {
        return hasOffer;
    }

    // this method pays amount at the time of purchasing
    public boolean pay(double amount) {             // being called by Customer class purchase() method
        if (this.walletBalance < amount) {          // if cart amount greater than wallet total balance
            return false;                           // if payment not done then returning false
        }
        this.walletBalance -= amount;               // if payment done then updating the wallet balance
        return true;                                // after payment returning true
    }

    // used to get discount on cart amount
    public void getDiscount(Cart cart) {    // passing Cart object
        // if service provider not provides offer and cart amount is less than 100 customer will not get offer
        if (hasOffer != true || cart.getTotalCartBalance() < 100) {
            // checking why customer is not eligible for offer
            if (cart.getTotalCartBalance() < 100)       // cart amount is less tha 100
                System.out.println("Cart amount must be greater than pr equals to 100");
            else
                System.out.println("Offer not available");
            return;     // if customer not eligible for offer no need to go further
        }
        // if service provider provides offer and total cart amount is equals to greater than customer will get discount
       // updating cart balance after offer
        cart.setTotalCartBalance(cart.getTotalCartBalance() - ((discountInPercent / 100) * cart.getTotalCartBalance()));
        System.out.println(discountInPercent +"% discount applied successfully");
        System.out.println("Total cart amount: "+ cart.getTotalCartBalance());
    }

    // prints wallet balance of a wallet
    public void printWalletBalance(Wallet wallet) {
        System.out.println("Wallet balance: "+ wallet.getWalletBalance());
    }

    // method to add money to wallet
    public void addMoneyToWallet(double amount) {
        // checking amount
        if (amount < 1) {
            System.out.println("Amount must be more tha 1 rupee");
            return;     // if invalid amount no need to go further return here only
        }
        // otherwise update wallet balance
        walletBalance += amount;
        System.out.println("Money added to wallet successfully");
    }
}

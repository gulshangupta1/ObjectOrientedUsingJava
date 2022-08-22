package capstone2;

public class Wallet {
    private double walletBalance;
    private boolean hasOffer = true;
    public static final double discountInPercent = 5.0;

    public Wallet(double walletBalance, boolean hasOffer) {
        this.walletBalance = walletBalance;
        this.hasOffer = hasOffer;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public boolean isHasOffer() {
        return hasOffer;
    }

    public boolean pay(double amount) {
        if (this.walletBalance < amount) {
            System.out.println("Insufficient Balance");
            return false;
        }
        this.walletBalance -= amount;
        return true;
    }

    public void getDiscount(Cart cart) {
        if (hasOffer != true || cart.getTotalCartBalance() < 100) {
            if (cart.getTotalCartBalance() < 100)
                System.out.println("Cart amount must be greater than pr equals to 100");
            else
                System.out.println("Offer not available");
            return;
        }
        cart.setTotalCartBalance(cart.getTotalCartBalance() - (cart.getTotalCartBalance() / 20));
        System.out.println(discountInPercent +"% discount applied successfully");
        System.out.println("Total cart amount: "+ cart.getTotalCartBalance());
    }

    public void printWalletBalance(Wallet wallet) {
        System.out.println("Wallet balance: "+ wallet.getWalletBalance());
    }

    public void addMoneyToWallet(double amount) {
        if (amount < 1) {
            System.out.println("Amount must be more tha 1 rupee");
            return;
        }
        walletBalance += amount;
        System.out.println("Money added to wallet successfully");
    }
}

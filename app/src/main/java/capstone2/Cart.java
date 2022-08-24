package capstone2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Cart {
    //variable to represent total cart amount
    private double totalCartBalance;
    // represents cart data. Item stored in HashMap<k, v> data structure where key is item name and value is item quantity
    private Map<String, Integer> items = new HashMap<>();

    private int milkCount;  // represents total number of milk

    // to see milk offer is applied to the cart or nor (customer cant apply milk offer more than 1 time)
    private boolean milkOfferFlag = false;

    // getter for totalCartBalance
    public double getTotalCartBalance() {
        return totalCartBalance;
    }

    // setter for totalCartBalance
    public void setTotalCartBalance(double totalCartBalance) {
        this.totalCartBalance = totalCartBalance;
    }

    // getter for total number of milk
    public int getMilkCount() {
        return milkCount;
    }

    // used to clear the Cart
    public void clearCart() {
        this.items.clear();
    }

    // prints cart data
    public void printCart(Cart cart) {
        // if cart is empty
        if (cart.items.size() == 0) {
            System.out.println();
            System.out.println("Cart Data:");
            System.out.println("*********************************************");
            System.out.println("Cart is empty");    // cart empty message
            System.out.println("---------------------------");
            System.out.println();
            return;     // returning here only if cart is empty no need to check further
        }
        // if cart is not empty then displaying cart data
        System.out.println();
        System.out.println("Cart Data:");
        System.out.println("*********************************************");
        // printing items
        cart.items.forEach((k, v) -> System.out.println("Item name: "+ k +"\tQuantity: "+ v));
        System.out.println("---------------------------");
        System.out.println("Total cart balance: "+ getTotalCartBalance());
        System.out.println();
    }

    // used to add items with quantity into cart
    public void addToCart(Item item, int quantity) {    // need to pass Item object with quantity
        // if item already presents then updating only quantity
        if (items.containsKey(item.getItemName())) {
            this.items.put(item.getItemName(), items.get(item.getItemName()) + quantity);
        }
        else
            this.items.put(item.getItemName(), quantity);   // if not already available then inserting item with quantity into items which is HashMap
        // After adding to cart updating cart balance
        this.totalCartBalance = this.totalCartBalance + (item.getPrice() * quantity);
        System.out.println(item +" with quantity "+ quantity +" added to cart");    // printing success message
        // if item is milk and milk offer not applied then updating milk count
        if (item.getItemName().equalsIgnoreCase("Milk") && milkOfferFlag != true)
            this.milkCount += quantity;
    }

    // method to remove item from cart
    public void removeFromCart(Item item, int quantity) {     // need to pass Item object and quantity
        // it offer is applied and item is milk them customer will not be able to remove milk from cart
        if (milkOfferFlag==true && item.getItemName().equalsIgnoreCase("Milk")) {
            System.out.println("You have applied milk offer you cant remove milk item");
            return;             // returning no need to check further
        }
        if (this.items.containsKey(item.getItemName())) {     // if item already available
            if (quantity == this.items.get(item.getItemName()))    // if item quantity is equals to parameter quantity
                this.items.remove(item.getItemName());             // removing entry of item from HashMap
            else
                this.items.put(item.getItemName(), items.get(item.getItemName()) - quantity);       // if item quantity is not equals to parameter quantity then updating the quantity
            this.milkCount -= quantity;         // updating milk count
            System.out.println(item +" removed from cart with quantity "+ quantity);
            }
        else
            System.out.println("Cart does not contain this item");
    }

    // used to apply milk offer to cart
    public boolean applyMilkOffer(Cart cart) {
        // if customer has already applied offer then he is not eligible again
        if (cart.milkOfferFlag) {
            System.out.println("You have already applied milk offer");
            return false;           // if not eligible no need to check further
        }
        // if customer has not already applied offer but milk quantity is less
        if (cart.getMilkCount() < 2) {
            System.out.println("To add milk offer please purchase more than 2 milk");
            return false;           // if not eligible no need to check further
        }
        // otherwise customer will get milk offer
        if (cart.getMilkCount()==2 || this.getMilkCount()==3) {     // if cart has 2 or 3 milk then gets 1 milk extra
            items.put("Milk", items.get("Milk") + 1 );
        }
        else {
            items.put("Milk", items.get("Milk") + milkCount/2);     // per 2 milk gets 1 milk extra (by 2 get 1 free offer)
        }
        cart.milkOfferFlag = true;          // After applying offer customer will not be able to apply same offer
        return true;
    }
}

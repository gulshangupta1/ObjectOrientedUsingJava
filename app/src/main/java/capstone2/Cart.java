package capstone2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Cart {
    private double totalCartBalance;
    private Map<String, Integer> items = new HashMap<>();

    private int milkCount;

    private boolean milkOfferFlag = false;

    public double getTotalCartBalance() {
        return totalCartBalance;
    }

    public void setTotalCartBalance(double totalCartBalance) {
        this.totalCartBalance = totalCartBalance;
    }

    public int getMilkCount() {
        return milkCount;
    }

    public void clearCart() {
        this.items.clear();
    }

    public void printCart(Cart cart) {
        if (cart.items.size() == 0) {
            System.out.println();
            System.out.println("Cart Data:");
            System.out.println("*********************************************");
            System.out.println("Cart is empty");
            System.out.println("---------------------------");
            System.out.println();
            return;
        }
        System.out.println();
        System.out.println("Cart Data:");
        System.out.println("*********************************************");
        cart.items.forEach((k, v) -> System.out.println("Item name: "+ k +"\tQuantity: "+ v));
        System.out.println("---------------------------");
        System.out.println("Total cart balance: "+ getTotalCartBalance());
        System.out.println();
    }

    public void addToCart(Item item, int quantity) {
        if (items.containsKey(item.getItemName())) {
            this.items.put(item.getItemName(), items.get(item.getItemName()) + quantity);
        }
        else
            this.items.put(item.getItemName(), quantity);
        this.totalCartBalance = this.totalCartBalance + (item.getPrice() * quantity);
        System.out.println(item +" with quantity "+ quantity +" added to cart");
        if (item.getItemName().equalsIgnoreCase("Milk") && milkOfferFlag != true)
            this.milkCount += quantity;
    }

    public void removeFromCart(Item item, int quantity) {
        if (items.containsKey(item.getItemName())) {
            if (quantity == items.get(item.getItemName()))
                items.remove(item.getItemName());
            else
                items.put(item.getItemName(), items.get(item.getItemName()));
            this.milkCount -= quantity;
            System.out.println(item +" removed from cart with quantity "+ quantity);
            }
        else
            System.out.println("Cart does not contain this item");
    }

    public boolean applyMilkOffer(Cart cart) {
        if (cart.milkOfferFlag) {
            System.out.println("You have already applied milk offer");
            return false;
        }
        if (cart.getMilkCount() < 2) {
            System.out.println("To add milk offer please purchase more than 2 milk");
            return false;
        }
        cart.milkOfferFlag = true;
        if (cart.getMilkCount()==2 || this.getMilkCount()==3) {
            items.put("Milk", items.get("Milk") +1 );
        }
        else {
            items.put("Milk", items.get("Milk") + milkCount/2);
        }
        return true;
    }
}

package capstone1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    //static double fullRatio;
     private final String size;   // size can be Small, Medium, Large & we cant change Basket size after object creation
     private final int noOfLayers;    // total layers of basket & we cant change laye number later
     public ArrayList<Fruit>[] layer;   // to store fruits layer wise

     private int noOfFruits;    // total number of fruits stored in basket

     public Basket(String size) {
        this.size = size;
        // initializing maxFruitNo based on Basket size
        if (size.equalsIgnoreCase("Small")) {
            this.noOfLayers = 1;
        }
        else if (size.equalsIgnoreCase("Medium")) {
            this.noOfLayers = 3;
        }
        else {
            this.noOfLayers = 5;
        }
         layer = new ArrayList[noOfLayers];
        // for each array creating new ArrayList object
        for (int i=0; i<=noOfLayers-1; i++)
            layer[i] = new ArrayList<>();
    }

//    Getters and Setters
    public String getSize() {
        return size;
    }

    public int getNoOfLayers() {
        return noOfLayers;
    }

    public int getNoOfFruits() {
        return noOfFruits;
    }

    // Overloading method arrangeLayer() to store fruits layer wise
    public void arrangeLayer(List<Fruit> fruitList, int layerNo) {
//         maxSmallFruits = 10;
//         maxMediumFruits = 8;
//         maxLargeFruits = 4;


         double fullRatio = 0;
         for (Fruit fruit : fruitList) {
             if (fruit.getSize().equalsIgnoreCase("Small")) {
                 if (fullRatio >= 100) {
                     System.out.println("Insufficient space at layer: ."+ layerNo);
                     return;
                 }
                 fullRatio += 10.0;
             }
             else if (fruit.getSize().equalsIgnoreCase("Medium")) {
                 if (fullRatio >= 100) {
                     System.out.println("Insufficient space at layer: ."+ layerNo);
                     return;
                 }
                 fullRatio += 14.28;
             }
             else {
                 if (fullRatio >= 100) {
                     System.out.println("Insufficient space at layer: ."+ layerNo);
                     return;
                 }
                 fullRatio += 25;
             }
         }
        layer[layerNo].addAll(fruitList);
         noOfFruits += fruitList.size();
    }

    // method to print fruits inside basket layer wise
    public void printBasketLayers() {
        for (int i=0; i<=layer.length-1; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Layer "+ (int)(i+1) +" Fruits:");
            for (Object fruit : layer[i])
                System.out.println("Layer " + (int)(i+1) + " " + fruit);
            System.out.println("-----------------------------------");
        }
     }
}

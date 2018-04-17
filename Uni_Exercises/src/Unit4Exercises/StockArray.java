package Unit4Exercises;

import java.util.ArrayList;

public class StockArray {

    private ArrayList<StockItem> stock;

    public StockArray(int arrayLength) {
        //set the capacity of the array
        stock = new ArrayList<>(arrayLength);

        //set the initial size by populating the array with null references
        for (int i = 0; i < arrayLength; i++) {
            stock.add(null);
        }

    }

    public void addNewStockItem(String description, int price, int index) {
        if ((index >= 0) && (index < stock.size())) {
            if (price >= 0) {
                StockItem newItem = new StockItem(description, price);
                stock.set(index, newItem);
            }
        }
    }

    public void updateStockLevel(int index, int amount) {
        if ((index >= 0) && (index < stock.size()) && (stock.get(index) != null)) {
            stock.get(index).doDelivery(amount);
        }
    }

    public int noOfStockItems() {
        int itemCounter = 0;

        for (StockItem cell : stock) {
            if (cell != null) {
                itemCounter++;
            }
        }
        return itemCounter;
    }

    public void displayStockItem(int index) {
        if ((index >= 0) && (index < stock.size()) && (stock.get(index) != null)) {
            System.out.println(stock.get(index).toString());
        }
        else {
            System.out.println("No object or null");
        }
    }

    public void listAllStockItems() {
        for (StockItem cell : stock) {
            if (cell != null) {
                System.out.println(cell.toString());
            }
        }
    }

    //solution with arrays
    /*
    private StockItem stock[];

    public StockArray(int arrayLength) {
        stock = new StockItem[arrayLength];
    }

    public void addNewStockItem(String description, int price, int index) {
        if ((index >= 0) && (index < stock.length)) {
            if (price >= 0) {
                StockItem newItem = new StockItem(description, price);
                stock[index] = newItem;
            }
        }
    }

    public void updateStockLevel(int index, int amount) {
        if ((index >= 0) && (index < stock.length) && (stock[index] != null)) {
            stock[index].doDelivery(amount);
        }
    }

    public int noOfStockItems() {
        int itemCounter = 0;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                itemCounter++;
            }
        }
        return itemCounter;
    }

    public void displayStockItem(int index) {
        if ((index >= 0) && (index < stock.length) && (stock[index] != null)) {
            System.out.println(stock[index].toString());
        }
        else {
            System.out.println("No object or null");
        }
    }

    public void listAllStockItems() {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                System.out.println(stock[i].toString());
            }
        }
    }
    */

}

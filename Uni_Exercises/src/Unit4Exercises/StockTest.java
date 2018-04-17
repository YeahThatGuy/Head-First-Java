package Unit4Exercises;

public class StockTest {

    public static void main(String[] args) {

        StockArray stock = new StockArray(5);
        stock.addNewStockItem("wardrobe", 200, 2);
        stock.addNewStockItem("nightstand", 50,1);
        stock.addNewStockItem("rug", 5, 3);

        stock.updateStockLevel(2,10);
        System.out.println(stock.noOfStockItems());
        stock.displayStockItem(2);
        stock.listAllStockItems();
    }
}

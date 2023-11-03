package Week5;

import java.util.ArrayList;

public class stockList {
    private ArrayList<productClass> Products = new ArrayList<productClass>();

    public stockList() {
        System.out.println("StockList Initialised.");
    }

    public void addProduct(productClass Product) {
        Products.add(Product);
    }

    public void removeProduct(int Index) {
        Products.remove(Index);
    }

    public int findIndex(productClass Product) {
        for (int i = 0; i < Products.size(); i++) {
            if(Product.getName() == Products.get(i).getName()) {
                return i;
            }
        }
        return 0;
    }

    public void print() {
        for (productClass p : Products) {
            System.out.println(p.getName());
        }
    }

    
}

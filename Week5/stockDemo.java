package Week5;

public class stockDemo {

    public stockDemo() {
        run();
    }

    public void run() {
        productClass p1 = new productClass(0, "Product One", 27);
        productClass p2 = new productClass(1, "Product Two", 27);
        productClass p3 = new productClass(2, "Product Three", 27);
        stockList sl = new stockList();
        sl.addProduct(p1);
        sl.addProduct(p2);
        sl.addProduct(p3);
        sl.removeProduct(sl.findIndex(p3));
        sl.print();
    }
}

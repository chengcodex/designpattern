package creation.simplefactory;

public class Client {
    public static void main(String[] args) {
        Product product = SimpleFactory.createProduct(1);
        // do something with the product
    }
}
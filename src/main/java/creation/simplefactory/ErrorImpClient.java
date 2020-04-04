package creation.simplefactory;

public class ErrorImpClient {

    public static void main(String[] args) {
        int type = 1;
        Product product;
//        不应该糅合在一起，使用简单工厂模式。
        if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2) {
            product = new ConcreteProduct2();
        } else {
            product = new ConcreteProduct3();
        }
        // do something with the product
    }
}
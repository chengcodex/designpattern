package creation.factorymethod;

import creation.simplefactory.ConcreteProduct2;
import creation.simplefactory.Product;

public class ConcreteFactory2 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
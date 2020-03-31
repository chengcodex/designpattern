package creation.factorymethod;

import creation.simplefactory.ConcreteProduct1;
import creation.simplefactory.Product;

public class ConcreteFactory1 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
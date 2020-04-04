package creation.factorymethod;

import creation.simplefactory.Product;

public class ConcreteFactory extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
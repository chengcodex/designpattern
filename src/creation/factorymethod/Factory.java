package creation.factorymethod;

import creation.simplefactory.Product;

public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething() {
        Product product = this.factoryMethod();
        // do something with the product
    }
}
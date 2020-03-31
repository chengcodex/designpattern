package creation.factorymethod;

/**
 * @author xiao
 * @date 2020/3/31 23:54
 */
public class Client {
    public static void main(String[] args) {
        Factory concreteFactory1 = new ConcreteFactory1();
        concreteFactory1.doSomething();
    }
}

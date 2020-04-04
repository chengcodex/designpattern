package structural.flyweight;

/**
 * @author xiao
 * @date 2020/4/4 13:02
 */
public class Client {

    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight flyweight1 = factory.getFlyWeight("aa");
        FlyWeight flyweight2 = factory.getFlyWeight("aa");
        flyweight1.operation("x");
        flyweight2.operation("y");
    }
}
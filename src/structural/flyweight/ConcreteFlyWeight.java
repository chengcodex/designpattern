package structural.flyweight;

/**
 * @author xiao
 * @date 2020/4/4 12:34
 */
public class ConcreteFlyWeight implements FlyWeight {
    /**
     * 内部状态
     */
    private String intrinsicState;
    public ConcreteFlyWeight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }
    @Override
    public void operation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("IntrinsicState: " + intrinsicState);
        System.out.println("ExtrinsicState: " + extrinsicState);
    }
}

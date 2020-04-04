package structural.flyweight;

import java.util.HashMap;

/**
 * @author xiao
 * @date 2020/4/4 12:40
 */
public class FlyWeightFactory {

    private HashMap<String, FlyWeight> flyweights = new HashMap<>();

    public FlyWeight getFlyWeight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            //如果不存在,新建并放入享元池
            FlyWeight flyWeight = new ConcreteFlyWeight(intrinsicState);
            flyweights.put(intrinsicState, flyWeight);
            return flyWeight;
        }
        return flyweights.get(intrinsicState);
    }
}

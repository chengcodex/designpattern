package creation.singleton;

/**
 * @author xiao
 * @date 2020/3/30 23:58
 * 使用饿汉式
 */
public class SingletonFour {
    private static SingletonFour singletonFour = new SingletonFour() ;
    private SingletonFour(){

    }

    public static SingletonFour getUniqueInstance() {
        return singletonFour;
    }
}

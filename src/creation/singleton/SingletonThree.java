package creation.singleton;

/**
 * @author xiao
 * @date 2020/3/30 23:54
 * 饿汉式--线程安全 使用volatile 还是对初期性能有所影响
 */
public class SingletonThree {
    private volatile static SingletonThree singletonThree;

    private SingletonThree() {
    }

    public SingletonThree getUniqueInstance() {
        if (singletonThree == null) {
            synchronized (SingletonThree.class) {
                if (singletonThree == null) {
                    singletonThree = new SingletonThree();
                }
            }
        }
        return singletonThree;
    }
}

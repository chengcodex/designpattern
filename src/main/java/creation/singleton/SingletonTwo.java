package creation.singleton;

/**
 * @author xiao
 * @date 2020/3/30 23:52
 * 饿汉式--线程安全 synchronized方法 粒度太大 运行缓慢
 */
public class SingletonTwo {
    private static SingletonTwo singletonTwo;

    private SingletonTwo() {
    }

    public static synchronized SingletonTwo getUniqueInstance() {
        if (singletonTwo == null) {
            singletonTwo = new SingletonTwo();
        }
        return singletonTwo;
    }
}

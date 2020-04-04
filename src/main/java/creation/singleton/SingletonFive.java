package creation.singleton;

/**
 * @author xiao
 * @date 2020/3/31 00:01
 * 线程安全 推荐使用
 */
public class SingletonFive {
    private SingletonFive(){
    }

    public static SingletonFive getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        public static final SingletonFive INSTANCE = new SingletonFive();
    }
}

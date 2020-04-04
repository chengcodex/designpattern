package creation.singleton;

/**
 * @author xiao
 * @date 2020/3/30 23:50
 * 饿汉式 -- 线程不安全
 */
public class SingletonOne {
    private static SingletonOne singletonOne;
    private SingletonOne(){
    }

    public static SingletonOne getUniqueInstance() {
        if(singletonOne==null){
            singletonOne = new SingletonOne();
        }
        return singletonOne;
    }

}

package structural.proxy.v10;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * v10: 横切代码与业务逻辑代码分离 AOP 通过反射观察生成的代理对象
 * jdk反射生成代理必须面向接口，这是由Proxy的内部实现决定的
 *
 *
 * before after也是切面的原理
 *
 * 同目录下的是本例中动态代理生成的class字节码，通过设置把他导出来的
 */
public  class Tank implements Movable {

    /**
     * 模拟坦克移动了一段儿时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        //jdk1.8
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //jdk11
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

        Movable m = (Movable)Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class}, //tank.class.getInterfaces()
                new TimeProxy(tank)
        );

        m.move();

    }
}

class TimeProxy implements InvocationHandler {
    Movable m;

    public TimeProxy(Movable m) {
        this.m = m;
    }

    public void before() {
        System.out.println("method start..");
    }

    public void after() {
        System.out.println("method stop..");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Arrays.stream(proxy.getClass().getMethods()).map(Method::getName).forEach(System.out::println);

        before();
        Object o = method.invoke(m, args);
        after();
        return o;
    }

}

interface Movable {
    void move();
}
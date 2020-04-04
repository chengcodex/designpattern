package structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * CGLIB实现动态代理不需要接口
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank = (Tank)enhancer.create();
        tank.move();
    }
}

class TimeMethodInterceptor implements MethodInterceptor {

    /**
     *
     * @param o 代理生成的对象
     * @param method 代理对象调用的方法,注意不能调用，否则会递归调用直到gg
     * @param args 参数列表
     * @param methodProxy 父类的方法 也就是被代理对象的方法
     * @return 返回结果
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println(o.getClass().getSuperclass().getName());
        System.out.println("before");
        Object result = null;
        result = methodProxy.invoke(o, args);
        System.out.println("after");
        return result;
    }
}

 class Tank {
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



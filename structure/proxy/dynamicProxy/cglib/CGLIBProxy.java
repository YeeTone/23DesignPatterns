package structure.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLIBProxy implements MethodInterceptor{

    private Object target;
    public Object getInstance(final Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("敌军还有10秒钟到达战场哇咔咔！全体上刺刀，准备进攻！");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("击退敌军嘻哈哈！赶紧喝半斤地瓜烧！");
        return result;
    }
}

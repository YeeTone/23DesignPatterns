package structure.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private final Object object;

    public DynamicProxyHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("考试要来了！赶紧考前突击一下！");
        Object result = method.invoke(object,args);
        System.out.println("考完试了！赶紧出去嗨皮一下！");
        return result;
    }
}

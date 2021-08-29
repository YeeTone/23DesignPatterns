package structure.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class DynamicProxyDemo {
    public static void main(String[] args) {
        Examer examer = new Student("YeeTone");
        Examer proxyExamer =
                (Examer) Proxy.newProxyInstance
                        (Examer.class.getClassLoader(),new Class<?>[]{Examer.class}, new DynamicProxyHandler(examer));

        proxyExamer.chineseExam();
        proxyExamer.mathExam();
        proxyExamer.englishExam();
        proxyExamer.scienceExam();
    }
}

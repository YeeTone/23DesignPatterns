# 观察者模式的标准实现@Java
![image](https://user-images.githubusercontent.com/64548919/131465253-f2c9e857-1916-4956-b2b1-7a0dc892c5bd.png)

## 1. 为什么要学习观察者模式？
在现有的软件设计体系下，对象往往并不是独立存在的。对象的变化会使得其他多个对象也需要做出相应的变化，执行相应的动作。        

观察者模式就刚好能够解决这一问题，当被观察的对象发生变化的时候，其能够通知所有观察者，使得都收到同步的通知。        

## 2. 观察者模式能解决什么问题？
观察者模式主要能够解决一对多的对象关系。      
当对象被修改的时候，所有观察它的对象都会收到通知，并执行相应的操作，从而满足对象之间的变更，

## 3. 观察者模式有哪些必要的实现步骤？
必要的实现步骤：     
1. 定义观察者接口，内部需要定义对象受到通知时执行动作的对应方法；       
2. 定义具体观察者类，实现观察者接口，实现其中的对应方法；     
3. 定义被观察者抽象类，内部封装观察者容器和定义通知容器中所有观察者的对应方法；        
4. 实现被观察者类，使得被观察者在受到更新的时候，能够通知所有容器中的观察者并执行相应行为；       


## 4. 观察者模式有哪些优缺点？
优点：       
1. 观察者和被观察者耦合关系降低，是抽象耦合，符合“依赖倒转原则”；       
2. 建立了被观察者在受到变化时的触发器机制，使得观察者对象也可以同步更新；         

缺点：      
1. 观察者和被观察者没有完全解耦，有可能循环引用使得程序报错；       
2. 当被观察者的容器中有过多观察者对象时，通知的发布会消耗大量时间，程序效率会有损失。     

## 5. 观察者模式和之前提到的中介者模式有哪些异同？
相同点：       
1. 两者都是行为型模式；       
2. 两者设计出来的目标都是要解决一对多的对象之间的通讯问题；       
3. 中介者和被观察者都有封装List的集合对象，都有循环通知的过程；        

不同点：      
1. 观察者模式侧重与解决一对多的对象通讯问题，类似于老师给学生上课；       
   而中介者模式则主要是解决多对多的对象通讯问题，类似于学生之间的相互讨论；       
2. 观察者模式用“单向通知”形容比较准确，而中介者模式可以“双向通知”；
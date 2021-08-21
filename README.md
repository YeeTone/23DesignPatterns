# 23种设计模式的标准实现@Java@Updating
在开始阅读代码之前，您有必要先阅读以下这几个问题：    
## 1. 设计模式的基础原则是什么？
1. 编程面向接口，而非面向实现；    
2. 优先使用对象组合而非类继承，来实现功能的调用关联。   
    
## 2. 学习设计模式有什么用？
1. 提供程序员之间的共同交流语言平台，使得所有代码可理解性增强；    
2. 设计模式提供了在软件工程实战中解决问题的方法策略，以及其背后的思想，减少程序员后续面对问题时所耗费的时间和精力。   
    
## 3. 设计模式有哪些类型及其下属分类？
主要分为三种类型：**创建型模式，结构型模式，行为型模式**。    
    
### I. 创建型模式： 
i. 工厂模式（Factory Pattern）     
ii. 抽象工厂模式（Abstract Factory Pattern）    
iii. 单例模式（Singleton Pattern）    
iv. 建造者模式（Builder Pattern）   
v. 原型模式（Prototype Pattern）    
    
### II. 结构型模式：    
i. 适配器模式（Adapter Pattern）    
ii. 桥接模式（Bridge Pattern）     
iii. 过滤器模式（Filter Pattern）    
iv. 组合模式（Composite Pattern）    
v. 装饰器模式（Decorator Pattern）     
vi. 外观模式（Facade Pattern）     
vii. 享元模式（Flyweight Pattern）     
viii. 代理模式（Proxy Pattern）    
    
### III. 行为型模式：     
i. 责任链模式（Chain of Responsibility Pattern）   
ii. 命令模式（Command Pattern）    
iii. 解释器模式（Interpreter Pattern）     
iv. 迭代器模式（Iterator Pattern）    
v. 中介者模式（Mediator Pattern）    
vi. 备忘录模式（Memento Pattern）    
vii. 观察者模式（Observer Pattern）    
ix. 状态模式（State Pattern）    
x. 空对象模式（Null Object Pattern）    
xi. 策略模式（Strategy Pattern）    
xii. 模板模式（Template Pattern）    
xiii. 访问者模式（Visitor Pattern）    

## 4. 三大设计模式的侧重点分别是什么？
创建型模式：侧重于解决实例对象的获取问题，将实例化对象的过程进行抽象处理，从而实现更加灵活地获取对象。     
结构性模式：侧重于解决对象的组成和对象之间的调用依赖关系，从而实现各种类之间的组装与交互。    
行为型模式：侧重于解决对象和类的行为模式，以及不同类之间的通讯关系。    

## 5. 设计模式的六大原则是什么？   
六大原则简称**SOLID**
    
1. 开闭原则     
核心语句：**对扩展开放，对修改关闭。**    
语句解读：在程序需要扩展时，原本代码不能被修改，而应该在外部做扩展。    
语法基础：接口（interface）和抽象类（abstract class）
     
2. 里氏代换原则    
核心语句：**任何父类出现的地方，一定能够被子类所替代。**    
语句解读：子类对象能够替换程序中父类对象的位置，并且原本程序的正确性仍然能够得到保证。    
语法基础：父类与子类之间的继承关系。   
     
3. 依赖倒转原则     
核心语句：**针对接口和抽象类编程，而非针对具体实现类编程。**    
语句解读：当参数列表等等区域有具体对象参数时，应当尽可能将具体对象替换为抽象对象/接口对象。    
语法基础：同开闭原则，因为依赖倒转原则是开闭原则的基础。    
    
4. 接口隔离原则
核心语句：**客户端不应该依赖它不需要的接口。**    
语句解读：不能定义一个大而杂的接口，一个接口不应该承担与它无关的接口定义，尽可能使得接口体量最小化。    
语法基础：同一个类允许实现多个接口。    

# 23种设计模式的标准实现@Java@Updating
在开始阅读代码之前，您有必要先阅读以下这几个问题：    
## 1. 设计模式的基础原则是什么？
1. 编程面向接口，而非面向实现；    
2. 优先使用对象组合而非类继承，来实现功能的调用关联。   
    
## 2. 学习设计模式有什么用？
1. 提供程序员之间的共同交流语言平台，使得大部分代码可理解性增强；    
2. 设计模式提供了在软件工程实战中解决问题的方法策略，以及其背后的思想，减少程序员后续面对问题时所耗费的时间和精力。   
    
## 3. 设计模式有哪些类型及其下属分类？
主要分为三种类型：**创建型模式，结构型模式，行为型模式**。    
    
### I. 创建型模式： 
1. 工厂模式（Factory Pattern）     
2. 抽象工厂模式（Abstract Factory Pattern）    
3. 单例模式（Singleton Pattern）    
4. 建造者模式（Builder Pattern）   
5. 原型模式（Prototype Pattern）    
    
### II. 结构型模式：    
1. 适配器模式（Adapter Pattern）    
2. 桥接模式（Bridge Pattern）     
3. 过滤器模式（Filter Pattern）    
4. 组合模式（Composite Pattern）    
5. 装饰器模式（Decorator Pattern）     
6. 外观模式（Facade Pattern）     
7. 享元模式（Flyweight Pattern）     
8. 代理模式（Proxy Pattern）    
    
### III. 行为型模式：     
1. 责任链模式（Chain of Responsibility Pattern）   
2. 命令模式（Command Pattern）    
3. 解释器模式（Interpreter Pattern）     
4. 迭代器模式（Iterator Pattern）    
5. 中介者模式（Mediator Pattern）    
6. 备忘录模式（Memento Pattern）    
7. 观察者模式（Observer Pattern）    
8. 状态模式（State Pattern）    
9. 空对象模式（Null Object Pattern）    
10. 策略模式（Strategy Pattern）    
11. 模板模式（Template Pattern）    
12. 访问者模式（Visitor Pattern）    

## 4. 三大设计模式的侧重点分别是什么？
1. 创建型模式：侧重于解决实例对象的获取问题，将实例化对象的过程进行抽象处理，从而实现更加灵活地获取对象。     
（核心：对象从哪里获取实例？）     
3. 结构性模式：侧重于解决对象的组成和对象之间的调用依赖关系，从而实现各种类之间的组装与交互。    
（核心：对象如何进行组装嵌套？）    
5. 行为型模式：侧重于解决对象和类的行为模式，以及不同类之间的通讯关系。    
（核心：对象如何相互调用并进行通讯？）    

## 5. 设计模式的六大原则是什么？   
六大原则简称**SOLID**
    
1. 开闭原则（Open Close Principle）        
核心语句：**对扩展开放，对修改关闭。**    
语句解读：在程序需要扩展时，原本代码不能被修改，而应该在外部做扩展。    
语法基础：接口（interface）和抽象类（abstract class）
     
2. 里氏代换原则（Liskov Substitution Principle）    
核心语句：**任何基类可以出现的地方，子类一定可以出现。**    
语句解读：子类对象能够替换程序中父类对象的位置，并且原本程序的正确性仍然能够得到保证。    
语法基础：父类与子类之间的继承关系。   
     
3. 依赖倒转原则（Dependence Inversion Principle）     
核心语句：**针对接口和抽象类编程，而非针对具体实现类编程。**    
语句解读：当参数列表等等区域有具体对象参数时，应当尽可能将具体对象替换为抽象对象/接口对象。    
语法基础：同开闭原则，因为依赖倒转原则是开闭原则的基础。    
    
4. 接口隔离原则（Interface Segregation Principle）
核心语句：**客户端不应该依赖它不需要的接口。**    
语句解读：不能定义一个大而杂的接口，一个接口不应该承担与它无关的接口定义，尽可能使得接口体量最小化。    
语法基础：同一个类允许实现多个接口。     
     
5. 最少知道原则/迪米特法则（Demeter Principle）    
核心语句：**一个类对于其他类知道的越少越好。**    
语句解读：一个类对象应当尽可能少的与其他类对象发生相互作用。每一个类对象对其他的对象都只有最少的知识，而且局限于那些与本对象密切相关的类对象。    
语法基础：类对象不可变性的可实现性，类对象内部成员的访问控制，类对象之间的相互封装。    
     
6. 合成复用原则（Composite Reuse Principle）    
核心语句：**尽量使用对象组合,而不是继承来达到复用的目的。**    
语句解读：类对象在尝试调用其他对象时，应当尽可能使用对象嵌套的方式来进行对象利用，而非类之间的继承。   
语法基础：类对象的相互封装。    

## 6. 优秀的设计模式应该具有哪些特征？
### I. 代码复用
C/C++，Java，Python等等一大批编程语言，都支持编程中方法体的定义与使用。      
这些语言的Compilers的开发者开发这一功能就是基于代码复用的考虑。     
相较于重新写可用功能的代码来说，将已经写好并通过功能测试的代码重新使用可以大幅度地减少开发所需要的精力和时间。      
学习设计模式有一方面就是出于对代码复用的考虑，尽管这并不容易，也很烧脑子，会使得对象之间的关系进一步复杂化。       
     
代码复用有三个层次：底层是类，包和库；顶层是框架；而设计模式则刚好位于中间，架设着类库与框架之间的桥梁。      
优秀的设计模式可以让代码尽可能复用，可以节约程序员的时间与头发，是程序员们孜孜不倦追求的目标！

### II. 可扩展性
需求的变动是让程序员既爱又恨的事情：      
需求变更大幅且频繁，则程序员面对shit山一样的代码时，重设架构无异于“难于上青天”；      
需求一直保持不变，则程序员就没有存在的必要，就会面临失业的风险。     
这时候，程序保留可扩展性就相当于为程序员留了一条“后路”，让程序员能够面对频繁更迭的需求仍能处变不惊，安若泰山。      
苏轼说过：“盖将自其变者而观之，则天地曾不能以一瞬”，世界是变化的，没有人能够100%地预测到下一步需求会怎么变化。       
因此优秀的设计模式能够保住程序员的饭碗，是程序员必须掌握的必修课！

# 不符合条件的就扔掉 --过滤器模式的具体实现@Java
![image](https://user-images.githubusercontent.com/64548919/131213682-f60f577b-a634-479e-bbf1-e9bf055591e4.png)
## 1. 为什么要学习过滤器模式？
有时候（话说为什么每次的开头都是“有时候”啊喂！），我们需要类似数据库SQL语言的where语句对收集到的对象对象进行筛选，过滤掉不需要的对象。      
如果单纯使用循环+if条件判断的话，会导致筛选条件增加的时候，需要重复/修改以往代码，容易出现问题。      
过滤器模式有助于筛选符合条件的对象，特别是筛选条件过于复杂的时候。       
## 2. 过滤器模式能解决什么问题？
过滤器模式能够协助用户选择其所需要的对象，并减少代码出错的可能性。      
## 3. 过滤器模式有哪些核心步骤？
核心步骤有以下几个：     
1. 对于需要过滤的类，对需要过滤对应的属性书写get方法；     
2. 创建一个接口Criteria，规定需要的过滤方法接口；      
3. 书写多个子类实现该接口，利用多态实现接口的多样化。    

## 4. 这个过滤器的设计参考了什么数据结构？
树。这个过滤器的AndCriteria和OrCriteria使用了二叉树，对于符合条件对象的筛选，使用二叉树的深度优先搜索来筛选符合条件的对象。      

## 5. 过滤器模式在曾经的项目中有什么应用？
2021春季学期的数据库Project2表结构中，先修课程的关系设计就使用了过滤器模式。

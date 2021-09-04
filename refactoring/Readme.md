# 重构不优雅的代码 
## --让现有代码变得更加优雅，更加稳定！
以下部分内容的参考来源有两处：       
1. 《重构 改善既有代码的设计》；         
2. 博客园链接：https://www.cnblogs.com/matchcolor/archive/2010/08/01/1784968.html          

## 1. 什么是重构？
定义：重构就是在不改变软件系统外部行为的前提下，改善它的内部结构；        
本质：对已经可用的代码重组，改进它的设计和内部结构；       
目的：最大限度减少代码整理过程中引入错误的几率；        

## 2. 什么样的代码需要重构？
### 2.1 重复代码
01. 重复代码（Duplicated Code）             

### 2.2 体积过大
02. 方法过长（Long Method）       
03. 类体过大（Large Class）            
04. 参数太长（Long Parameter List）     

### 2.3 功能缺陷
05. 对未来纸上谈兵（Speculative Generality）       

### 2.4 类之间的依赖关系
06. 发散式变化（Divergent Change）        
07. 散弹式修改（Shotgun Surgery）       
08. 数据泥团（Data Clumps）      
09. 平行继承体系（Parallel Inheritance Hierarchies）       
10. 令人迷惑的临时值域（Temporary Field）        
11. 过度耦合消息链（Message Chains）      
12. 中间人事太多（Middle Man）       
13. 禁忌之恋（Inappropriate Intimacy）        

### 2.5 体系设计缺陷
14. 身在曹营心在汉（Feature Envy）       
15. 基本类型偏执（Primitive Obsession）        
16. switch惊悚现身（Switch Statement）       
17. 冗赘类（Lazy Class）        
18. 异曲同工之类（Alternative Classes with Different Interfaces）          
19. 不完美的库类（Incomplete Library Class）           
20. 纯质数据类（Data Class）          
21. 拒绝继承遗赠（Refused Bequest）       

### 2.6 注释过多
22. 注释过多（Comments）

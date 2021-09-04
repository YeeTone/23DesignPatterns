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

## 3. 有哪些重构代码的方法？
参考链接来源：https://www.cnblogs.com/matchcolor/archive/2010/08/02/1784888.html      

### 3.1 重新组织函数
1. 提炼函数（Extract Method）           
2. 内联函数（Inline Method）           
3. 内联临时变量（Inline Temp）           
4. 以查询取代临时变量（Replace Temp with Query）           
5. 引入解释性变量（Introduce Explaining Variable）           
6. 分解临时变量（Split Temporary Variable）           
7. 移除对参数的赋值（Remove Assignments to Parameters）           
8. 以函数对象取代函数（Replace Method with Method Object）           
9. 替换算法（Substitute Algorithm）           

### 3.2 在对象之间搬移特性
10. 搬移函数（Move Method）           
11. 搬移字段（Move Field）           
12. 提炼类（Extract Class）           
13. 将类内联化（Inline Class）           
14. 隐藏委托关系（Hide Delegate）           
15. 移除中间人（Remove Middle Man）           
16. 引入外加函数（Introduce Foreign Method）           
17. 引入本地扩展（Introduce Local Extension）           

### 3.3 重新组织数据
18. 自封装字段（Self Encapsulate Field）           
19. 以对象取代数据值（Replace Data Value with Object）           
20. 将值对象改为引用对象（Change Value to Reference）           
21. 将引用对象改为值对象（Change Reference to Value）           
22. 以对象取代数组（Replace Array with Object）           
23. 复制“被监视数据”（Duplicate Observed Data）           
24. 将单向关联改为双向关联（Change Unidirectional Association to Bidirectional）           
25. 将双向关联改为单向关联（Change Bidirectional Association to Unidirectional）           
26. 以字面常量取代魔法数（Replace Magic Number with SymBolic Constant）           
27. 封装字段（Encapsulated Field）           
28. 封装集合（Encapsulated Collection）           
29. 以数据类取代记录（Replace Record with Data Class）           
30. 以类取代类型码（Replace Type Code with Class）           
31. 以子类取代类型码（Replace Type Code with Subclass）           
32. 以状态/策略取代类型码（Replace Type Code with State/Strategy）           
33. 以字段取代子类（Replace Subclass with Field）           

### 3.4 简化条件表达式
34. 分解条件表达式（Decompose Conditional）           
35. 合并条件表达式（Consolidate Conditional Expression）           
36. 合并重复的条件片段（Consolidate Duplicate Conditional Fragments）           
37. 移除控制标记（Remove Control Flag）           
38. 以卫语句取代嵌套条件表达式（Replace Nested Conditional with Guard Clauses）           
39. 以多态取代条件表达式（Replace Conditional with Polymorphism）           
40. 引入Null 对象（Introduce Null Object）           
41. 引入断言（Introduce Assertion）           

### 3.5 简化函数调用
42. 函数改名（Rename Method）           
43. 添加参数（Add Parameter）           
44. 移除参数（Remove Parameter）           
45. 将查询函数和修改函数分离（Separate Query form Modifier）           
46. 令函数携带参数（Parameterize Method）           
47. 以明确函数取代参数（Replace Parameter with Explicit Methods）           
48. 保持对象完整（Preserve Whole Object）           
49. 以函数取代参数（Replace Parameter with Methods）           
50. 引入参数对象（Introduce Parameter Object）           
51. 移除设置函数（Remove Setting Method）           
52. 隐藏函数（Hide Method）           
53. 以工厂函数取代构造函数（Replace Constructor with Factory Method）           
54. 封装向下转型（Encapsulate Downcast）           
55. 以异常取代错误码（Replace Error Code with Exception）           
56. 以测试取代异常（Replace Exception with Test）           

### 3.6 处理概括关系
57. 字段上移（Pull Up Field）           
58. 方法上移（Pull Up Method）           
59. 构造函数本体上移（Pull Up Constructor Body）           
60. 函数下移（Push down Method）           
61. 字段下移（Push down field）           
62. 提炼子类（Extract Subclass）           
63. 提炼超类（Extract Superclass）           
64. 提炼接口（Extract Interface）           
65. 折叠继承体系（Collapse Hierarch）           
66. 塑造模板函数（Form Template Method）           
67. 以委托取代继承（Replace Inheritance with Delegation）           
68. 以继承取代委托（Replace Delegation with Inheritance）           



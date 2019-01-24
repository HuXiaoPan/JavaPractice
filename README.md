# JavaPractice

switch穿透性
1.5版本的革新
JVM的内存划分：寄存器，本地方法栈，方法和数据共享区，方法栈，堆。
main压栈运行
数组的越界异常和空指针异常

##D04
方法
编译后class文件先进入内存方法区>main方法进栈运行>main调用的方法进栈执行>方法结束出栈（弹栈）
方法的重载，同名方法的签名不同（overload）
参数传递，方法参数是引用类型
类是对象的模板
new对象时，JVM在堆中开辟空间，给属性赋默认值。
ArrayList不存储基本类型，需要装箱

##D05
习题：
1.奇数求和
2.水仙花数（做过了）
3.ASCII编码表循环打印
4.99乘法表
5.索引逆序
6.选择排序
7.冒泡排序

ASCII编码表
指针思想
二分查找法

eclipse的使用（这特么安装不上）
eclipse包括其他的IDE和编辑器的快捷操作有时间归纳整理一下

##D06
面向对象
封装
继承
抽象类
覆写
接口：接口中只能常量定义public static final 常量类型 常量名 = 常量值;
多态：多态要重点看一看
instanceof关键字
向上转型/向下转型
this()构造器必须在构造方法的第一行
final修饰不可被继承、不能重写、不能改变、地址不变
static 静态区
匿名对象
内部类和局部内部类
匿名内部类（程序员都是懒货！！！）
包package
代码块/静态代码块

##D07
API
健壮性判断
常量池

##D08
包装类
自动装箱和自动拆箱
BigInteger和BigDecimal
面向接口编程
泛型

##D09
堆栈、队列、数组、链表
斗地主项目

##D10
Error/Exception
RuntimeException运行时期异常
IO流

##D11
IO流的写入写出
福彩机选小程序
转换流和缓冲流
Properties类
对象的序列化和反序列化（序列化流）
transient瞬态拒绝序列化
标记型接口Serializable
序列化序列号冲突问题：自定义序列号
打印流
commons-io

##D12
多线程
分时调度抢占模式
主线程
Thread类
runnable接口
高内聚低耦合
线程池
线程安全问题
同步代码块
线程锁（对象监视器）
Lock类
死锁
wait和notify

##D13
MySQL
JDBC和其驱动
数据库的链接
工具类的编写
配置文件的应用
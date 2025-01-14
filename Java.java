/*
1、类和对象:
类是对现实事物的抽象，是一种抽象的数据类型，类定义了对象
对象是类的实体
2、封装：将数据和对数据的操作放到一起
3、将类看做接口和实现两部分
	接口：类的普通用户所能进行的操作，向外提供的部分，向外暴露的部分
	实现：类的使用者看不到的部分，为类的功能提供了支持与服务
4、对象变量是对象的管理者，而不是所有者
5、类的成员变量一般为私有被private修饰，除非你有非常合理的理由不这么做
	类内部值类的成员函数以及定义初始化
6、一个.java文件就是一个编译单元，一个编译单元可以有多个类，但只能有一个被public修饰的类
7、包：涉及包之间的访问要进行import导包，否则要用类全名进行访问，包名加类名
8、迭代器提供了访问集合的统一入口
9、对象数组中每个元素都是对象的管理者，而非对象本身
10、子类继承父类，继承成功，父类成员已经存在子类中，只是‘存而未现’
子类继承父类，父类中的所有成员都会被子类继承，只是父类私有的子类无法访问而已
子类存在和父类同名的成员，父类相应成员就会被隐藏，在子类中使用的是子类中的成员，在父类中，
使用的是父类中的成员，两个互不干扰
11、Java对象变量是多态的，能保存不止一种类型的对象，能保存声明类型的对象或者声明类型的子类对象

对象调用方法时，确定调用的是哪个方法(是父类中的方法或者是子类继承自父类的方法)，这个事件叫做绑定
	Java多态的实现技术是动态绑定，确定父类引用实际上是指向子类中的哪一个
	Java对象变量是多态的，能保存不止一种类型的对象，也就是说能保存父类对象，或者子类对象、
	动态绑定：根据对象的动态类型、运行时类型来决定，
	静态绑定：根据变量声明的类型来决定
	静态类型、动态类型两者有时候是一致的有时候不是一致的
12、Java中不存在对象对对象的赋值
	String s = "hello";
	s = "world";
	s管理内容是"hello"的对象，然后s 管理内容为"world"的对象
	并不是将"hello"的内容替换为"world"
Demo extends Item
Item item = Demo;  // 只是将子类当做父类来使用，而不是转变子类类型为父类

14、抽象函数用来表达概念而无法实现具体代码的方法
	抽象类，用来表达概念而无法创建实例的类
一个类继承了抽象类，必须将里面的所有抽象方法重写，否则该类也是抽象类
15、接口使一种更为严格的抽象类，类实现某个接口，可以转化为接口类型，具有了接口所规定的功能，
接口增加了许多类需要实现的功能，接口的出现使很多人实现一个项目变得容易
提出对别人要求，只提出一个接口就行
你有任何的东西给我都要满足接口规范
面向接口编程，接口使各个模块有效的隔离开来，但是接口的使用也使得代码量膨胀
16、通过add将一个控件添加到容器里面
17、Java内部类可以看做外部类的成员，具有成员的权限，内部类可以直接访问外部类成员
匿名类是继承了某个类或者实现了某个接口的匿名子类对象
欧同类可以继承实现同时存在，匿名类继承实现只能选其一
内部类包括局部内部类(函数内部)，成员内部类，成员内部类可以直接访问外部类成员，包括私有成员
局部内部类可以直接访问外部类成员，包括私有成员，还可以访问方法内的(局部内部类所在的方法内的)被final修饰的局部变量
18、Java swing消息机制广泛使用内部类，匿名类，因为当有很多控件的时候起名字很麻烦，因此通过内部类，匿名类很方便
19、JFrame上面添加(add)JPanel，每当调用frame.repaint();的时候，就会调用JPanel中的paint()方法
实现 数据和表现的分离，表现可以有多种形式，表现发生改变的时候，不会影响数据
数据整体改变，整体repaint，而不用关注某个区域变化了，某个区域没有变化，只画变换的区域，整体repaint反而是最简单经济的方式
getHigth()、getWidth()要和Cells[][]数组第一维度、第二维度相对应，而不至于下标越界

20、MVC设计模式，数据、表现、控制三者分离
model: 保存和维护数据，提供接口使得外部可以修改数据，通知view进行刷新
view: 从model获得数据，进行表现
control: 从用户获得输入，根据输入调整数据(用户的操作)
在这个MVC模式中，用户的操作不直接修改界面上的显示(用户的鼠标点击，按按钮，下拉菜单等)
也就是control和view没有关系，不直接打交道，用户的操作直接更改调整数据，model通知view将所有的数据拿过去
重新进行表现，这种模式使得各个部分各司其职
例子 
JTable		(view)负责表现数据
TableModel	(Model)保存和维护数据，提供接口使得外部可以修改数据，通知view进行刷新
这这里的实现中将view和control合并成JTable

21、子类抛出异常范围不能比父类大，是父类抛出异常的子类、比父类抛出异常的数目少
子类继承父类，对于成员函数，不能抛出比父类更多的异常，因为在多态中子类是要当做父类来使用的
对于构造器，子类构造要抛出父类可能抛出的所有的异常，甚至可以比父类构造抛出的多，因为子类构造要调用父类的构造
22、流：单向的、一维的
输入流 输出流
字符流 字节流
包裹流 节点流

内部类的价值在于更好的服务器其所在的外部类、私有内部类可用于类的(设计)实现
多态、动态绑定
接口、实现
类的普通用户、类的设计者
创建二维数组的时候，如果要使用，val的每个元素还要再次new出空间
	int[][] val = new int[arrs.size()][];
	for(int i = 0;i < arrs.size(); i++){
		ArrayList<TreeNode> tmpList = arrs.get(i);
		val[i] = new int[tmpList.size()];
		for (int j = 0; j < tmpList.size(); j++) {
			val[i][j] = tmpList.get(j).val;
		}
	}

public interface ListIterator<E> extends Iterator
ListIterator列表迭代器
java.util包下的集合类都是快速失败的，不能在多线程下发生并发修改(迭代过程中被修改)
并发的含义是多个线程同时进行，多个线程操作就叫并发修改
因此当一个集合被迭代的时候，另一个线程(其他线程)对集合进行了修改，就会抛出并发修改异常

fail-fast
	当一个集合被遍历的时候后，另一个线程对集合结构进行了改变，迭代器会立马感知到，就会抛出ConcurrentModificationException
	hashNext()/next()遍历下一个元素之前，都会检测modCount变量是否为expectedmodCount值
	是的话就返回遍历；否则抛出异常，终止遍历
	java.util包下的集合类都是快速失败的，不能在多线程下发生并发修改
fail-safe
	迭代时是对原集合的拷贝进行遍历，所以在遍历过程中对原集合所作的修改并不能被迭代器检测到
	所以不会触发Concurrent Modification Exception
	java.util.concurrent包下的容器都是安全失败，可以在多线程下并发使用，并发修改

当key为null，调用putForNullKey方法，保存null于table第一个位置中，这是HashMap允许为null的原因
HashMap指定初始值大小和负载因子的构造，初始容量并不是指定的初始值，而是大于初始值的2的幂
	public HashMap(int initialCapacity, float loadFactor) {
		// Find a power of 2 >= initialCapacity
		int capacity = 1;
		while (capacity < initialCapacity)  //循环
			capacity <<= 1;
		this.loadFactor = loadFactor;
		threshold = (int)(capacity * loadFactor);  //阈值等于容量乘以负载因子
		table = new Entry[capacity];
		init();
	}
	
	// 实现resize的函数
	void resize(int newCapacity) {
        Entry[] oldTable = table;
        int oldCapacity = oldTable.length;
        if (oldCapacity == MAXIMUM_CAPACITY) {//当前容量达到MAXIMUM_CAPACITY，不进行扩容，直接将阈值调节至Integer.MAX_VALUE
            threshold = Integer.MAX_VALUE;
            return;
        }
        Entry[] newTable = new Entry[newCapacity];
        transfer(newTable);  //将entry拷贝到新的空间newTable中
        table = newTable;
        threshold = (int)(newCapacity * loadFactor);
    }
    void transfer(Entry[] newTable) {
        Entry[] src = table;
        int newCapacity = newTable.length;
        for (int j = 0; j < src.length; j++) {
            Entry<K,V> e = src[j];
            if (e != null) {
                src[j] = null;  //将原来对象置为null，防止游离
                do {  // 对每一个entry链进行处理
                    Entry<K,V> next = e.next;
                    //重新计算index
                    int i = indexFor(e.hash, newCapacity);
                    e.next = newTable[i];  //将当前entry的next设置为newTable[i]，
                    newTable[i] = e;  // newTable[i]存储当前元素e，相当于将entry插到newTable[i]处链表的头结点处
                    e = next;
                } while (e != null);
            }
        }
    }
	HashMap的每一次resize会将整个table中所有键值对重新放到新table中，这是非常消耗资源的操作
	HashMap默认容量是16负载因子是0.75当元素数量大于阈值的时候会进行resize为2倍，如果知道元素的数量
	最好给出capacity值，就能防止resize操作，这是很好的做法
	ArrayList默认的容量是10,每次扩容是原来的 newCapacity = oldCapacity*3/2 + 1;

Comparable和Comparator接口区别
两者都是实现容器中元素的比较和排序的
某个类如果要实现比较、排序，要实现Comparable接口，使类具有可比较的功能(属性)
放到容器中的元素要实现排序比较，元素本身要实现Comparable接口
Comparator更是一个比较器，策略模式，对对象进行不同方式的排序比较，只要传入不同的比较器就行了
Comparable 是在集合内部定义的方法实现的排序，Comparator是在集合外部实现的排序
一个类实现了Comparable接口重写CompareTo方法，该方法就属于类的一部分，因此有this.compareTo(obj)
如果要进行不同方式的排序，要修改类本身的CompareTo方法
还可以传入一个比较器，如果要实现不同方式的排序，直接传递不同的比较器即可，不需要对类本身进行修改

PriorityQueue优先级队列是不同于先进先出队列的另一种队列，每次从队列中取出的是具有最高优先权的元素
如果不提供Comparator优先队列中元素默认按自然顺序排列，也就是数字默认是小的在队列头，字符串则按字典序排列，
可以根据Comparator，优先级队列不允许null元素，依靠自然排序的优先级队列还不允许插入不可比较的对象，
这样做可能导致ClassCastException，优先级队列是无界的，但是有一个内部容量，控制着用于存储队列元素的数组大小
它通常至少等于队列的大小。随着不断向优先级队列添加元素，其容量会自动增加。无需指定容量增加策略的细节
PriorityQueue不是线程安全的，入队和出队的时间复杂度是O(log(n))

O表示算法的时间或者空间复杂度上界，比如数组的插入时间复杂度为O(N)
O：大O是上界
Θ：大Θ是平均值
Ω：大Ω是下界

Java集合类的最佳实践有哪些？
如果知道数据的规模，就指定初始容量，就能防止扩容，resize带来的资源消耗
为了类型安全，可读性和健壮性的原因使用泛型
使用JDK提供的不变类（immutable class）作为Map的键可以避免为我们自己的类实现hashCode()和equals()方法

目的：回收堆内存中不再使用的对象，释放资源
回收时间：当对象永久地失去引用后，系统会在合适的时候回收它所占的内存

inalize是Object类的一个方法，该方法在Object类中的声明 
	protected void finalize() throws Throwable {?}
在垃圾回收器执行时会调用被回收对象的finalize()方法，方法的访问控制符是protected
因此子类可以覆盖此方法来实现对其资源的回收，最主要的用途是回收特殊渠道申请的内存
Java程序有垃圾回收器，所以一般情况下内存问题不用程序员操心，但有一种JNI(Java Native Interface)
调用non-Java程序（C或C++），finalize()的工作就是回收这部分的内存

Java应用小程序，可以直接嵌入到网页中，并能够产生特殊的效果，
applet经编译后会产生.class文件，把.class文件嵌入到html页面中
用户在链接网页时，applet便会伴随网页一起下载到用户计算机运行
applet主要用来创建动态交互的web应用程序

Canvas, Frame, Panel,和Applet支持重绘
GUI组件可以处理它自己的事件，只要它实现相对应的事件监听器接口，并且把自己作为事件监听器

JDBC驱动提供了特定厂商对JDBC API接口类的实现，驱动必须要提供java.sql包下面这些类的实现
Connection, Statement, PreparedStatement,CallableStatement, ResultSet和Driver

Java RMI(Remote Method Invocation) Java的远程方法调用是Java所特有的分布式计算技术 
它允许运行在一个Java虚拟机上的对象调用运行在另一个Java虚拟机上的对象的方法
从而使Java编程人员可以方便地在网络环境中作分布式计算，面向对象设计要求每个任务由最适合该任务的对象执行
RMI将这个概念更深入了一步，使任务可以在最适合该任务的机器上完成，
RMI定义了一组远程接口，可以用于生成远程对象。客户机可以象调用本地对象的方法一样用相同的语法调用远程对象
RMI API提供的类和方法可以处理所有访问远程方法的基础通信和参数引用要求的串行化
使用RMI开发步骤：
	1、定义一个远程接口(远程接口必须继承接口，每个方法必须抛出远程异常，方法参数和方法返回值都必须是可序列化的) 
	2、实现远程接口(制作远程服务)
	3、定义使用远程对象的客户端
	4、注册远程对象 (将远程对象注册到RMI registry中)
	5、客户端获取stub对象，需要用到RMI Registry中寻找stub
	6、运行服务器和客户程序
	
	远程对象的stub扮演了远程对象的代表或者代理的角色
	bind()方法负责把指定名称绑定给远程对象，rebind()方法负责把指定名称重新绑定到一个新的远程对象
	如果那个名称已经绑定过了，先前的绑定会被替换掉
当应用程序希望把内存对象跨网络传递到另一台主机或者是持久化到存储的时候
就必须要把对象在内存里面的表示转化成合适的格式，这个过程就叫做Marshalling，反之就是demarshalling

多态：父类引用指向不同的子类实例
相同类型的引用变量，调用同一个方法时呈现出多种不同的行为特征
Java引用变量有两个类型：编译时类型，运行时类型

Servlet程序是由WEB服务器调用，web服务器收到客户端的Servlet访问请求后
1、Web服务器首先检查是否已经装载并创建了该Servlet的实例对象。如果是，则直接执行第4步，否则，执行第2步。
2、装载并创建该Servlet的一个实例对象?
3、调用Servlet实例对象的init()方法
4、创建一个用于封装HTTP请求消息的HttpServletRequest对象和一个代表HTTP响应消息的HttpServletResponse对象
然后调用Servlet的service()方法并将请求和响应对象作为参数传递进去
5、WEB应用程序被停止或重新启动之前，Servlet引擎将卸载Servlet，并在卸载之前调用Servlet的destroy()方法。



Integer[] arr = new Integer[Integer.MAX_VALUE]
java.lang.OutOfMemoryError: Requested array size exceeds VM limit

public final class String extends Object implements Serializable, Comparable<String>, CharSequence
String、Integer、Chatacter都实现了Comparable接口

静态方法存储在静态存储区，只要类被加载到内存中就可以访问该方法，而不需要通过实例化对象来访问
JVM是按照public static void main(String[] args)的方法签名来查找方法的入口地址的
main是JVM的特殊方法，是程序的入口方法

一个编译单元可以有多个类，但只有一个可以被public修饰，编译之后会生成多个.class文件

A a = new A();
A b = a;
引用a b 都指向同一个对象，通过引用其一改变对象，另一个引用访问对象成员时也会发生改变，
可以通过Object类下面的clone()来改变这种方式
类可以重载clone方法，当类中只有基本数据类型的时候，可以在子类clone方法中通过super调用父类的clone
但是当类中包含一些对象的时候，需要用到深复制，实现方法是，对对象调用clone方法完成复制后
对对象中的非基本类型的属性也调用clone方法

Java反射机制，是Java在运行时的一种自我审查机制，C++语言并没有这样的机制
	反射机制提供的功能有：
		得到一个对象所属类，得到对象的所有属性和方法、运行时创建类对象，运行时调用对象的方法
	得到类的Class对象：Class.forName("")、 类名.class、 实例.getClass()
	Java创建对象的方式：new、反射机制、通过Object类下面的clone()、通过反序列化重建

volatile是一个类型修饰符，他是被设计用来修饰被不同线程访问和修改的变量，被volatile
修饰的变量系统每次用它直接从对应的内存中提取，而不会利用缓存，被volatile修饰的值，
所有线程在任何时候看到的值都是一样的，volatile不能保证操作的原子性，因此不能代替synchronized,
使用volatile会阻止编译器对代码的优化，使变量对所有线程可见
降低代码运行效率，因此能不使用volatile，尽量不使用volatile
缓存可以提高程序运行效率，但是在多线程环境下可能造成实际值和缓存值不一致

Java类库中，所有基本类型的包装器类型都是不可变类
不可变对象(字符串)一旦被创建不能被修改，任何对不可变对象的修改都会new出新的对象
不可变对象实现的基础是final关键字，(必须进行初始化，只能进行一次初始化，一旦被初始化，不能再次别初始化)
如果一个不可变类的成员是可变量，那么成员初始化时候或者通过get方法得到成员变量时要使用clone()保证类的不可变性
这一点应该如何理解呢？对ImmutableClass类的初始化时候传给构造器的是Data类的引用data，所以类中data和类外的
data引用指向同一个对象，当data的状态发生改变的时候，类中的data也会发生变化，当用getData()方法获取不可变类的
可变成员时，该成员状态发生改变，类中的data也会发生变化，就不是不可变类了，因此对不可变类的可变成员初始化
或者获取该可变成员，要使用clone()方法，保证类的不可变性(好像是隔离类中对象与外界对象的联系)
	public final class ImmutableClass {
		private Date data;  // 不可变类成员是私有的，被private修饰
		public ImmutableClass(Date data){
			this.data = (Date) data.clone(); // 解除了与引用的关系，从而不受data状态改变的影响
		}
		public final Date getData(){  //类外部获取Date对象状态改变，不会影响类内部的成员data
			return (Date) data.clone();
		}
	}
常见的运行期异常
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
ClassCastException
编译期异常
IO或者SQL异常，代码依赖于不可靠的IO要进行捕获处理

Java IO两种设计模式是适配器模式和装饰者模式

序列化Serialization
在分布式的环境下，当进行远程通信是无论是何种类型的数据，都会以二进制的形式在网络上传送
序列化是将对象持久化到本地文件中，或者发送到其他网络节点上的过程
当对象需要网络传输，或者需要被持久化到数据库或者文件中才选择序列化
被transient关键字修饰的属性不会被序列化

当程序要使用某个类的时候，要将类加载到内存中，如果类还未加载到内存中，系统会通过加载，连接，初始化三步来实现对这个类的初始化
	1、加载：就是将class文件读到内存，并为之创建一Class对象(每一个类的class文件都是Class这个类的类对象，注意是有Class这个类的)
	任何类在被使用时系统都会建立一个Class对象
	2、连接：
		验证是否有正确的内部结构，并且和其他类协调一致
		准备 负责为类的静态成员分配内存，并设置默认的初始化值
		解析 将类的二进制数据中的符号引用替换为直接引用
	3、初始化：成员变量的初始化，构造器，成员方法的初始化
类加载的时机
	1、创建类的实例
	2、访问类的静态变量，或者为类的静态变量赋值的时候
	3、调用类的静态方法的时候
	4、使用反射方式强制创建某个类或者接口对应的java.lang.Class对象
	5、初始化某个类的子类(子类可能要用到父类的东西，优先加载父类)
	6、直接使用java.exe命令来运行某个主类

遇到 new、getstatic、putstatic、invokestatic 这四条字节码指令时，如果类还没有进行过初始化，则需要先触发其初始化。
生成这四条指令最常见的 Java 代码场景是：使用new关键字实例化对象时、读取或设置一个类的静态字段
static时,被static修饰又被final修饰的，已在编译期把结果放入常量池的静态字段除外、以及调用一个类的静态方法时
使用Java.lang.refect包的方法对类进行反射调用时，如果类还没有进行过初始化，则需要先触发其初始化
当初始化一个类的时候，如果发现其父类还没有进行初始化，则需要先触发其父类的初始化
当虚拟机启动时，用户需要指定一个要执行的主类，虚拟机会先执行该主类
虚拟机规定只有这四种情况才会触发类的初始化，称为对一个类进行主动引用，除此之外所有引用类的方式都不会触发其初始化，称为被动引用

类的加载器的组成
	1、根类加载器：也称为引导类加载器，负责Java核心类的加载，如System String类等，在JDK中JRE的lib目录下rt.jar文件中
	2、扩展类加载器：负责JRE扩展目录中jar包的加载，JDK中JRE的lib目录下ext目录下面
	3、系统类加载器：负责JVM启动时加载来自java命令的class文件，以及classpath环境变量所指定的jar包和类路径

Java的反射机制：通过class文件对象，去使用该文件中的成员变量，构造器，成员方法
要想使用，首先要得到class文件对象，也就是得到class类的对象，所有.class文件都是Class类的类对象
每个class文件都对应一个class文件对象(将class文件封装成class文件对象)，
就像某个具体的文件用一个File类对象来表示，每个IP地址用InetAddress对象来表示
相同的每个class文件都可以用一个Class对象来表示
Class类：Class类包含以下三方面的东西，而每一个都是一个类来表示
	成员变量	Field
	构造方法	Constructor
	成员方法	Method
	一个类可以new出多个对象，但是他的class文件只有一份
Java 代码编译和执行的整个过程包含了以下三个重要的机制：
    Java 源码编译机制
    类加载机制
    类执行机制
什么是 JVM
	JVM 是 Java 的核心和基础，在 Java 编译器和 os 平台之间的虚拟处理器
	它是一种基于下层的操作系统和硬件平台并利用软件方法来实现的抽象的计算机，可以在上面执行 Java 的字节码程序
	Java 编译器只需面向 JVM，生成 JVM 能理解的代码或字节码文件,Java 源文件经编译器，编译成字节码程序，
	通过 JVM 将每一条指令翻译成不同平台机器码，通过特定平台运行,java虚拟机是java跨平台的重要支持

java 语言优点
	结构严谨，面向对象的编程语言
	跨平台，它摆脱了硬件平台的束缚，实现了“一次编写，到处运行”的理想；
	它提供了一种相对安全的内存管理和访问机制，避免了绝大部分的内存泄漏和指针越界问题
	它实现了热点代码检测和运行时编译及优化，这使得 Java 应用能随着运行时间的增加而获得更高的性能
	它有一套完善的应用程序接口，还有无数的来自商业机构和开源社区的第三方类库来帮助实现各种各样的功能

Java堆
	Java Heap 是 Java 虚拟机所管理的内存中最大的一块，它是所有线程共享的一块内存区域,几乎所有的对象实例和数组都在这类分配内存
	Java Heap 是垃圾收集器管理的主要区域，因此很多时候也被称为“GC堆”
	根据 Java 虚拟机规范的规定，Java 堆可以处在物理上不连续的内存空间中，只要逻辑上是连续的即可
	如果在堆中没有内存可分配时，并且堆也无法扩展时，将会抛出 OutOfMemoryError 异常
方法区
	方法区也是各个线程共享的内存区域，它用于存储已经被虚拟机加载的类信息、常量、静态变量、即时编译器编译后的代码等数据
	方法区域又被称为“永久代”，Java 虚拟机规范把方法区描述为 Java 堆的一个逻辑部分，而且它和 Java Heap 一样不需要连续的内存
	可以选择固定大小或可扩展，另外，虚拟机规范允许该区域可以选择不实现垃圾回收。相对而言，垃圾收集行为在这个区域比较少出现
	该区域的内存回收目标主要针是对废弃常量的和无用类的回收
运行时常量池：
	是方法区的一部分，Class 文件中除了有类的版本、字段、方法、接口等描述信息外，还有一项信息是常量池(Class文件常量池)
	用于存放编译器生成的各种字面量和符号引用，这部分内容将在类加载后存放到方法区的运行时常量池中
	运行时常量池相对于 Class文件常量池的另一个重要特征是具备动态性，Java语言并不要求常量一定只能在编译期产生
	也就是并非预置入 Class文件中的常量池的内容才能进入方法区的运行时常量池，运行期间也可能将新的常量放入池中
	这种特性被开发人员利用比较多的是 String 类的 intern（）方法
	根据 Java 虚拟机规范的规定，当方法区无法满足内存分配需求时，将抛出 OutOfMemoryError 异常

GC为Java提供了一种相对安全的内存管理和内存访问的机制
主要有分配内存、保证被引用的对象的内存不被错误回收、回收不被引用的对象的内存
为实现GC，垃圾回收器必须跟踪内存的使用，完成垃圾回收，同时处理堆中的碎片，这些会增加JVM的负担降低程序执行的效率
对于垃圾回收器来说，他是用有向图来记录和管理堆内存中所有的对象，通过这个“有向图”来识别哪些对象是可达的、哪些对象是不可达的
对象变成垃圾，只有在下次垃圾回收器运行时才会被回收，而不是马上被清理
finalize()是在对象空间被回收前调用
由于GC的存在，Java并没有给开发人员提供显示释放已分配内存的方法，不能实时调用垃圾回收器对某个对象或者所有
对象进行垃圾回收，但是可以调用System.gc()来"通知"垃圾回收器运行，但，JVM不能保证垃圾回收器马上运行

Java中引起内存泄漏的几个原因
1、静态集合类(如果是静态的，它的生命周期和程序一致，容器中的对象在程序结束之前不能被释放，从而造成内存泄漏)
2、各种连接IO、网络、数据库，未调用相应的close方法，导致大量对象无法被回收
3、监听器,一个程序中使用了很多监听器，但是在对象删除后，未删除相应的监听器
4、变量不合理的作用域
5、单例模式导致内存泄漏
	由于Singleton成员bigObj是静态变量，生命周期和程序一样长，持有BigClass对象的引用，导致BigClass对象不能被回收
	class BigClass{
		// class body ...
	}
	class Singleton{
		private BigClass bigObj;
		private static Singleton instance = new Singleton(new BigClass());
		private Singleton(BigClass bigObj){
			this.bigObj = bigObj;
		}
		public static Singleton getInstance(){
			return instance;
		}
	}

栈中主要存放基本数据类型和引用类型，栈内存管理是通过压栈和弹栈操作完成，单位是栈帧
每当有函数调用时会通过压栈的方式创建新的栈帧，每当函数运行完毕，会通过弹栈的方式释放栈帧
JVM是基于堆栈的虚拟机，每个程序都运行在一个单独的JVM实例上，每个实例唯一对应一个堆
一个Java程序的多个线程也就共享堆内存，鉴于此，多线程在访问堆中数据时候需要对数据同步

从对和栈的功能以及作用来比较，堆主要用来存放对象，栈主要用来执行程序，相对于堆，栈的存取速度更快
但是栈的大小和生存期必须是确定的，因此缺乏一定的灵活性，而堆可以在运行时动态的分配内存
生存期不必提前告诉编译器，这也导致其速度较慢

线程的几种状态
	1、新建：创建一个新的线程对象
	2、可运行(runnable):线程创建后，其他线程调用了该线程的start()，该状态的线程位于可运行的线程池中
		等待线程调度选中，获得CPU执行权
	3、运行(running):可运行状态的线程获得CPU执行权
	4、阻塞：阻塞状态是指线程因为某种原因放弃了cpu使用权，暂时停止运行，直到线程进入可运行状态，才有机会再次获得cpu执行权
		等待阻塞：运行的线程执行o.wait()方法，JVM会把该线程放入等待队列(waitting queue)中
		同步阻塞：运行的线程在获取对象的同步锁时，若该同步锁被别的线程占用，则JVM会把该线程放入锁池(lock pool)中
		其他阻塞: 运行的线程执行Thread.sleep(long ms)或t.join()方法，或者发出了I/O请求时，JVM会把该线程置为阻塞状态
		当sleep()状态超时、join()等待线程终止或者超时、或者I/O处理完毕时，线程重新转入可运行(runnable)状态
	5、死亡：线程对象变成垃圾，等待GC(run执行完毕、main方法执行完毕、或因为异常是运行终止)

关于进程和线程
进程：process,进程是具有一定独立功能的程序在某个数据集合上的一次运行活动，进程是系统进行资源分配和调度的独立单位
线程：thread，是进程的一个实体，是CPU调度和分派的基本单位，是比进程更小的能够独立运行的单位
在操作系统的级别上，程序都是以进程为单位执行的，每个进程可以有多个线程并发的执行(多线程)
多线程将改变用户体验，连接网络过程中，如果只有单线程，那么UI将会不响应
线程的创建和切换相比进程具有更小的开销
现代计算机本身具有执行多线程的能力，多线程能够提高CPU利用率

	进程是具有一定独立功能的程序关于某个数据集合上的一次运行活动，进程是系统进行
	资源分配和调度的一个独立单位。线程是进程的一个实体，是 CPU 调度和分派的基本单位，
	它是比进程更小的能独立运行的基本单位。线程自己基本上不拥有系统资源，只拥有一点在
	运行中必不可少的资源（如程序计数器，一组寄存器和栈），但是它可与同属一个进程的其
	他的线程共享进程所拥有的全部资源。一个线程可以创建和撤销另一个线程；同一个进程中
	的多个线程之间可以并发执行
	进程与应用程序的区别在于应用程序作为一个静态文件存储在计算机系统的硬盘等存
	储空间中，而进程则是处于动态条件下由操作系统维护的系统资源管理实体

深刻理解Java同步机制，Java在同步上提供了语言级别的支持，通过关键字synchronized实现同步
"在某个时刻，只允许一个线程对数据进行访问"
在多线程环境中，经常碰到数据共享的问题，当有多个线程对一个数据资源进行访问的时候
需要使多线程按照一定的顺序对资源进行访问，确保在某个时刻只有一个线程能够对资源进行访问
否则程序的运行将是不可预测的，解决的办法是对数据进行同步
实现同步，必须获得每一个线程对象的锁，获得它可以保证在同一时刻只有一个线程能够进入临界区(访问互斥资源的代码块)
在这个锁释放之前，其他线程不能进入这个临界区，其他线程想要获得锁对象，只能进入等待队列等待
同步是以很大的系统开销为代价的(实现同步必然消耗系统资源)
同步的实现，
同步代码块，同步方法，
每个对象都有一个对象锁与之关联，当线程访问同步代码块的时候，先要获取这个锁对象，然后才能进入临界区
当同步代码块执行完毕，就会释放锁对象，对象锁任何只允许被一个线程所持有，只有持有锁对象的线程才能访问同步代码块

sleep()和wait()区别
	1、sleep是Thread类的静态方法，是线程控制自身流程的，不涉及线程之间的通信
	(使当前线程就睡眠(暂停)一段时间，例如实现计时器，每隔一段时间打印时间)因此不会释放掉锁对象
	2、可以在任何地方使用
	3、需要捕获异常，sleep过程中,可能被其他线程调用它的interrupt()，抛出InterruptedException
	1、wait是Object类下面的方法，用于线程间通信，线程对象调用wait方法，会使拥有锁对象的线程释放掉锁对象，等待一段时间
		直到其他线程调用notify方法，或者超过设置的时间，使线程所在的对象的其他同步方法可以被其他线程访问
	2、只能在同步方法或者同步代码块中使用
	3、不需要捕获异常
sleep()和yield()区别
sleep 是使线程睡眠，可以给其他线程运行机会，不考虑线程优先级别
yield 是让出CPU执行权，只能给同等优先级，或者更高优先级别的线程执行机会
sleep 会使线程进入阻塞状态，sleep期间线程不可能被执行，必须先进入可执行状态才可能再次被执行
yield 只是使线程进入可执行状态，有可能线程进入可执行状态，立即又被CPU相应

问题：
	当一个线程进入一个对象synchronized方法时，另一个线程还能否进入该对象的其他方法？
	1、如果其他是非同步方法(可能非同步方法操作的不是需要同步的资源)，那么其他线程可以进入
	2、如果是静态同步方法，其他线程也可以进入(静态同步方法的锁对象是类的字节码，同步方法和静态同步方法不能同步，因为他们的锁对象不一样)
	3、如果是该对象的其他方法是同步方法，其他线程不能进入访问，同步方法的锁对象是this本身
	对所有同步方法锁对象是一样的，因此某一时刻，所有同步方法只能有一个同步方法进行访问
	4、如果该方法内部调用了wait方法(该同步方法会释放对象锁)，其他线程可以访问同该对象的synchronized方法
	如果该同步方法内部没有调用wait方法，而该对象的其他方法又同是synchronized方法，那么其他线程无法访问该对象的其他方法
	对象都有一个对象锁与之关联，对于所有同步方法，他们的锁对象是一样的
	因为方法是作用在类对象上的，每个方法都可以对对象进行作用，当一个线程访问同步方法时，如果有另一个线程
	也访问了另一个同步方法，那么这两个同步方法都可以对对象进行修改，那么同步也就失效了，不能保证在任意时刻
	只有一个线程对同步资源进行访问
	::同步方法操作的是需要被同步的资源，同步资源任何时候只允许被一个线程访问，因此各个同步方法之间的执行是互斥的
	任何时候只有一个同步方法能够执行(也就是持有该对象对应锁对象的同步方法)
	如果一个线程进入了同步方法，调用了wait()方法，那么该线程会释放锁对象，等待一段时间,直到其他方法调用notify方法唤醒
	这个时候，允许线程所在的对象的其他同步方法可以被其他线程访问
	
守护线程优先级比较低，后台线程、服务线程，守护线程并非只有JVM产生，将一个线程设置为守护线程是在调用该线程的start()方法之前调用setDeamon(true)
当用户线程全部退出，守护线程会被全部杀死，因为没有被守护对象，也就没有守护的必要，当程序中只有守护线程，JVM是可以退出的
守护线程产生的线程默认也是守护线程
守护线程的经典例子是垃圾回收器，当JVM启动，守护线程运行

t.join();join()方法实现线程的合并，用于同步，当前线程等待调用join()方法的线程t所设置的时间，或者等待t执行完毕再执行当前线程

1、任何含有null的包装类，在自动拆箱为基本数据类型的时候都会抛出NPE，也就是说将Integer赋予int时，当Integer为null，会抛出NPE
null既不是对象也不是类型，它仅仅是一种特殊的值，可以给任何引用类型赋值为null，null也可以转化为任何类型
2、
List<Number> ls = new ArrayList<Number>();
这里限定了类型参数是Number，但是Number及其子类都可以添加到ls中
List<? extends Number> ls = new ArrayList<Number>();
不能添加Number及其子类型
ls.add(null); //除了null不能添加其他对象

class Demo<T>{
	public void show(T t){
		System.out.println(t);
	}
}
Demo<Number> d = new Demo<Number>();
d.show(33);
d.show(new Integer(6));
d.show(new Float(6.0000f));
//虽然限定了类型参数Number但是Number及其子类都可以作为泛型类方法中的参数

泛型类型在逻辑上看以看成是多个不同的类型，实际上都是相同的基本类型
		DemoB<Number> dd = new DemoB<Number>();
		DemoB<Integer> dd1 = new DemoB<Integer>();
		System.out.println(dd.getClass());  //class Gen.DemoB
		System.out.println(dd1.getClass()); //class Gen.DemoB
		System.out.println(dd.getClass() == dd1.getClass()); //true
泛型类型在逻辑上看可以看成是多个不同的类型，实际上都是相同的基本类型，也就是说
DemoB<Number>、DemoB<Integer>在逻辑上是不同的类型，但实际是相同的类型，都是DemoB

类型参数具有继承关系，但是类型参数构造的泛型类不具有继承关系，他们是不同的类型
正如，Integer 是 Number 的子类，但MyClass<Integer>并不是MyClass<Number>的子类,两者都是泛型类
Java中的多态理念显然是违背的,我们需要一个在逻辑上可以用来表示同时是DemoB<Number>和DemoB<Float>
的父类的一个引用类型，由此，类型通配符应运而生,DemoB<? extends Number>逻辑上是DemoB<Number>以及DemoB<Float>的父类
MyClass<Integer>并不是MyClass<Number>的父类的一个引用类型，由此，类型通配符应运而生
List<? extends Cat> 是 List<? extends Animal>的子类型
G<X> 是 G<? extends X>的子类型（如List<Animal> 是 List<? extends Animal>的子类型
G<?> 与 G<? extends Object>等同，如List<?> 与List<? extends Object>等同

getDeclaredMethods能拿到所有（不包括继承的方法）；
getMethods只能拿到public方法（包括继承的类或接口的方法）

ConcurrentHashMap的锁分离技术
1、	通过分析Hashtable就知道，synchronized是针对整张Hash表的，即每次锁住整张表让线程独占，ConcurrentHashMap允许多个修改操作并发进行
	其关键在于使用了锁分离技术。它使用了多个锁来控制对hash表的不同部分进行的修改，ConcurrentHashMap内部使用段(Segment)来表示这些不同的部分
	每个段其实就是一个小的hashtable，它们有自己的锁。只要多个修改操作发生在不同的段上，它们就可以并发进行
	有些方法需要跨段，比如size()和containsValue()，它们可能需要锁定整个表而而不仅仅是某个段，这需要按顺序锁定所有段
	操作完毕后，又按顺序释放所有段的锁。这里“按顺序”是很重要的，否则极有可能出现死锁，在ConcurrentHashMap内部，段数组是final的
	并且其成员变量实际上也是final的，但是，仅仅是将数组声明为final的并不保证数组成员也是final的，这需要实现上的保证。这可以确保不会出现死锁
	因为获得锁的顺序是固定的
2、ConcurrentHashMap实现思想的应用场景
	大数组时需要在多个线程共享时就可以考虑是否把它给分层多个节点了
	当设计数据表的事务时(事务某种意义上也是同步机制的体现)，可以把一个表看成一个需要同步的数组
	如果操作的表数据太多时就可以考虑事务分离了(这也是为什么要避免大表的出现)，比如把数据进行字段拆分，水平分表等
3、ConcurrentHashMap完全允许多个读操作并发进行，读操作并不需要加锁，实现技术是保证HashEntry几乎是不可变的
实现是通过final关键字
	static final class HashEntry<K,V> {  
		final K key;  
		final int hash;  
		volatile V value;  
		final HashEntry<K,V> next;  
	} //除了value不是final的其他成员都是final的，也就是说，一旦初始化，HashEntry链的各个节点的顺次指向关系是不能发生改变的
4、	put操作：对于一个HashEntry链，插入一个节点，只要构造一个新的节点，新节点的next域指向当前的HashEntry链，也就是一律插入到链表的头结点
	remove操作：可能需要从中间删除一个节点，这就需要将要删除节点的前面所有节点整个复制一遍，最后一个节点指向要删除结点的下一个结点
		也就是说不能改变既有HashEntry链的指向关系，但是可以重新构造节点(通过造节点改变指向)，对原有节点进行复制
ConcurrentHashMap和Hashtable主要区别就是围绕着锁的粒度以及如何锁,可以简单理解成把一个大的HashTable分解成多个，形成了锁分离
两者都通过拉链法解决哈希冲突，都是将hash值相同的节点放在一个hash链中，与HashMap不同的是，ConcurrentHashMap使用多个子Hash表，也就是段(Segment)
	segmentMask和segmentShift主要是为了定位段
	final Segment<K,V> segmentFor(int hash) {  
		return segments[(hash >>> segmentShift) & segmentMask];
	}
	ConcurrentHashMap删除节点的过程
	public V remove(Object key){
		hash = hash(key.hashCode());  
		return segmentFor(hash).remove(key, hash, null);
	}
	key -- key.hashCode -- hash -- segmentFor(hash)(HashMap的是indexFor方法) -- 找到段，委托段的删除方法
	在段中int index = hash & (tab.length - 1) -- 找到被删除节点所在的Entry链，定位到要删除的节点e
	如果不存在这个节点就直接返回null，否则就要将e前面的结点复制一遍，尾结点指向e的下一个结点，e后面的结点不需要复制，它们可以重用 
put操作，同样地put操作也是委托给段的put方法
	先确定段，在段中(就是一个哈希表)，确定被插入节点的位置也是通过hash值与该段长度-1的与运算计算的 index = hash & (tab.length - 1)
	put remove方法也是在持有段锁(锁定整个segment)的情况下执行的，这当然是为了并发的安全，使用lock和unlock实现
	整个操作是先定位到段，然后委托给段的remove操作。当多个删除操作并发进行时，只要它们所在的段不相同，它们就可以同时进行

HashMap可以允许插入null key和null value，如果键为null，调用putForNullKey方法
HashTable和ConcurrentHashMap都不可以插入null key和null value，ConcurrentHashMap每个segment都是一个HashTable，
当为null键或者null值得时候，会抛出NPE
	
“局部变量的引用是有他的道理的”
1、remove执行的开始就将table赋给一个局部变量tab，这是因为table是volatile变量，读写volatile变量的开销很大
	编译器也不能对volatile变量的读写做任何优化
2、局部变量引用保证元素的拷贝安全进行，防止其他线程对内存的侵占
		
seq是数据包本身的序列号；ack是期望对方继续发送的那个数据包的序列号
发端发包seq = j 接收端收到这个包 应答 ack = j+1， 表示收到了发端序列号为 j 的数据包，同时随机产生一个值seq = K，发送给发端

Java线程池(性能与消耗资源、管理、可控性)
	new Thread 弊端
	每次都新建，性能较差
	线程缺乏统一管理，可能无限制的创建线程，互相竞争，会带来一些不必要的麻烦
	可控性太差，比如定时定期执行，比如线程中断机制
	降低资源消耗，不需要每次都是新建和销毁，性能得到了提高
	统一管理，可有效控制最大并发量，提高系统资源的使用率，同时避免过多资源竞争，避免堵塞
	可控性很好，可以定期定时执行、线程中断机制等
	
	newCachedThreadPool：创建带有缓存的线程池
	newFixedThreadPool：创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
	newScheduledThreadPool：支持定时和周期性执行的线程池
	newSingleThreadExecutor：从名称上便可以看出，此线程池是一个单线程化的线程池，它只会用唯一的工作线程来执行任务
		保证所有任务按照指定顺序。如果这个线程异常结束，会有另一个取代它，保证顺序执行

全局变量，作用域是全局的，只需在一个源文件中定义，在所有源文件总都是可见的，如果源文件中不包含全局变量，要用extern关键字声明
静态全局变量，作用域是全局的，只能在声明的源文件中使用，具有文件作用域，两个源文件静态全局变量相同，他们是不同的变量
局部变量：作用域是局部的，使用完毕，被释放
静态局部变量：作用域是局部的，生存期是整个程序的运行时间
用static修饰全局变量，改变的是作用域，修饰局部变量，改变的是生存期(存储位置发生了改变)
全局变量、静态全局变量、静态局部变量存储在静态存储区
局部变量存储在栈中

父进程和子进程拥有独立的地址空间和PID参数，所以子进程不会继承父进程的地址空间

扇区，顾名思义，每个磁盘有多条同心圆似的磁道，磁道被分割成多个部分。每部分的弧长加上到圆心的两个半径，恰好形成一个扇形，所以叫做扇区
扇区是磁盘中最小的物理存储单位。通常情况下每个扇区的大小是512字节。（由于不断提高磁盘的大小，部分厂商设定每个扇区的大小是4096字节）

块、簇的概念
通俗的来讲，在Windows下如NTFS等文件系统中叫做簇；在Linux下如Ext4等文件系统中叫做块（block）
每个簇或者块可以包括2、4、8、16、32、64…2的n次方个扇区
块、簇是逻辑层面的：磁盘块（虚拟出来的）块是操作系统中最小的逻辑存储单位。操作系统与磁盘打交道的最小单位是磁盘块

为什么存在磁盘块？
读取方便：由于扇区的数量比较小，数目众多在寻址时比较困难，所以操作系统就将相邻的扇区组合在一起，形成一个块，再对块进行整体的操作。
分离对底层的依赖：操作系统忽略对底层物理存储结构的设计。通过虚拟出来磁盘块的概念，在系统中认为块(簇)是最小的单位

怎么映射磁盘块？
磁盘控制器，其作用除了读取数据、控制磁头等作用外，还有的功能就是映射扇区和磁盘块的关系

B类IP地址是半半 /16 

顺序存储结构是数组，链式存储结构是链表
数据结构：
1.逻辑结构：线性、树形、图形结构
2.存储结构：
	顺序存储结构，如数组
	链式存储结构，如链表
	索引存储，如线索树、散列存储
	栈，可以用顺序存储实现(其实就是数组加一个top指针)、也可以用链式存储结构实现，如链栈

/*
空间对其原则
1、结构体中的第一个成员从offset 0 的位置开始存储
2、以后每个数据成员的存储位置从该成员所占空间的整数倍的位置开始存储(或者该成员的子成员所占空间的整数倍位置，数组)，
	例如int要从4、8、12、16位置开始存储，double从8、16、24开始存储，char[32]要从1的倍数的位置存储
3、结构体中有结构体成员，结构体成员对其方式，结构体成员要从该结构体最大成员所占空间整数倍的位置开始存储
4、结构体所占空间总大小要是结构体最大成员大小的整数倍(但是如果是数组，不能按照最大成员整数倍)，不够进行补齐 

对于结构体的各个成员，第一个成员的偏移量是0，排列在后面的成员其当前偏移量必须是当前成员类型的整数倍
结构体内所有数据成员各自内存对齐后，结构体本身还要进行一次内存对齐，保证整个结构体占用内存大小是结构体内最大数据成员的最小整数倍
如程序中有#pragma pack(n)预编译指令，则所有成员对齐以n字节为准(即偏移量是n的整数倍)，不再考虑当前类型以及最大结构体内类型
*/ 
struct stu{
	int id;  // [0-3] 
	double weight; // [8-15],double 占8字节，要从8整数倍的位置开始存储 
	float score; // [16-19] float占4字节，要从4的整数倍的位置开始存储 
	//整体要求是结构体成员所占空间中，最大成员所占空间的整数倍,也就是8的整数倍，共计24字节 
}STU;  // 因此 sizeof(stu) = 24

struct S{
	char sex[2];  // [0-1] 
	int val; // 由于对其要从4开始[4-7] 
	double dval; // [8-15] 
	short sval[2];  // [16-17] 
	stu ss;  //STU中最大成员占8字节，因此STU存储位置要8的整数倍位置对其,STU本身24字节 [24-47]
	// s整体要s内最大成员整数倍对其，也就是24的整数倍对其,48 
}; // sizeof(s) = 48; 
加上#pragma pack(1)，表示取消对齐规则，所有的成员都按照1的方式进行对齐
	
struct st_t {
    int status;
    short *pdata;
    char errstr[32];
};
st_t st[16];
char *p=(char *)(st[2].esstr+32);
printf(“%d”,(p-(char *)(st)));
若在64位机器上，指针占8字节，32位机，指针占4字节
在64位机，st_t占48字节，st[0]指向0位置，st[1]指向48，st[2]指向96，st[3]指向144，
st[2].esstr，指向第三个st_t的error开始位置，就是48+48+16的位置


class A{
	int b;
	double a;
	public:
		virtual void fun(void);
};  // 24 遵从对齐原则
class B{
	public:
		virtual void f(void);
}; // 8 
class C{
	public:
	 	void f(void);
};  // 1 
	
基本数据类型的变量，对象的引用及函数调用的现场保存都使用的是内存栈空间
通过new关键字和构造器创建的对象放在堆空间
类信息、常量、静态变量放在方法区
	
	
数据库
JDBC 是Java语言访问数据库的规范，是API
create database 1234; 创建一个数据库
show databases; 列出所有数据库
show create database db_name; 查看数据库db_name创建语句


Java创建对象的方式 4
反射的作用 3
类加载时机 6
类加载器 3
GC作用 3
GC算法 5
内存泄漏 5

/* 	代码块：在Java中，使用{}括起来的代码被称为代码块。
	根据其位置和声明的不同，可以分为
		局部代码块:局部位置,用于限定变量的生命周期。
		构造代码块:在类中的成员位置,用{}括起来的代码。每次构造方法执行前，都会先执行构造代码块。
			作用：可以把多个构造方法中的共同代码放到一起，对对象进行初始化。
		静态代码块:在类中的成员位置,用{}括起来的代码,只不过它用static修饰了。
			作用：一般是对类进行初始化。
		静态代码块,构造代码块,构造方法的执行顺序是 静态代码块 -- 构造代码块 -- 构造方法;
		且静态代码块：只执行一次;构造代码块：每次调用构造方法都执行
 * */
public class CodeBlockTest {

	public static void main(String[] args) {
		{ //局部代码块
			int x = 10;
			System.out.println(x);
		}
		//	System.out.println(x); //x cannot be resolved to a variable
		CodeBlock cblock = new CodeBlock();
		System.out.println(cblock.cnt);
		CodeBlock cblock1 = new CodeBlock();
		CodeBlock cblock2 = new CodeBlock();
	}
}
class CodeBlock{
	public static int cnt = 10;
	
	static {  //静态代码块
		cnt = 20;
		System.out.println("静态代码块1");
	}
	
	{  //构造代码块1
		cnt = 30;
		System.out.println("构造代码块1");
	}
	public CodeBlock(){
		cnt = 40;
		System.out.println("构造方法");
	}
	
	{  //构造代码块2
		cnt = 30;
		System.out.println("构造代码块2");
	}
	
	static {  //静态代码块2
		cnt = 20;
		System.out.println("静态代码块2");
	}
}

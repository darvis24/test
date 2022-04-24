package testagain;
import java.util.Scanner;
public class test {
	public int sum(int a,int b){int c;c=a+b;return c;}
	public int sub(int a,int b) {int c;c=a-b;return c;}
	public int mult(int a,int b) {int c;c=a*b;return c;}
	public void div(int a,int b) {int c;c=a/b;
	System.out.println("(((((x1+x2)-x3)+x4)*x5)/x6)="+c);}
	public static void main(String[] args) {
		test obj=new test();
		Scanner s=new Scanner(System.in); 
		int x1=s.nextInt();System.out.println("pls print x1");
		int x2=s.nextInt();System.out.println("pls print x2");
		int x3=s.nextInt();System.out.println("pls print x3");
		int x4=s.nextInt();System.out.println("pls print x4");
		int x5=s.nextInt();System.out.println("pls print x5");
		int x6=s.nextInt();System.out.println("pls print x6");
		int a=obj.sub(x1,x2);int b=obj.sub(a,x3);
		int c=obj.sum(b,x4);int d=obj.mult(c,x5);obj.div(d,x6);
		
	}

}

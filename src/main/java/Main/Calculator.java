package Main;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=2;
		Calculator c=new Calculator();
		System.out.println("Additon : "+c.add(a, b));
		System.out.println("Subtraction : "+c.sub(a, b));
		System.out.println("Multiplication : "+c.mul(a, b));
		System.out.println("Division : "+c.div(a, b));
		
	}
}

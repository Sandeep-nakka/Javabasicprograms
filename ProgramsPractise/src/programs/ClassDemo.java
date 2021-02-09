package programs;

class Test {
	
	public Test() {
		
		System.out.println("Test is in Constructor");
	}
	
	int id;
	String str;
	
}

public class ClassDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test d= new Test();
		System.out.print(d.str);

	}

}

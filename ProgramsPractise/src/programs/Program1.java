package programs;

public class Program1 {

	public static void main(String[] args) {
		
		System.out.println("Tested");
		String str="I am validating the Program";
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(0, 4));
		System.out.println(str.split(" "));
		String[] A2=str.split(" ");
		for(int i=0;i<A2.length;i++) {
			System.out.println(A2[i].toUpperCase());
		}
		char[] A1=str.toCharArray();
		for(int i=0;i<A1.length;i++) {
			System.out.println(A1[i]);
		}
		StringBuffer sb=new StringBuffer("Testing");
		sb.append("Test");
		System.out.println(sb);
	}
}

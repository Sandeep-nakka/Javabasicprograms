package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListprogram {
	
	public static void main(String[] args) {
		
		ArrayList<String> str=new ArrayList<String>();
		str.add("Test");
		str.add("Test1");
		str.add("Removing a Element");
		str.remove(0);
		str.add("Test2");
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
	}

}

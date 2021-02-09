package programs;

import java.util.HashMap;
import java.util.Map;

public class Collections {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		String str=" I am doing good";
		HashMap<Character,Integer> H1=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length()-1;i++) {
			
			if(H1.containsKey(str.charAt(i))) {
				
				H1.put(str.charAt(i), H1.get(str.charAt(i))+1);
			}
			else {
				H1.put(str.charAt(i), 1);
			}
		}

		for(Map.Entry m : H1.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   } 
	}

}

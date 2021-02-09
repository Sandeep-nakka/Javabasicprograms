package programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class Charactercount {

	
	public static void main(String[] args) {
		
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		String Str1= "I am Testing the character count";
		String Str=Str1.toLowerCase();
		for(int i=0;i<Str.length();i++) {
			
			char ch=Str.charAt(i);
			if(mp.containsKey(ch)) {
				
				mp.put(ch, mp.get(ch)+1);
			}
			else {
				mp.put(ch, 1);
			}
			
		}
		
		for(Entry<Character, Integer> m:mp.entrySet()) {
			
			System.out.println(m.getKey()+": "+m.getValue());
		}
		
		
		
	}
}

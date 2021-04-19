package Logical_progm;

import java.util.HashMap;
import java.util.Set;

public class String_count_charcters_In_vlaue_gate {
	public static void main(String[] args) {
		 String str="mynameisshubham";
		 
		 HashMap<Character, Integer> map=new HashMap<Character,	Integer>();
		 
		 for (int i = 0; i <= str.length()-1; i++) {
			char charvalue = str.charAt(i);
			if (map.containsKey(charvalue)) {
				map.put(charvalue, (map.get(charvalue)+1));
			}else {
				map.put(charvalue, 1);
				
			}
		}
		 Set<Character> keys = map.keySet();
		 for (Character key : keys) {
			System.out.println(key+":"+map.get(key));
		}
}
}
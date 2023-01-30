package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stringprogram {
	public static void main(String[] args) {
		// 1. reverse word
		           // 0-4
		String s = "mohan";
		String a = "";
	                 	// 5 - 1
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);// index
			// System.out.println(c);
			a = a + c;
		}
		System.out.println(a);

		// 2. reverse sentence letter
		String s1 = "mohan is is durai";
		String a1 = "";
		// 5 - 1
		for (int i = s1.length() - 1; i >= 0; i--) {
			char c1 = s1.charAt(i);// index
			a1 = a1 + c1;
		}
		
		System.out.println(a1.trim());

		// 3. sentence reverse 
		              // 0 1 2 3
		String s11 = "mohan is is durai";
		String a11 = "";
		String[] sp = s11.split(" ");
		// 4 - 1
		for (int i = sp.length - 1; i >= 0; i--) {
			a11 = a11 + sp[i] + " ";
		}
		System.out.println(a11.trim());



		// 4. count of letters
		String s3 = "mohaan111222223";
		char[] ca = s3.toCharArray();
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for (char x : ca) {
			if (mp.containsKey(x)) {
				Integer inte = mp.get(x);
				mp.put(x, inte + 1);

			} else {
				mp.put(x, 1);
			}
		}
		System.out.println(mp);

		//5. count of words
		String s4 = "mohan is is is soft soft ware eng eng";
		String[] spi = s4.split(" ");
		Map<String, Integer> mp1 = new LinkedHashMap<>();
		for (String x : spi) {//mp1 is empty now
			if (mp1.containsKey(x)) {
				Integer integ = mp1.get(x);
				mp1.put(x, integ + 1);
			} else {
				mp1.put(x, 1);
			}
		}
		System.out.println(mp1);

		// 6. print only duplicates
        //mp is ref.name
		String a4 = "";
		String a5 = "";
		Set<Entry<Character, Integer>> et = mp.entrySet();
		for (Entry<Character, Integer> x : et) {
			if (x.getValue() > 1) {

				a4 = a4 + x.getKey();

		// 7. remove dupicate from string  in word	
			} else {// 
				a5 = a5 + x.getKey();
			}
		}
		System.out.println(a4);
		System.out.println(a5);
		
	//	8. print only duplicate word in sentence
		String a6 = "";
		String a7 = "";
		String d7 = "";
		Set<Entry<String, Integer>> et1 = mp1.entrySet();
		for (Entry<String, Integer> x : et1) {
		//get map in deplicate removed words
			a7=a7+x.getKey()+" ";
			if (x.getValue() > 1) {
                a6 = a6 + x.getKey()+" ";
		// 7. remove dupicate from string word in sentence
			} else {// 
				d7 = d7 + x.getKey()+" ";
			}
		}
		System.out.println(a6+"==print only duplicate word in sentence");
		System.out.println(d7+"==remove dupicate from string word in sentence");
		System.out.println(a7+"==get map in deplicate removed words");
		
		
		//8.remove duplicate character
		String s8="helloo";
		String dup="";
		char[] charArray = s8.toCharArray();
        for (char x: charArray) {
         if(!dup.contains(String.valueOf(x))) {
        	 dup=dup+x;
         }
        }
        System.out.println(dup+"==duplicate char removed");
        
        //8.remove duplicate word
        String s9="hello is is ok ok";
		String dup1="";
		String[] split = s9.split(" ");
        for (String x: split) {
         if(!dup1.contains(x)) {
        	 dup1=dup1+x+" ";
         }
        }
        System.out.println(dup1+"==duplicate word removed");
        
        
	}
        

}

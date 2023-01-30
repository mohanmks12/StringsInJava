package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Stringsss {
	public static void main(String[] args) {
		// String reverse
		String s = "Welcome";
		String sr = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			sr = sr + c; // ""+e //e+w //ew+o
		}
		System.out.println(sr);

		// or
		String a = "mohan duraisamy";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			char ca = a.charAt(i);
			b = b + ca;
		}
		System.out.println(b);

		// or
		StringBuffer sb = new StringBuffer(s);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);

		// palindrom
		String s1 = "madam";
		String sr2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			char c = s1.charAt(i);
			sr2 = sr2 + c; // ""+e //e+w //ew+o
		}
		System.out.println(sr);
		if (sr2.equals(s1)) {
			System.out.println("palindrom");
		} else {
			System.out.println(" not palindrom");
		}

		// count of letters
		String s2 = "hellloooo";
		char[] cr = s2.toCharArray();
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for (char x : cr) {
			if (mp.containsKey(x)) {
				Integer ct = mp.get(x);
				System.out.println(x);
				System.out.println(ct);
				mp.put(x, ct + 1);

			} else {
				mp.put(x, 1);
			}

		}
		System.out.println(mp);
		// print duplicates

		// String q = "mohannnn";
		// String s3 = "";
		// char[] charArray = q.toCharArray();
		// Map<Character, Integer> mp1 = new LinkedHashMap<>();
		// for (char x1 : charArray) {
		// mp1.containsKey(charArray);
		// Integer c1 = mp1.get(x1);
		//
		// }
		// System.out.println(c1);

		String e = "";
		String abc = "";
		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
		for (Entry<Character, Integer> w1 : entrySet) {
			if (w1.getValue() > 1) {
				e = e + w1.getKey(); 
			}
			// remove duplicate
			else {
				abc = abc + w1.getKey();
			}

		}
		System.out.println(e);
		System.out.println(abc);

		
		//count of words
		String sa="welcome to to the the tamilnadu";
		String[] sp = sa.split(" ");
		Map<String, Integer> mp2= new LinkedHashMap<>();
		for (String x:sp) {
			if(mp2.containsKey(x)) {
				Integer in = mp2.get(x);
				mp2.put(x, in+1);
				}
			else {
				mp2.put(x, 1);
			
			}
		}
		System.out.println(mp2);
		
		
		
		
	}

}

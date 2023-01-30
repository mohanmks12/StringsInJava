package org.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayProgram {
	public static void main(String[] args) {
		//1. ASCENDING
		System.out.println("==1.ASSENDING");
		int a[] = { 20, 30, 40, 70, 90 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		for(int i:a) {
			System.out.println(i);
		}
		//2. DECENDING
		//int a[] = { 20, 30, 40, 70, 90 };
		System.out.println("==2.decending");
		int temp1 = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp1 = a[i];
					a[i] = a[j];
					a[j] = temp1;
				}
			}

		}
		for(int X:a) {
			System.out.println(X);
		}
		
		//3. maximum, min value
		//   ASCENDING
				System.out.println("==maximum value, minimum");
				//int a[] = { 20, 30, 40, 70, 90 };
				int temp2 = 0;
				for (int i = 0; i < a.length; i++) {
					for (int j = i+1; j < a.length; j++) {
						if (a[i] > a[j]) {
							temp2 = a[i];
							a[i] = a[j];
							a[j] = temp2;
						}
					}
				}
				for(int i:a) {
					System.out.println(i);
				}
		System.out.println("3.maximum value=="+a[a.length-1]);
		System.out.println("2nd maximum value=="+a[a.length-2]);
		System.out.println("min value=="+a[0]);
		System.out.println("2nd min value=="+a[1]);

		//4. array to list
		Integer b[]= {1,3,4,4,4,5,6,4,2,4,8,9};
		List<Integer> li = Arrays.asList(b);
		System.out.println(li+"==4.array to list");
		
		//5.list to array
		List<Integer> l = new LinkedList<>(Arrays.asList(10,20,30));
		System.out.println(l+"==5.list to array or ");
		
	   //or
		List<Integer> la= new LinkedList<>();
		la.add(10);
		la.add(30);
		la.add(40);
		la.add(50);
		la.add(880);
		Object[] array = la.toArray();
		for (Object x : array) {
		System.out.println(x);
		}
		//6. remove duplicate from array
		System.out.println("6. remove duplicate from array");
		//Integer b[]= {1,3,4,4,4,5,6,4,2,4,8,9};
		List<Integer> ls = Arrays.asList(b);//list to set
		Set<Integer> s = new LinkedHashSet<>();
		s.addAll(ls);
		System.out.println(s);
		
		
	}
	
}
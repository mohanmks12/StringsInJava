package org.test;

public class StringPrograms {
public static void main(String[] args) {

	// String reverse
	String s="Welcome";
	String sr="";
	for(int i=s.length()-1; i>=0; i-- ) {
		char c = s.charAt(i);
		sr=sr+c;	//""+e //e+w //ew+o
	}
	System.out.println(sr);
	
String s1="madam";
String sr2="";
for(int i=s1.length()-1; i>=0; i-- ) {
	char c = s1.charAt(i);
	sr2=sr2+c;	//""+e //e+w //ew+o
}
System.out.println(sr);
if (sr2.equals(s1)) {
System.out.println("palindrom");
}
else {
	System.out.println(" not palindrom");
}
}
}

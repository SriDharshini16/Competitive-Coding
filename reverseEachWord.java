//Reversing each word in a string

import java.util.*;
public class reverseString {
	
	public static String reverse(String s) {
		String str ="";
		int i = 0,current = 0;
		for(;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				String rev = "";
				for(int j =current;j<i;j++) {
					rev = s.charAt(j)+rev;
				}
				str = str+rev+" ";
				current = i+1;
			}
			
		}
		String rev = "";
		for(int j = current;j<i;j++) {
			rev = s.charAt(j)+rev;
		}
		str = str+rev;
		return str;
	}
	
	

	public static void main(String[] args) {	
		String str ="Sri Dharshini";
		String str1 = reverse(str);
		System.out.println(str1);

	}

}

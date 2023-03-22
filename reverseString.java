//Revering the words in a string
public class reveringString {
	
	public static String revWords(String str) {
		String rev ="";
		int current = 0,i=0;
		for(;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				rev = str.substring(current, i)+" "+rev;
				current = i+1;
			}
		}
		rev = str.substring(current, i)+ " "+rev;
		
		return rev;
	}

	public static void main(String[] args) {
		String str ="Happy Ugadi...";
		String str1 = revWords(str);
		System.out.println(str1);
		

	}

}


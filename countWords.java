//This program is used to count how many number of words in a string
import java.util.Scanner;
public class countWords {
	public static int count(String str) {
		int count = 1;
		if(str.length()==0) {
			return 0;
		}
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		String str =nextLine();
		int c = count(str);
		System.out.println(c);

	}

}

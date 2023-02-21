//Checking palindrome in strings excluding spaces and special characters

public class palindrome_rev {
	public static boolean isPalindrome(String s) {
        String rev="";
        String str = s.replaceAll("[^a-zA-Z0-9]", " ").replaceAll("\\s+", "");
        str = str.toLowerCase();
        for(int i = 0;i<str.length();i++){
            rev = str.charAt(i)+rev;
        }
        System.out.println(rev);
        if(str.equals(rev)){
            return true;
        }
        return false;
    }
    // or by comaparing without using another string
	public static boolean isPalindrome(String s){
        String str = s.replaceAll("[^a-zA-Z0-9]", " ").replaceAll("\\s+", "");
        str = str.toLowerCase();
	int strt =0,end=s.length()-1;
	while(strt<end){
	   if(s.charAt(strt)!=s.charAt(end){
	       return false;
	   }
	   strt++;
	   end--;
	}
	return true;
	}
   	public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean res = isPalindrome(s);
        System.out.println(res);
        
    }

}

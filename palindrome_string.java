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
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean res = isPalindrome(s);
        System.out.println(res);
        
    }

}

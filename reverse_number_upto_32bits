//reversing a number upto 32 bits

class Solution {
    public static int reverse(int x) {
        int remain,reverse =0;
       
        while(x!=0){
            remain= x%10;
            if(reverse>(Integer.MAX_VALUE/10) || reverse<(Integer.MIN_VALUE/10)){
                 return 0;
            }
            reverse = reverse*10+remain;
            x/=10;
        }
        return reverse;
        
    }
    public static void main(String[] args){
        int c = reverse(1234567890);
        System.out.println(c);
    }
}

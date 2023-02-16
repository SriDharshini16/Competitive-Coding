//adding the numbers
import java.util.*;
class Solution {
    public static int getSum(int a, int b) {
        int c = a+b;
        return c;
        
    }
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = getSum(a,b);
    System.out.println(c);
  }
}

//adding in array
import java.util.*;
class Solution {
    public static int getSum(int arr[]) {
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int arr[] = new int[] {2,3,4,5,9};
    int c = getSum(arr);
    System.out.println(c);
  }
}

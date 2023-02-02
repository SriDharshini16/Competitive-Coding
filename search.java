//Searching in arrays

import java.util.*;

class Main {
    public static int search(int[] nums, int target) {
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
       int[] nums = new int[n];
       System.out.println("Enter the array elements");
       for(int i = 0;i<n;i++){
           nums[i]=sc.nextInt();
       }
       System.out.println("Enter the target number");
       int target = sc.nextInt();
       System.out.println(search(nums,target));
    }
}

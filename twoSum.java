//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

import java.util.*;
class Main {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j =i;j<nums.length-1;j++){
                if(target==nums[i]+nums[j+1]){
                    arr[0]=i;
                    arr[1]=j+1;
                    System.out.println("["+i+" "+(j+1)+"]");
                    return arr;
                }
            }
        }
        System.out.println("No two indexes can give the target element");
        return null;
    }

    public static void main(String[] args) {
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
       twoSum(nums,target);
    }
}

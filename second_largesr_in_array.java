//Finding the second largest element in an array

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Solution {
    public static int secondLargestElement(int[] arr){
        int n = arr.length;
        int largest =arr[0],second_largest = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(largest<arr[i]){
                second_largest = largest;
                largest = arr[i]; 
            }
            else if(second_largest<arr[i]&&arr[i]!=largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,4,5,2,7};
        int c = secondLargestElement(arr);
        System.out.println(c);
    }
}

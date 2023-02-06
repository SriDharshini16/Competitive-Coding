//altering the array only upto non-duplicate elements
class Solution {
    public static int removeDuplicates(int[] nums) {

        int n = nums.length;
        int j =0;
        for(int i =0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i];
                j++;
            }
            }
            nums[j++]=nums[n-1];  //for bringing last position element to the last non-duplicated position
            return j;
        }
        public static void main(String[] args){
            int[] arr = new int[] {1,2,2,3,4};
            int n = removeDuplicates(arr);
            for(int i = 0;i<n;i++){
                System.out.println(arr[i]);
            }
        }
}
      

//Inserting the target element in a sorted manner

class Solution {
    public static int searchInsert(int[] nums, int target) {
        int i;
        for(i =0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }

        }
        return i;
    }
        public static void main(String[] args){
            int[] arr = new int[] {1,3,5,6,7};
            int c = searchInsert(arr,4);
            System.out.println(c);
        }
    }

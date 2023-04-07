public class GCD_of_array {
	
	public static int gcd(int[] nums) {
		int n = nums.length;
        int min=nums[n-1],max=nums[0];
        for(int i =0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }
            if(nums[i]>max){
                max=nums[i];
                
            }

        }
        int gcd=1;
        for(int i =2;i<=min;i++) {
        	if(min%i==0&&max%i==0) {
        		gcd=i;
        	}
        }
		return gcd;
		
		
	}

	public static void main(String[] args) {
		int[] arr = {2,5,6,9,10};
		System.out.println(gcd(arr));
	}

}

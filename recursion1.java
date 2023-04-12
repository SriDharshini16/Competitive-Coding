package Recursion;

public class Recursion {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int output = n*fact(n-1);
		return output;
	}

	public static int sum(int n) {
		if(n==1) {
			return 1;
		}

		int sum = n+sum(n-1);
		return sum;
	}

	public static int power(int n,int pow) {
		if(pow==0) {
			return 1;
		}
		int smallOutput = power(n,pow-1);
		int output=n*smallOutput;
		return output;
	}
	public static int count(int n){
		if(n==0) {
			return 0;
		}
		return 1 + count(n/10);

	}
	public static void print(int n) {
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.print(n+" ");
	}
	public static int fibbo(int n) {
		//		if(n==0) {
		//			return 0;
		//		} 
		if(n==1 || n==2) {
			return 1;
		}
		int output =fibbo(n-1)+fibbo(n-2);
		return output;
	}
	public static void fibbonacc(int n) {
		//		if(n==0) {
		//			return 0;
		//		}
		if(n==1 || n==2) {
			System.out.println(1);
		}
		int output =fibbo(n-1)+fibbo(n-2);
		System.out.println(output);
	}
	public static boolean isSorted(int[] arr) {
		if(arr.length==1) {
			return true;
		}
		if(arr[0]>arr[1]) {
			return false;
		}
		int subArr[] = new int[arr.length-1];
		for(int i =0;i<arr.length-1;i++) {
			subArr[i]=arr[i+1];
		}
		boolean isSubSorted = isSorted(subArr);
		return isSubSorted;
	}
	public static int sumOfArr(int[] arr) {
		if(arr.length==1) {
			return arr[0];
		}
		int[] sum = new int[arr.length-1];
		for(int i =0;i<arr.length-1;i++) {
			sum[i]=arr[i+1];
		}
		int add = arr[0]+sumOfArr(sum);
		return add;

	}
	public static int firIndex(int[] arr ,int num) {

		if(0 ==arr.length){
			return -1;
		}
		if(arr[0]==num) {
			return 0;
		}
		int[] sum = new int[arr.length-1];
		for(int i =0;i<arr.length-1;i++) {
			sum[i]=arr[i+1];
		}
		int index = firIndex(sum, num);
		if(index == -1) {
			return -1;
		}
		else {
			return index+1;
		}
	}
	public static int firstIndex(int[] arr ,int start ,int num) {

		if(start ==arr.length){
			return -1;
		}
		if(arr[start]==num) {
			return start;
		}
		return firstIndex(arr, start+1, num);
	}
	public static int lastIndex(int[] arr,int x, int strt,int end) {
		if(strt==arr.length) {
			return -1;
		}
		if(arr[end]==x) {
			return end;
		}
		int k = lastIndex(arr,x,strt,end-1);
		return k;
	}
	public static int lastIndex(int[] arr,int x, int strt) {
		if(strt==arr.length) {
			return -1;
		}
		int k = lastIndex(arr,x,strt+1);
		if(k!=-1) {
			return k ;
		}
		else {
			if(arr[strt]==x) {
				return strt;
			}
			else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {

		System.out.println(fact(5));
		System.out.println(sum(5));
		System.out.println(count(52));
		print(12);
		System.out.println();
		System.out.println(power(5,2));
		System.out.println(fibbo(5));
		fibbonacc(4);
		int arr[]= {1,2,5,6,3};
		System.out.println(isSorted(arr));
		System.out.println(sumOfArr(arr))
		System.out.println(firIndex(arr,3));
		System.out.println(lastIndex(arr,4,0,arr.length-1));
		System.out.println(lastIndex(arr,6,0));
	}

}

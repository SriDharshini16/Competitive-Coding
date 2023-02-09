//merging two sorted arrays into another sorted array and finding the median for that array
import java.util.*;
class HelloWorld {
    public static double findMedianSortedArrays(int arr1[],int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
      
      //printing the sorted array
        for(int a =0 ;a<n+m;a++){
            System.out.println(arr3[a]+" \n");
        }
        
        if((n+m)%2!=0){
            int s =(n+m)/2;
            return arr3[s];
        }
        else{
            int s =(n+m)/2;
            double r = ((double)arr3[s-1]+(double)arr3[s])/2;
            return r;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] {1,4,7};
        int[] arr2 = new int[] {3,5};
        double d = findMedianSortedArrays(arr1,arr2);
        System.out.println(d);
    }
}

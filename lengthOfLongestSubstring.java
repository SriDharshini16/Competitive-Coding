// Counting the length of longest substring
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int arr[]=new int[256];
        Arrays.fill(arr,-1);
        int i=-1;
        int n=s.length();
        int ans=0;
        for(int j=0;j<n;j++){
            char ch=s.charAt(j);
            if(arr[ch]!=-1){
                int p=arr[ch];
                if(p>=i){
                    ans=Math.max(ans,j-i-1);
                    i=p;
                }
            }  
           arr[ch]=j;
        }
        if(i==-1)return n;
        ans=Math.max(ans,n-i-1);
        return ans;
    }
}

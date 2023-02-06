//checking whether the entered number is a palindrome or not and rturning it in boolean 

#include <stdio.h>
#include <stdbool.h>
bool isPalindrome(int x){
    long int reverse=0;
    int original = x;
    if(x>=0){
    while(x!=0){
        int remain = x%10;
        reverse = reverse * 10 + remain;
        x=x/10;
    }
    if(original == reverse){
        return true;
    }
    }
    return false;
}
int main(){
  int n;
  printf("enter any number");
  scanf("%d",&n);
  bool res = isPalindrome(n);
  if(res==0){
      printf("false");
  }
  else{
      printf("true");
  }
  return 0;
 }
  

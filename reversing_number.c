//using modulo and divide operator for printing in reverse order
#include <stdio.h>

int main() {
    int a;
    printf("enter any number");
    scanf("%d",&a);
    
    for(a;a>=1;a=a/10){
        printf("%d",a%10);
    }
    return 0;
}

//reversing a number and checking for palindrome
#include <stdio.h>

int main() {
    int num,remain,reverse=0;
    printf("enter any number");
    scanf("%d",&num);
    int original =num;
    for(num;num>=1;num=num/10){
        remain=num%10;
        reverse= reverse*10+remain;
    }
    printf("%d \n",reverse);
    original==reverse ? printf("palindrome"):printf("not a palindrome");
    return 0;
}

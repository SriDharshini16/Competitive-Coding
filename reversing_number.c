//using modulo and divide operator
#include <stdio.h>

int main() {
    int a;
    printf("enter any number");
    scanf("%d",&a);
    
    for(a;a>=1;a=a/10){
        printf("%d \n",a%10);
    }
    return 0;
}

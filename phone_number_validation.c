
#include <stdio.h>

int main() {
    long int a;
    scanf("%ld",&a);
    if(a>6000000000 && a<10000000000){
      printf("valid phone number");
    }
    else {
        printf("invalid phone number");
    }

    return 0;
}

(or)


#include <stdio.h>

int main() {
    long int a;
    int arr[10];
    scanf("%ld",&a);
    if(a>=1000000000 && a<=9999999999){
        for(int i = 0;i<10;i++){
            int c = a%10;
            arr[i]=c;
            a=a/10;
            count++;
        }
        if(arr[count-1]>=6 && arr[count-1]<=9){
        printf("valid phone number");
        }
    }
    else {
        printf("invalid phone number");
    }

    return 0;
}


#include <stdio.h>
int factorial(int n){
    int ans = 1;
    if(n == 1){
        return 1;
    }else{
        ans = n * factorial(n-1);
        return ans;
    }
}


int main() {
 int n;
 printf("Enter the no: ");
 scanf("%d",&n);
 int result = factorial(n);
 printf("Factorial of %d is : %d",n,result);
    return 0;
}


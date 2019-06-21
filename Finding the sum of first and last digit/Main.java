#include <stdio.h>
int main() {
	int n,a,b,c;
  scanf("%d",&n);
  a=n%10;
  while(n>10)
    n=n/10;
  if(n<=10)
  {
    b=n%10;
  }
  c=a+b;
  printf("%d",c);
	return 0;
}
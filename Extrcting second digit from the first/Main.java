#include <stdio.h>
int main() {
	int n,a;
  scanf("%d",&n);
  while(n>=100)
  n=n/10;
  if(n<100)
  {
    a=n%10;
    printf("%d",a);
  }
	return 0;
}
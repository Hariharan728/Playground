#include <stdio.h>
int main() {
	int n,sum=1;
  scanf("%d",&n);
  while(n>0)
  {
    sum=sum*n;
    n=n-1;
  }
  printf("%d",sum);
	return 0;
}
#include<stdio.h>
int main()
{
int n,d,r,sum;
  scanf("%d",&n);
  d=n/10;
  r=n%10;
  sum=d+r;
  printf("%d",sum);
  return 0;
}
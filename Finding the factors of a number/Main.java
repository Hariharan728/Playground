#include <stdio.h>
int main() {
	int n,a=1,b;
  scanf("%d",&n);
  while(a<=n)
  {
    b=n%a;
    a=a+1;
    if(b==0)
    {
      printf("%d\n",a-1);
    }
  }
   
	return 0;
}
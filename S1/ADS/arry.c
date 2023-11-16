#include<stdio.h>
void main()
{
int a[5],i,n,large,small;
printf("\nEnter a size of array:");
scanf("%d",&n);
printf("\nEnter a array elements :") ;
for(i=0;i<n;i++)
scanf("%d",&a[i]);

large=small=a[0];

for(i=0;i<n;i++)
{
if(a[i]>large)
large=a[i];

if(a[i]<small)
small=a[i];
}

printf("\nThe smallest element is %d\n",small);
printf("\nThe largest element is %d\n",large);


}

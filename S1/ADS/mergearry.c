#include<stdio.h>
void main()
{
int n,m,v,a[5],b[5],c[10],i;
printf("\nEnter the size of array1:");
scanf("%d",&n);
printf("\nEnter a array elements :") ;
for(i=0;i<n;i++)
scanf("%d",&a[i]);
printf("\nEnter the size of array2:");
scanf("%d",&m);
printf("\nEnter a array elements :") ;
for(i=0;i<m;i++)
scanf("%d",&b[i]);
v=n+m;
 for(i=0;i<n;i++)
 c[i]=a[i];
 for(i=0;i<m;i++)     
 c[i+n]=b[i];
printf("The merged array: ");
for(i=0; i<v;i++)
printf("%d ",c[i]); 
}

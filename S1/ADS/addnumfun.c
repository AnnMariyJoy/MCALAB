#include<stdio.h>
int calculateSum(int a,int b)
{
	return a+b;
}
int main()
{
int num1,num2,sum;
printf("Enter the first number:");
scanf("%d",&num1);
printf("Enter the second number:");
scanf("%d",&num2);
sum=calculateSum(num1,num2);
printf("Sum:%d\n",sum;

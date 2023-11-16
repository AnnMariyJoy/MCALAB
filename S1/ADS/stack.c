#include<stdio.h>
#define size 100
int ch,n,top,x,i;
int stack[10];
void push(void);
void pop(void);
void display(void);
int main()
{
top=-1;
printf("enter the size of stack:");
scanf("%d",&n);
printf("\n\n stack operation using array");
printf("\n\t 1.push\n\t 2.pop\n\t 3.display\n\t 4.exit");
do
{
printf("\n enter the choice:");
scanf("%d",&ch);
switch(ch)
{
case 1:
push();
break;
case 2:

pop();
break;

case 3:

display();
break;

case 4:

printf("\n\t exit point");

default:

printf("\n\t please enter a valid choice(1/2/3/4)");
}
}
while(ch!=4);
return 0;
}
void push()
{
if(top>=n-1)
{
printf("\n\t stack is overflw");
}
else
{
printf("enter a valu to be pushed:");
scanf("%d",&x);
top++;
stack[top]=x;
}
}
void pop()
{
if(top<=-1)
{
printf("stack is underflow");
}
else
{
printf("\n\t the popped element is %d",stack[top]);
top--;
}
}
void display()
{
if(top>=0)
{
printf("\n the elements is stack\n");
for(i=top;i>=0;i--)
printf("\n%d",stack[i]);
printf("\n prees next choice");
}
else
{
printf("\n the stack is empty");
}
}


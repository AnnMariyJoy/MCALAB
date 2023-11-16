#include<stdio.h>
#include<stdlib.h>
int a[10],front=-1,rear=-1,n;
void insert();
void display();
void del();
int main()
{
int ch;
printf("enter the size of the queue");
scanf("%d",&n);
while(1)
{
printf("\n\n 1.insertion");
printf("\n 2. deletion");
printf("\n 3.display");
printf("\n 4.exit");
printf("enter your choice");
scanf("%d",&ch);
switch(ch)
{
case 1:
insert();
break;
case 2:
del();
break;
case 3:
display();
break;
case 4:
printf("\n press any key to exit...");
exit(0);
default:
printf("\n invaild choice");
}
}
return 0;
}
void insert()
{
int x;
if(front==0 && rear==n-1 || (front==rear+1))
{
printf("queue is full");
}
else
{
printf("enter the element to insert:");
scanf("%d",&x);
if(front==-1 && rear==-1)
front=rear=0;
else if(rear==n-1 && front!=0)
rear=0;
else
rear=(rear+1)%n;
a[rear]=x
}
}
}


#include<stdio.h>
#include<stdlib.h>
#define n 5
int main()
{
    int queue[n],ch=1,front=0,rear=0,i,j=1,x=n;
    printf("Queue using Array");
    printf("\n1.Insertion \n2.Deletion \n3.Display \n4.Exit\n");
    while(ch)
    {
        printf("Enter the Choice:\n");
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            if(rear==x)
                printf("\n Queue is Full");
            else
            {
                printf(" Enter element %d:\n",j++);
                scanf("%d",&queue[rear++]);
            }
            break;
        case 2:
            if(front==rear)
            {
                printf("\n Queue is empty");
            }
            else
            {
                printf(" Deleted Element is %d \n",queue[front++]);
                x++;
            }
            break;
        case 3:
            printf("Queue Elements are:\n ");
            if(front==rear)
                printf("\n Queue is Empty");
            else
            {
                for(i=front; i<rear; i++)
                {
                    printf("%d",queue[i]);
                    printf("\n");
                }
                break;
            case 4:
                exit(0);
            default:
                printf("Wrong Choice");
            }
        }
    }
    return 0;
}



import java.util.Scanner;
public class sort{
	public static void main(String args[]){
		String temp;
		int i,j,count;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of strings you would like to enter:");
		count = scan.nextInt();
		String[] str=new String[count];
		Scanner scan2=new Scanner(System.in);
		System.out.print("Enter the String one by one:");
		for(i=0;i<count;i++)
		{
			str[i]=scan2.nextLine();
		}
			System.out.print(" \nThe String before sorting :");
			for(i=0;i<count;i++)
			{
				System.out.println(str[i]);
			}
		  for(i=0;i<count;i++)
		  {
		  		for(j=i+1;j<count;j++)
		  		{
		  			if((str[i].compareTo(str[j]))>0)
		  			{
		  				temp=str[i];
		  				str[i]=str[j];
		  				str[j]=temp;
		  			}
		  		}
		  	}
		  	System.out.println("\nThe String after sorting:");
		   for(i=0;i<count;i++)
		   {
				System.out.println(str[i]);
			}
		}
	}



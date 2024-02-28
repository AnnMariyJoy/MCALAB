import java.util.Scanner;

public class Matrices{
   public static void main(String args[]){
   	Scanner myInput=new Scanner(System.in);
   	System.out.println("Enter Row and Column");
   	int r=myInput.nextInt();
   	int c=myInput.nextInt();
   	
   	int first[][]=new int[r][c];
   	int second[][]=new int[r][c];
   	int sum[][]=new int[r][c];
   	
   	System.out.println("Enter First Matrix");
   	for(int i=0;i<r;i++)
   	   for(int j=0;j<c;j++)
   	      first[i][j]=myInput.nextInt();
   	 
   	System.out.println("Enter Second Matrix");
   	for(int i=0;i<r;i++)
   	   for(int j=0;j<c;j++)
   	      second[i][j]=myInput.nextInt();
   	   
   	for(int i=0;i<r;i++)
   	   for(int j=0;j<c;j++)
   	      sum[i][j]=first[i][j]+second[i][j];
   	   
   	System.out.println("Sum Matrix");
   	for(int i=0;i<r;i++){
   	   for(int j=0;j<c;j++){
   	      System.out.print(sum[i][j]+"\t");
   	   }
   	   System.out.println(); 
   	}
   	
   	}
}

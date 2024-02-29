import java.util.Scanner;


public class Matrix{
   public static void main(String args[]){
      Scanner myInput=new Scanner(System.in);
   	System.out.println("Enter Row and Column");
   	int r=myInput.nextInt();
   	int c=myInput.nextInt();
   	
   	int first[][]=new int[r][c];
   	int second[][]=new int[r][c];
   	
   	
   	System.out.println("Enter Matrix1");
   	for(int i=0;i<r;i++){
   	   for(int j=0;j<c;j++){
   	      first[i][j]=myInput.nextInt();
   	   }
   	}
   	
   	if(r==c){
   	   for(int i=0;i<r;i++){
   	       for(int j=0;j<c;j++){
   	           second[i][j]=first[j][i];
   	       }
   	   }
   	   for(int i=0;i<r;i++){
   	       for(int j=0;j<c;j++){
   	           System.out.print(second[i][j]+"\t");
   	       }
   	       System.out.println();
   	   }
   	   int res=0;
   	   for(int i=0;i<r;i++){
   	       for(int j=0;j<c;j++){
   	           if(first[i][j]!=second[i][j]){
   	              res=1;
   	              break;
   	           }
   	       }
   	   }
   	   if(res!=1) System.out.println("It is Symmetric"); 
   	   else System.out.println("It is not Symmetric");
   	}
   }
}

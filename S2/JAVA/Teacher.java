import java.util.Scanner;
 class Employees {
    int empid;
    String name;
    double salary;
    String address;
			Employees(int eno, String ena, double sal, String add) {
        this.empid = eno;
        this.name = ena;
        this.salary = sal;
        this.address = add;
    }
}
public class Teacher extends Employees{
 String dept;
 String subject;
 
 public Teacher(int eno, String ena, double sal, String add, String dep, String sub){
     super(eno,ena,sal,add);
     this.dept= dep;
     this.subject=sub;
 }
    
 public void display(){
    System.out.println("Employee id: "+empid);
    System.out.println("Name: "+name);
    System.out.println("Salary: "+salary);
    System.out.println("Address: "+address);
    System.out.println("Department: "+dept);
    System.out.println("Subject: "+subject);
 }
 public static void main(String[] args) {
    System.out.println("\nEnter the No. of Employee's:");
    Scanner sc1 = new Scanner(System.in);
    int num = sc1.nextInt();
    Teacher arr[]=new Teacher[num];
    for(int i =0;i<num;i++)
    {
       
        System.out.println("\nEnter Employee id: ");
        int empid=sc1.nextInt();
        System.out.println("\nEnter Name: ");
        String name=sc1.next();
        System.out.println("\nEnter Salary: ");
        double salary=sc1.nextDouble();
        System.out.println("\nEnter Address: ");
        String address=sc1.next();
        System.out.println("\nEnter department: ");
        String dept=sc1.next();
        System.out.println("\nEnter Subject: ");
        String subject=sc1.next();
        arr[i]=new Teacher(empid,name,salary,address,dept,subject);
    

    }
    System.out.println("\nInformations of all the employee's");
     for(int i=0;i<num;i++){
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
        
 }
 sc1.close();
 }


}

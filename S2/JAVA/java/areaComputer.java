
import java.util.*;

public class areaComputer {
	int a;
	int area;
	float aa;
	double bb;
	
	void area(int l,int b) {
		int length = l;
		int breadth = b;
		a=length*breadth;
		System.out.println("Area: "+a);
	}
	
	void area(int s) {
		int side = s;
		area = side * side;
		System.out.println("Area: "+area);	
	}
	
	void area(float b, float h) {
		float base = b;
		float height =h;
		aa = (base*height)/2;
		System.out.println("Area: "+aa);			
	}
	
	void area(double r) {
	    double radius = r;
		bb = 3.14*radius*radius;
		System.out.println("Area: "+bb);	
	}
	
	
public static void main(String[] args)	{
	areaComputer obj = new areaComputer();
	Scanner sc = new Scanner(System.in);

	System.out.println("\nRECTANGLE");
	System.out.println("Enter the length and breadth:");
	int l = sc.nextInt();
	int b = sc.nextInt();
	obj.area(l,b);
	System.out.println("\nSQUARE");
	System.out.println("Enter the side:");
	int s = sc.nextInt();
	obj.area(s);
	System.out.println("\nTRIANGLE");
	System.out.println("Enter the base and height:");
	float base = sc.nextFloat();
	float h= sc.nextFloat();
	obj.area(base,h);
	System.out.println("\nCIRCLE");
	System.out.println("Enter the radius:");
	double r = sc.nextDouble();
	obj.area(r);
	sc.close();
  }
	
}

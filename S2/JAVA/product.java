class product1
{
String pcode;
String pname;
int price;
product1(String pc,String pn,int p)
{
pcode=pc;
pname=pn;
price=p;
}
}
class product{
public static void main(String args[]){
product1 p1=new product1("a11","aust",200);
product1 p2=new product1("a12","alam",500);
if(p1.price<p2.price){
System.out.println(p1.pname+"has lesser price");
}
else
{
System.out.println(p2.pname+"has lesser price");
}
}
}



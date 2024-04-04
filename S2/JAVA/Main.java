import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username = "Ann";
        String password = "ann@202";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Username");
        String u1 = sc.nextLine();
        System.out.println("Enter the Password");
        String u2 = sc.nextLine();
        try {
            if ((u1.equals(username)) && (u2.equals(password))) {
                System.out.println("Acess Granted");
            }
            else  {
                throw  new creexception("Invalid Credentials");
            }
        }
        catch (creexception e){
            System.out.println(e.getMessage());

        }


}}

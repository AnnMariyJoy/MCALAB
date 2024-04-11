import java.util.Scanner;

class Even implements Runnable {
    private int n;

    Even(int n) {
        this.n = n;
    }

    public void run() {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class Fibonacci implements Runnable {
    private int n;

    Fibonacci(int n) {
        this.n = n;
    }

    public void run() {
        int a = 0;
        int b = 1;
        int c;

        //System.out.println("Fibonacci: " + a);
       // System.out.println("Fibonacci: " + b);

        for (int i = 0; i < n; i++) {
           // c = a + b;
            System.out.println("Fibonacci: "+a);
            c = b;
            //a = b;
            b = a+b;
             a = c;
        }
    }
}

public class Mainpro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of Fibonacci numbers to generate: ");
        int fiboCount = scanner.nextInt();

        System.out.println("Enter the limit of even numbers to display: ");
        int evenCount = scanner.nextInt();

        Even even = new Even(evenCount);
        Fibonacci fibonacci = new Fibonacci(fiboCount);

        Thread thread1 = new Thread(even);
        Thread thread2 = new Thread(fibonacci);

        thread1.start();
        thread2.start();
    }
}


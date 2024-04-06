import java.util.Scanner;

class Even implements Runnable {
    int count;

    Even(int count) {
        this.count = count;
    }

    public void run() {
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number: " + i);
            }
        }
    }
}

class Fibonacci implements Runnable {
    int count;
    long[] fibonacci;

    Fibonacci(int count) {
        this.count = count;
        this.fibonacci = new long[count];
    }

    public void run() {
        this.fibonacci[0] = 0;
        this.fibonacci[1] = 1;
        this.fibonacci[2] = 1;

        for (int i = 3; i < count; i++) {
            this.fibonacci[i] = this.fibonacci[i - 1] + this.fibonacci[i - 2];

            if (i > 91) {
                break;
            }

            System.out.println("Fibonacci Number: " + this.fibonacci[i]);
        }
    }
}

public class Mainpro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fiboCount, evenCount;

        System.out.println("Enter the number of Fibonacci Numbers to be listed: ");
        fiboCount = scanner.nextInt();
        System.out.println("Enter the number of Even Numbers to be listed: ");
        evenCount = scanner.nextInt();

        Fibonacci fibonacci = new Fibonacci(fiboCount);
        Even even = new Even(evenCount);

        Thread thread1 = new Thread(even);
        Thread thread2 = new Thread(fibonacci);

        thread1.start();
        thread2.start();
    }
}


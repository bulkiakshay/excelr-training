import java.util.Scanner;

public class Demo19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            
            System.out.println("Fibonacci Series up to " + n + " terms:");


            long first = 0, second = 1;

           
            if (n == 1) {
                System.out.println(first);
            } else {
                
                System.out.print(first + " " + second);

           
                for (int i = 3; i <= n; i++) {
                    long next = first + second;
                    System.out.print(" " + next);

                
                    first = second;
                    second = next;
                }
            }
        }

        
        scanner.close();
    }
}

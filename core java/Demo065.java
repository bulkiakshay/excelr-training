import java.util.Scanner;

public class Demo065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        scanner.close();
    }
}
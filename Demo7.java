import java.util.Scanner;

public class Demo7{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  
        System.out.println("Enter mobile:");
        String phone = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

        
        scanner.close();
    }
}

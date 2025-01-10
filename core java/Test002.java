import java.util.Scanner;

public class Test002 {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to get a greeting:");
        String reply = scanner.nextLine();

            while(true) {
                if(reply.equalsIgnoreCase("yes")){
                System.out.println("Happy Sankranthi");
            }
           //Scanner sc = new Scanner(System.in);
           //System.out.println("Enter text:");
           //reply=sc.nextLine();
           break;
}
Scanner sc = new Scanner(System.in);
           System.out.println("Enter text:");
           reply=sc.nextLine();
}
}
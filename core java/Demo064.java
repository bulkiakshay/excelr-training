import java.util.Scanner;

public class Demo064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an size of an array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements in an array: ");
        int array[] = new int[n];
        int lastelement = n - 1;

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }
        int temp = array[0];
        array[0] = array[n - 1];
        array[n - 1] = temp;

        System.out.println("First Element:" + array[0]);
        System.out.println("Last Element: " + array[lastelement]);

        sc.close();
    }
}
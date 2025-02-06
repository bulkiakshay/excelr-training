public class Demo063{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; 

        if (numbers.length > 0) {
            int sum = numbers[0] + numbers[numbers.length - 1]; 
            System.out.println("Sum of 1st and last element: " + sum);
        } else {
            System.out.println("Array is empty.");
        }
    }
}
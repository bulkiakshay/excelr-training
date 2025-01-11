public class Test004 {
    public static void main(String[] args) {
        // Create an array of 5 names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eva"};
        
        // Create an array of 5 mobile numbers
        String[] mobileNumbers = {"1234567890", "0987654321", "1122334455", "5566778899", "6677889900"};
        
        // Display the names and corresponding mobile numbers
        System.out.println("Friend Details:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + " | Mobile Number: " + mobileNumbers[i]);
        }
    }
}

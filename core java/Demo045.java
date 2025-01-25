public class Demo045 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Value of a before swaapping:"+a);
        System.out.println("Value of b before swaapping:"+b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Value of a after swaapping:"+a);
        System.out.println("Value of b after swaapping:"+b);
    }
}

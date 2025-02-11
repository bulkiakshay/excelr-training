public class Demo075 {
    public static void main(String[] args) {
        int [] array = {5, 2, 9, 1, 4, 6};
        int max = array[0];
        if(array.length == 0){
            System.out.println("Array is empty");
        } else {
            for(int i = 1; i < array.length; i++){
                if(array[i] > max){
                    max = array[i];
                }
            }
            System.out.println("Largest element: " + max);
        }
        
}

}
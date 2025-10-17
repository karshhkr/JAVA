public class OneDArray {
    public static void main(String[] args) {
        // declaration
        int[] arr = new int[5];  // 5 elements, default = 0

        // initialization
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // traversal using normal for loop
        System.out.println("1D Array using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }

        // traversal using enhanced for loop
        System.out.println("1D Array using enhanced for loop:");
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

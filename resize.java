public class Main {
    public static void resize(int[] originalarr, int capacity) {
        int[] newarr = new int[capacity];
        for (int i = 0; i < originalarr.length; i++) {
            newarr[i] = originalarr[i];
        }
        originalarr = newarr; // This line has no effect on the original array outside the method.
    }

    public static void main(String[] args) {
        int[] originalarr = {2, 3, 4, 5, 6};
        int capacity = 5;
        System.out.println("Original array length: " + originalarr.length);

        resize(originalarr, capacity); // The array is not resized outside the method.

        System.out.println("After resize, array length: " + originalarr.length); // The length remains the same.
    }
}

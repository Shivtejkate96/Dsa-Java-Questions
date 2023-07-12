public class Main {
    public static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 12, 65, 90};
        int[] reversedArr = reverse(arr);

        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i]);
        }
    }
}

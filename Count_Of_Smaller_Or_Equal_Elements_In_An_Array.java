public class Main {
    
    public static int Count_Of_Smaller_Or_Equal_Elements_In_An_Array(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                // Target found, find the count of elements smaller or equal
                while (mid >= 0 && arr[mid] == target) {
                    mid--;
                }
                return mid + 1;
            } else if (target < arr[mid]) {
                // Target is smaller, search in the left half
                end = mid - 1;
            } else {
                // Target is larger, search in the right half
                start = mid + 1;
            }
        }
        
        // Target not found, return count of elements smaller or equal to the target
        return start;
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 6, 12, 18, 21, 26, 33, 42};
        int target = 18;
        
        int count = Count_Of_Smaller_Or_Equal_Elements_In_An_Array(arr, target);
        System.out.println("Count of elements smaller or equal to " + target + ": " + count);
    }
}

// BINARY SEARCH
/*Binary Search is a searching algorithm that repeatedly divides the search space into two halves
it eliminates half of the remaining elements after each comparison.
*/
int[] arr = {10, 20, 30, 40, 50, 60, 70};
//  Sorted → Binary Search works.
// ALGORITHM
/*
low = 0
high = last index
repeat while low <= high
↓
Find middle
↓
If middle == target 
return index
else
  if target < middle
  search left half
else 
  search right half
  If not found 
  return -1   ****/
// JAVA IMPLEMENTATION (Iterative)

public class BinarySearch {
  public static int binarySearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == target) {
        return mid;
      }
  if (target < arr[mid]) {
    high = mid - 1;
  }
      else 
  {
    low = mid + 1;
  }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50, 60, 70};
    System.out.println(binarySearch(arr , 50));
  }
} // 4
// Time Complexity = O(logn)

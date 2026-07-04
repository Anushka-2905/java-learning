//LINEAR SEARCH
// Searching means finding whether a particular element exists in a collection and if it exits, determining its position(index)
int[] arr = { 15, 8, 20, 5, 12};
/* ALGORITHM
Start from index 0
↓
Compare current element with target
↓
If equal 
     return index
else
       move to next element
↓
If end of array is reached
↓
return -1*/

/// JAVA IMPLIMENTATION
public class LinearSearch {
  public static int linearsearch(int[] arr, int target) {
    for (int i = 0; i<arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] arr = {15, 8, 20, 5, 12};
    int result = linearSearch(arr, 20);

  Sytem.out.println(result);
  }
} // output is 2

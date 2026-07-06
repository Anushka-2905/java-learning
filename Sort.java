// BUBBLE SORT
/*
Bubble sort repeatdly compares adjacent elements and swaps them if they are in the wrong order
The largest element gradually "bubbles" to the end of the array
*/
// ALGORITHM
/*
1.Select first element and compare with remaining elements one by one if the first element greater than next then swap
2.continue to complete one pass
3.In next pass compare second element wtith remaining elements follow above procedure and complete the pass 
4.arrange all elements in acending or decending order

*/
// JAVA IMPLEMENTATION
public class BubbleSort {
  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n-i-1; j++ ) {
        if ( arr[j] > arr[j + 1] ) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j+1] = temp;
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 4, 2};
    bubbleSort(arr);
    for(int num : arr) {
      System.out.print(num + " ");
    }
  }
}// Output : 2 3 4 5 8
// Time Complexity
// Worst Case  O(n²) = Average case = best case 
// Space complexity O(1)

// Optimized bubble sort to reduce time complexity
public class OptimizedBubbleSort {
  public static void main(String[] args) {
    int n = arr.length; 
  for(int i = 0; i < n-1; i++) {
    boolean swapped = false;
    for (int j = 0; j < n- i - 1; j++) {
      if (arr[j] > arr[j+1] ) {
        int temp = arr[j]; 
      arr[j] = a[j+1];
        arr[j+1] = temp;

      swapped = true;
      }
    }
    if(!swapped) {
      break;
    }
  }
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    bubbleSort(arr);
    for(int num : arr) {
      System.out.print(num + " " );
    }
  }
}
// Time Complexity : O(n)
//-----------------------------------------------------------------------------------------------------

// SELECTION SORT
/*
Find the smallest element from the unsorted part of the array and place it in its correct position
Selection Sort makes only one swap per pass
*/
// ALGORITHM
/*
Step 1:
Start from index 0.
↓
Find the smallest element in the entire array.
↓
Swap it smallest element in the entire array.
↓
Move to index 1.
↓
Find the smallest element in the remaining array.
↓
Swap it with index 1.
↓
Repeat until the array is sorted.
*/
// JAVA IMPLEMENTATION
public class SelectionSort {
  public static void  selectionsort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) 
        {
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
  }
  public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11};
    selectionSort(arr); 
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}
// TOtal comparision : n(n-1)/2 TC in three cases O(n²)
        

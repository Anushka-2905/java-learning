// INSERTION SORT
/* Insertion Sort builds the sorted array one element at a time 
It asssumes
1. The first element is already sorted.
2.Take the next element.
3.Insert it into its correct position in the sorted part.*/

//ALGORITHM
/*
Assume the first element is sorted.
↓
Pick the next element (called 'key').
↓
Compare it with elements before it.
↓
Shift Larger elements one position to the right.
↓
Insert the key into the correct position.
↓
Repeat until all elements are sorted.
*/
// JAVA IMPLEMENTATION
public class InsertionSort {

    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j--;

            }

            arr[j + 1] = key;
        }
    }
  public static void main(String[] args) {
 int[] arr = {5, 2, 4, 6, 1, 3};
insertionSort(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }
}
// MERGE SORT
//ALGORITHM
/*
If array has one element 
Return
find middle
Reecursively sort left half
Recursively sort right half
Merge both halves
*/
// JAVA IMPLEMENTATION

public static void merge(int[] arr, int left, int mid, int right) {
  int[] temp = new int[right - left + 1]; 
int i = left;
  int j = mid + 1;
  int k = 0;
  while ( i <= mid && j <= right) {
    if (arr[i] <= arr[j]) {
      temp[k++] = arr[i++];
    }
    else 
    {
      temp[k++] = arr[j++];
    }
  }
  while ( i<= mid ) {
    temp[k++] = arr[i++];
  }
  while (j <= right) {
    temp[k++] = arr[j++];
  }
  for (int x = 0; x < temp.length; x++)  {
    arr[left + x] = temp[x];
  }
}
// TC O(n logn) SC O(n)

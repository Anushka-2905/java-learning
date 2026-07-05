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

//---------------------------------------------------------------------------------------------------
//INSERTION IN ARRAY

/*  "insert into an array" we usually mean placing a new element into an available position by shifting elements*/
//if we want to insert an element in existing indexx the value at existing may lost
//ALGORITHM
/*
To insert an element at position pos
1. Start from the last used element.
2. Move each element one position to the right.
3. Stop when you reach pos.
4. Place the new element at pos.
5.Increase the number of used elements.*/

// JAVA IMPLEMENTATION
public class Main {
     public static void main(String[] args) {
          int[] arr = new int[5];

          arr[0] = 10;
          arr[1] = 20;
          arr[2] = 30;
          arr[3] = 40;

          int size = 4;  // Number of elements currently stored
          int pos = 2;
          int value =25;
          // Shift elements to the right
          for( int i = size; i > pos; i--) {
               arr[i] = arr[i-1];
          }
          // Insert new value 
          arr[pos] = value;
          size++;
          // Print array
          for (int i = 0; i<size; i++) {
               System.out.println(arr[i] + " " );
          }
     }
     //----------------------------------------------------------------------------------------------------

     // DELETION OF ELEMENT
     //removing an element creates an empty space. To maintain the array structure , all elements after the deleted
     // element must shift one position to the left
     //ALGORITHM
     /*
     Start from pos
     ↓
     Move every next element one position left
     ↓
     Decrease size by 1
     */
     // JAVA IMPLEMENTATION
     public class Deletion {
          public static void main(String[] args) {
               int[] arr = { 10, 20, 30, 40, 50};
               int size = 5;
               int pos = 2;
               // Shift elements left
         for(int i = pos; i < size - 1; i++) {
              arr[i] = arr[i-1];
         }
               size--;
       // Print updated array 
               for(int i = 0; i < size; i++) {
                    System.out.print(arr[i] + " " );
               }
          }
     } // 10 20 40 50 
}


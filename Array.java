/*ARRAY : An array is a collection of elements of the same data types stored in contiguous memory locations
Same data type , fixed size , Index starts from 0
*/
// Declaring an Array
int[] arr;  // arr--variable name
// Creating an array
arr = new int[5];
// declaration + creation together
int[] arr = new int[5];
// Intialize while Creating
int[] arr = { 10, 20, 30, 40, 50};
// Accessing Elements
arr[index]
  //example
  System.out.println(arr[0]);  //output = 10
// Complete example
public class Main {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    System.out.println(arr[0]);
    arr[2] = 99;
    System.out.println(arr[2]);
  }
}
// Getting the size of an array
System.out.println(arr.length);
//---------------------------------------------------------------------
//ARRAY TRAVERSAL
// Traversal means visiting every element of an array exactly once
// from the above array travesal
// 10 -> 20 -> 30 -> 40 -> 50
// using for loop 
int[] arr = { 10, 20, 30, 40, 50};
for(int i=0; i<arr.length; i++) {
  System.out.println(arr[i]);
}
// using while Loop
while (i < arr.length) {
  System.out.println(arr[i]);
  i++;
}
// Enhanced for Loop(for-each)
// we can get the vale not index, we cannot modify index value
int[] arr = { 10, 20, 30, 40, 50};
for (int value : arr) {  // take each element from arr one by one and stored it in value
  System.out.println(value);
}

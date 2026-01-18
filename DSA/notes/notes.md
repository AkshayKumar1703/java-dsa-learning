DSA/Note/Arrays.md

# Arrays in Java

In Java, an array is an important linear data structure that allows us to store multiple values of the same type.
1. Arrays in Java are objects, like all other objects in Java, arrays implicitly inherit from the java.lang.Object class. This allows you to invoke methods defined in Object (such as toString(), equals() and hashCode()).
2. Arrays have a built-in length property, which provides the number of elements in the array
# Key features of Arrays
## Store Primitives and Objects: 
 Java arrays can hold both primitive types (like int, char, boolean, etc.) and objects (like String, Integer, etc.)
## Contiguous Memory Allocation: 
When we use arrays of primitive types, the elements are stored in contiguous locations. For non primitive types, references of items are stored at contiguous locations.

## Zero-based Indexing: 
The first element of the array is at index 0.
## Fixed Length: 
After creating an array, its size is fixed; we can not change it.

# Basics Operation on Arrays in Java
1. Declaring an Array: Method 1 = int[] arr; , Method 2 = int arr[];
2. Initialization an Array: int[] arr = new int[size];  int[] arr1 = new int[]{1,2,3};
3. Change an Array element: arr[0] = 10;
4. Array Length: int n = arr.length;
5. Accessing and Updating All array element : 
6. For More (https://www.geeksforgeeks.org/java/arrays-in-java/)

## Advantages of Java Arrays
1. Efficient Access: Accessing an element by its index is fast and has constant time complexity, O(1).
2. Memory Management: Arrays have fixed size, which makes memory management straightforward and predictable.
3. Data Organization: Arrays help organize data in a structured manner, making it easier to manage related elements.

## Disadvantages of Java Arrays
1. Fixed Size: Once an array is created, its size cannot be changed, which can lead to memory waste if the size is overestimated or insufficient storage if underestimated.
2. Type Homogeneity: Arrays can only store elements of the same data type, which may require additional handling for mixed types of data.
3. Insertion and Deletion: Inserting or deleting elements, especially in the middle of an array, can be costly as it may require shifting elements.

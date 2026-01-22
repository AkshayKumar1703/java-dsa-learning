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
7. Passing Arrays to method:
     public class Geeks {
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
        sum(arr);
    }

    public static void sum(int[] arr)
    {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
}
8. Arrays of Objects in Java : An array of objects is created like an array of primitive-type data items

Example: Here we are taking a student class and creating an array of Student with five Student objects stored in the array. The Student objects have to be instantiated using the constructor of the Student class and their references should be assigned to the array elements.
class Student {
    public int roll_no;
    public String name;
  
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Geeks {
    public static void main(String[] args){
      
        // declares an Array of Student
        Student[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Student[5];

        // initialize the elements of the array
        arr[0] = new Student(1, "aman");
        arr[1] = new Student(2, "vaibhav");
        arr[2] = new Student(3, "shikar");
        arr[3] = new Student(4, "dharmesh");
        arr[4] = new Student(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : { "
                               + arr[i].roll_no + " "
                               + arr[i].name+" }");
    }
}

## Advantages of Java Arrays
1. Efficient Access: Accessing an element by its index is fast and has constant time complexity, O(1).
2. Memory Management: Arrays have fixed size, which makes memory management straightforward and predictable.
3. Data Organization: Arrays help organize data in a structured manner, making it easier to manage related elements.

## Disadvantages of Java Arrays
1. Fixed Size: Once an array is created, its size cannot be changed, which can lead to memory waste if the size is overestimated or insufficient storage if underestimated.
2. Type Homogeneity: Arrays can only store elements of the same data type, which may require additional handling for mixed types of data.
3. Insertion and Deletion: Inserting or deleting elements, especially in the middle of an array, can be costly as it may require shifting elements.

# ArrayList in Java
 An ArrayList in Java is a resizable (or dynamic) array from the java.util package that can grow or shrink automatically as elements are added or removed, unlike regular arrays with a fixed size.

1. Indexed Access: Elements can be accessed using their index, just like arrays.
2. Allows Duplicates: Duplicate elements are allowed.
3. Maintains Insertion Order: Elements are stored in the order they are inserted.
4. Not Synchronized: ArrayList is not thread-safe. To make it thread-safe, you must wrap it manually using.
Example
import java.util.ArrayList;

class Main {
    public static void main (String[] args) {
        
      	// Creating an ArrayList
      	ArrayList<Integer> a = new ArrayList<Integer>();
      	
      	// Adding Element in ArrayList
      	a.add(1);
      	a.add(2);
      	a.add(3);
      
      	// Printing ArrayList
      	System.out.println(a);
    }
}



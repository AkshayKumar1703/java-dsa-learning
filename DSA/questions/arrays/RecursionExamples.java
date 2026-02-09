import java.io.*;
import java.util.*;


 /* Reverse a list using recursion method. */


 public static void recursivePrint(List<Integer> numbers) {


   if (numbers.isEmpty()) {
     return;
   }


   System.out.print(numbers.get(numbers.size() - 1) + " ");


   recursivePrint(numbers.subList(0, numbers.size()-1));


 }
}


DSA/Note/Strings.md 

Java Strings
In Java, a String is the type of object that can store a sequence of characters enclosed by double quotes and every character is stored in 16 bits, i.e., using UTF 16-bit encoding. A string acts the same as an array of characters. Java provides a robust and flexible API for handling strings, allowing for various operations such as concatenation, comparison and manipulation.

## Declaration
String name = "Tony";

Taking Input
Scanner sc = new Scanner(System.in);
       String name = sc.next();

## Concatenation (Joining 2 strings)
String firstName = "Tony";
       String secondName = "Stark";


       String fullName = firstName + " " + secondName;
       System.out.println(fullName);

## Print length of a String
String firstName = "Tony";
       String secondName = "Stark";


       String fullName = firstName + " " + secondName;
       System.out.println(fullName.length());

## Access characters of a string
String firstName = "Tony";
       String secondName = "Stark";


       String fullName = firstName + " " + secondName;


       for(int i=0; i<fullName.length(); i++) {
           System.out.println(fullName.charAt(i));
       }

1. str.length();               // 11  
2. str.charAt(0);              // 'H'  
3. str.substring(0, 5);        // "Hello"  
4 str.indexOf("World");        // 6  
5. str.toLowerCase();          // "hello world"  
6. str.toUpperCase();          // "HELLO WORLD"  
7. str.trim();                 // Removes leading/trailing spaces  
8. str.replace('l', 'x');      // "Hexxo Worxd"  
9. str.contains("World");      // true  
10. str.startsWith("Hello");    // true  
11. str.endsWith("World");      // true  
12. str.split(" ");             // ["Hello", "World"]  
13. str.equals("Hello World"); // true (content comparison)  
14. str == "Hello World";      // Reference comparison 




// conditional statements in JAVA
// if - statement executed if a condition is true.
// if-else - statement executed if a condition is true and another block of code to be executed if the condition is false.
// if-else if - statement executed if a condition is true and another block of code to be executed if the condition is false and another block of code to be executed if the condition is false.
//switch - statement is used to select one of many code blocks to be executed.
// break statement is used to exit from a loop or switch statement.
// continue statement is used to skip the current iteration of a loop and continue with the next iteration.


// import java.util.*;

// public class Conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age > 18){
//             System.out.println("adult");
//         } else {
//             System.out.println("not adult");
//         }
//     }
// }



// EXAMPLE2 - CHECK ODD OR EVEN

// import java.util.*;

// public class Conditionalstatements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         if(num % 2 == 0){
//             System.out.println("even");
//         } else {
//             System.out.println("odd");
//         }
//     }
// }


//example 3 -comparision of two numbers

// import java.util.*;
// public class Conditionalstatements{

//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         if(a==b) {
//             System.out.println("a is equal to b");
//         } else {
//             if (a >b) {
//                 System.out.println("a is greater than b");
//             } else {
//                 System.out.println("b is greater than a");
//             }
//         }
//     }
        
//     }



// also 
// import java.util.*;
// public class Conditionalstatements {



// public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
        
//         if(a==b) {
//             System.out.println("a is equal to b");
//         } else if(a>b){
//             System.out.println("a is greater");
//         }
//         else{
//             System.out.println("a is less than b");
//         }
//         }
//     }



//example 4 - print the greetings
// import java.util.*;

// public class Conditionalstatements {

//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         if(button == 1){
//             System.out.println("Hello");
//         } else if(button == 2){
//             System.out.println("Namaste");
//         } else if(button == 3){
//             System.out.println("Bonjour");
//         } else {
//             System.out.println("Invalid button");
//         }
//     }
// }





//to avoid writing multiple if-else statements we can use switch statement
// import java.util.*;

// public class Conditionalstatements {

//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();

//         switch(button){
//             case 1:
//                 System.out.println("Hello");
//                 break;
//             case 2:
//                 System.out.println("Namaste");
//                 break;
//             case 3:
//                 System.out.println("Bonjour");
//                 break;
//             default:
//                 System.out.println("Invalid button");
//         }
//     }
// }



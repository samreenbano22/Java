// public class Pattern {
//     public static void main(String[] args) {
//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
        
//     }
// }


//OR IT CAN ALSO BE DONE USING LOOPS CONCEPTS
// public class Pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//QUESTIONS ON PATTTERNS
//1. *****
//   *****
//   *****
//   ***** 

//using nested loops 
public class Pattern{
    public static void main(String[] args){
        for (int i =1; i<=4; i++){  //for rows
            for (int j =1; j <=5; j++){    //columns
                System.out.print("*");   //will print the stars in the same line
            }
            System.out.println("*");    //will print the stars in the next line 
        } 
    }
}
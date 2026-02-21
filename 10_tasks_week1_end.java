// Task 2 :

// import java.util.Scanner;
// public class Main{

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter Number to check for ODD-EVEN");
//         int n = scanner.nextInt();
//         if(n%2==0){
//             System.out.print(n+ " is Even Number");
//         } else {
//             System.out.print(n+ " is Odd Number");
//         }

//     }
// }

















// Task 3 : 
// import java.util.Scanner;
// public class Main{

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter Number to Create Table");
//         int n = scanner.nextInt();
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n+" x "+i+" = "+(i*n));
            
//         }

//     }
// }
















// Task 4 :
// import java.util.Scanner;
// public class Main{

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter Number to Add : ");
//         int n = scanner.nextInt();
//         int sum =0;
//         int i =1;

//             while (i<=n) { 
//                 sum += i;
//                 i++;
//             }
        
//             System.out.println("Sum is "+sum);

//     }
// }







// Task 5 : 
// import java.util.Scanner;
// public class Main{

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter Number to Add : ");
//         int n = scanner.nextInt();
//         boolean isPrime = true;
        
//         if(n<=1){
//             isPrime = false;
//         } else {
//             for (int i = 2; i < n; i++) {
//                 if(n%i == 0){
//                     isPrime = false;
//                 }
//             }
//         }
       
//         if(isPrime){
//             System.out.print("isPrime");
//         } else {
//             System.out.print("!isPrime");
//         }
//         scanner.close();

//     }
// }

// Task 5 Again :

// import java.util.Scanner;
// public class Main{



//     public static boolean Prime(int n) {
//         // boolean isPrime = true;
//         if(n<=1){
//             return false;
//         } else {
//             for (int i = 2; i < n; i++) {
//                 if(n%i == 0){
//                     return false;
//                 }
//             }
//         }
       
        

//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter Number to Add : ");
//         int n = scanner.nextInt();
//         Prime(n);
//         if(Prime(n) ){

//             System.out.println("is Prime");
//         } else {
//             System.out.println("is not Prime");
//         }
        
//         scanner.close();

//     }
// }


// ---------------------------------------------

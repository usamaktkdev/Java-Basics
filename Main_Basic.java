// Task 1: Create Your Variables

// Create variables for:

// Your name (String)

// Your age (int)

// Your favorite number (double)

// Your favorite letter (char)

// If you like Java (boolean)

// Then print them using System.out.println().

// public class Main {
//     public static void main(String[] args){
//     String name= "Osama";
//     int age = 24;
//     double fvrtNumber = 7.0;
//     char fvrtCharacter = 'N';
//     boolean loveJava = true;



//     System.out.println("Name : " + name);
//     System.out.println("Age : " + age);
//     System.out.println("Fvrt Number : " + fvrtNumber);
//     System.out.println("Faveriote Character : " + fvrtCharacter);
//     System.out.println("Love Java ? : " + loveJava);
//     }
// }


// Task 2: Data Type Practice

// Create 3 int numbers and print their sum, difference, and product.

// Create 2 double numbers and print their division and remainder.

// Create a char and a boolean, then print them.

// public class Main{
//     public static void main(String[] args) {
//         int a = 12;
//         int b = 34;
//         int c = 43;
//         double d = 10.5;
//         double e = 15.3;
//         char word = 'N';
//         boolean learning = true;
        
//         int sum = a+b+c;
//         int difference = a-b-c;
//         double division = d/e;
//          double remainder = d%e;
//          double product = a*b*c;
        
//         System.out.println("Sum = " + sum);
//         System.out.println("Difference = " + difference);
//         System.out.println("Product  = " + product);
//         System.out.println("Division = " + division);
//         System.out.println("Remainder = " + remainder);
//         System.out.println("Favert Word " + word + " and Learning ?" + learning);


//     }
// }


// Task 3: Operators Practice

// Create 2 int numbers and print: sum, difference, product, division, remainder.

// Update one number using += and *= operators, print updated value.

// Use ++ and -- on one variable and print each step.


// public  class Main{
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 20;

//         int sum = num1+num2;
//         int diff = num2-num1;
//         int product = num1*num2;
//         double division = num1/num2;
//         double remainder = num1%num2;

//         System.out.println("Sum :" + sum + "Diff : "+ diff + "Product :" +product + "Division : "+division+ "Remainder" + remainder);

//         num1 += 5;
//         System.out.println("Updated Number 1 : "+ num1);
//         num1 *= 5;
//         System.out.println("Updated again Number 1 : " + num1);

//         num2++;
//         System.out.println("++ Updated Number 2 : "+ num2);
//         num2--;
//         System.out.println("-- Updated Number 2 : "+ num2);
//     }
// }


// public  class  Main{
//     public static void main(String[] args) {
//         double pi = 3.14159;
//         int updateToInt = (int)pi;
//         System.out.println("-- Updated Pi: "+ updateToInt);

//         int a = 10;
//         int b = 4;
//         double division = (double)a / b;
//         System.out.println("-- Division : "+ division);
//         int Divisionn = (int) division;
//         System.out.println("-- Division : "+ Divisionn);

//     }
//     }
    




// Small Practice Tasks

// Create two int variables, compare them using all 6 comparison operators, and print results.

// Create boolean variables storing comparison results and print them.

// Use if-else to check if a number is positive, negative, or zero.

// Use logical operators to check if a number is even and greater than 10.



// public  class  Main{
//     public static void main(String[] args) {
//           int x = 40;
//           int y = 30;
//           System.out.println(x==y);
//           System.out.println(x<y);
//           System.out.println(x>y);
//           System.out.println(x!=y);
//           System.out.println(x>=y);
//           System.out.println(x<=y);
//           System.out.println("-----------------------------------------");

//           boolean isequal = x==y;
//           boolean isGreater = x>y;
//           boolean isLess = x<y;
//           boolean isNotEqual = x!=y;
//           boolean isGreaterThanOrEqualTo = x>=y;
//           boolean isLessThanOrEqualTo = x<=y;

          
//           System.out.println(isequal);
//           System.out.println(isGreater);
//           System.out.println(isLess);
//           System.out.println(isNotEqual);
//           System.out.println(isGreaterThanOrEqualTo);
//           System.out.println(isLessThanOrEqualTo);



//           if(x==0){
// System.out.println("X is 0");
            
//           } else if(x>0) {
//             System.out.println("x is Positive");
//           } else {
//             System.out.println("X is Negative");
//           }


//           if(y%2 == 0 && y>10){
//             System.out.println(" Yes its Both Even and Greater Than 10");
//           } else {
//                         System.out.println(" One of them is False");
//           }
//     }
  
    
// }



// public  class  Main{
//     public static void main(String[] args) {
//           int x = 40;
//           int y = 30;
//           int z = 76;
//           int biggestNumber = 0;
        

//           if(x>y && x>z){
//             biggestNumber = x; // this is true for sure czz biggest numer is 0 is now it has x vale stored
// System.out.println("X is the biggest");
            
//           } else if(y>x && y > z) {
//             biggestNumber = y;
//             // biggest number has x value so if y is greater than that we will replace it with y value
//             System.out.println("Y is Biggest");

//           }if(z>x && z>y){
//             biggestNumber = z;
//             // same logic here as for y
//             System.out.println("Z is Biggest ");
//           }


//           if(x>=0 && y>=0 && z>=0){
//             System.out.println(" Yes All Positive");
//           } else {
//                         System.out.println(" One of them is Negative");
//           }

//           System.out.println(biggestNumber);
//     }
  
    
// }
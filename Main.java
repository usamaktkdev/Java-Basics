import java.util.Scanner;
public class Main{

    static int totalMarks (int[] marks){
        int total = 0;
        for(int i = 0; i< marks.length; i++){
            total += marks[i];
        }
        return total;
    }

    static double averageMarks (int[] marks){
        int count =0;
        double total = 0;
        for(int i = 0; i< marks.length; i++){
            total += marks[i];
            count++;
        }
        double average = total/count;
        return average;
    }

    static int  highest(int[] marks){
        int highest = 0;
        for(int i = 0; i< marks.length; i++){
            if(marks[i]>highest){
                highest = marks[i];
                
            }
            
        }
        return  highest;
        
    }

    static int  lowest(int[] marks){
        int lowest = marks[0];
        for(int i = 0; i< marks.length; i++){
            if(marks[i]<lowest){
                lowest = marks[i];
                
            }
            
        }
        return  lowest;
        
    }


    static int countPass(int[] marks){
        int count = 0;
         for(int i = 0; i< marks.length; i++){
            if(marks[i]>=40){
                count++;
            }
         }


        return count;
    }

      static int countFail(int[] marks){
        int count = 0;
         for(int i = 0; i< marks.length; i++){
            if(marks[i]<40){
                count++;
            }
         }


        return count;
    }


    static void  printTable(int [] marks){
        for(int i = 0; i< marks.length; i++){
            if(marks[i]>=90){
                System.out.println("Student "+ (i+1) + "Grade  A");
            } else if(marks[i]>=75){
                System.out.println("Student "+ (i+1) + "Grade  B");
            } else if(marks[i]>=60){
                System.out.println("Student "+ (i+1) + "Grade  C");
            } else if(marks[i]>=40){
                System.out.println("Student "+ (i+1) + "Grade  D");
            } else {
                System.out.println("Student "+ (i+1) + "Grade  F");
            }
         }
    }
    static void  search(int[] marks, int searchWord){
        for (int i = 0; i < marks.length; i++) {
            if(searchWord == marks[i]){
                System.out.println("Mark Found in the List, Student "+(i+1) +", Marks "+ marks[i]);
            } else {
            }
        }
        System.out.println("Mark not found");
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students : ");
        int n = sc.nextInt();
        

        int[] myMarks = new int[n];



        for (int i = 0; i < n; i++) {
            while (true) { 
                System.out.print("Enter marks for Student "+ (i+1)+" ");
            int uploadMarks = sc.nextInt();
            if(uploadMarks>=0 && uploadMarks<=100){
                myMarks[i] = uploadMarks;
                break;
            } else {
                System.out.println("Incorrect, Please enter 0 to 100");
            }
            }
        }
        
        System.out.println("Total Marks : " + totalMarks(myMarks));
        System.out.println("Average Marks : "+ averageMarks(myMarks));
        System.out.println("Highest Marks : "+highest(myMarks));
        System.out.println("Lowest Marks : "+lowest(myMarks));
        System.out.println("Student Pass : "+countPass(myMarks));
        // System.out.println("Student Fail : "+ (countPass(myMarks)-myMarks.length));
        // System.out.println("Student Fail : "+ (countPass(myMarks)-n));
        System.out.println("Student Fail : "+ countFail(myMarks));

        printTable(myMarks);

        System.out.print("Enter Marks to Search : ");
        int check = sc.nextInt();
        search(myMarks, check);
    }

    
}

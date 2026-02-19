import java.util.Scanner;
public class Main{



    public static boolean Prime(int n) {
        // boolean isPrime = true;
        if(n<=1){
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if(n%i == 0){
                    return false;
                }
            }
        }
       
        

        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number to Add : ");
        int n = scanner.nextInt();
        Prime(n);
        if(Prime(n)){

            System.out.println("is Prime");
        } else {
            System.out.println("is not Prime");
        }
        
        scanner.close();

    }
}

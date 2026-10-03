import java.util.Scanner;

public class methodPractice {

    static void greetings() {
        System.out.println("Hello Dhel!");
    }

    static int sum( int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    static void checkEvenodd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
           System.out.println("Odd");
        }
        
    }



    public static void main(String[] args) {
        
        greetings();

        System.out.println();

        int num1 = 2;
        int num2 = 2;
        int result = sum(num1, num2);
        System.out.println(result);

        System.out.println();

        Scanner input = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int num = input.nextInt();

            checkEvenodd(num);

            
        input.close();
        




    }
}
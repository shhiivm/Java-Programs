package functions;
import java.util.Scanner;


public class sumOfTwoNum {



    public static int sum(int num1,int num2){
        int c = num1+num2;
        return c;
    }


    public static int product(int num1, int num2){
        return num1*num2;
    }

    public static int factorial(int num1){
        int fact = 1;
        for(int i = num1;i>0;i--){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        // int num2 = sc.nextInt();


        // int c = sum(num1, num2);
        // System.out.println("sum = "+c);


        // int pro = product(num1,num2);
        // System.out.println("product = "+product(num1,num2));

        int fact = factorial(num1);
        System.out.println("factorial of "+num1+" is = "+factorial(num1));
    }
    
}

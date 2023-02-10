package functions;
import java.util.Scanner;

public class sumOfOddNums {

    public static int sumOfAllOddNums(int num){
        int sum =0;
        if(num%2==0){
            for(int i=1;i<num;i++){
                if(i%2!=0){
                    sum +=i;
                }
            }

        }
        else{
            for(int i=1;i<=num;i++){
                if(i%2!=0){
                    sum +=i;
                }

        }
    }
        
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = sumOfAllOddNums(num);
        System.out.print("Sum of all odd numbers between 1 and "+num+" = "+sum);
       
    }
    
}

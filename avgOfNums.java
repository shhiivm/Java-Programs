package functions;

import java.util.Scanner;

public class avgOfNums {
    public static int average(int n1, int n2, int n3 ){
        int avg = (n1+n2+n3)/3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int n1= sc.nextInt();
        int n2 =sc.nextInt();
        int n3 =sc.nextInt();

        int avg = average(n1,n2,n3);
        System.out.println("Average of 3 numbers is = "+avg);
    }
    
}

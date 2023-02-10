import java.util.Scanner;

public class functionPrograms {

    public static int greatestOfTwo(int n1,int n2){
        if(n1>n2)
        return n1;
        else
        return n2;

    }

    public static double areaOfCircle(double rad){
        double cir = 2*3.141*rad;
        return cir;

    }
    public static void voteElig(int age){
        if(age>18)
        System.out.print("Eligible to Vote");
        else 
        System.out.print("Not eligible to Vote");
    }
    public static int powerOfNum(int b, int e){
        int pow =1;
        for(int i =0;i<e;i++){
            pow *=b;
        }
        return pow;
    }
    public static void fibonaccieSeries(int num){
        int f=0;
        int s=1;
        int n =f+s;
        for(int i=1;i<=num;i++){
            System.out.println(f);
            f=s;
            s=n;
            n=f+s;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter:-\n1.To check greatest of two numbers.\n2.To get circumference of circle\n3.For vote eligibility\n4.To find power\n5.Fibonacci Series");
        int opt = sc.nextInt();
        switch(opt){
            case 1: 
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
    
            System.out.print( greatestOfTwo(n1,n2)+" is greatest of "+n1+" and "+n2);
            break;
            case 2: 
            System.out.println("Enter Radius of circle");
            double rad = sc.nextDouble();
            System.out.println("Circumfence of a circle with radius "+rad+" is = "+areaOfCircle(rad));
            break;
            case 3:
            System.out.println("Enter your age!");
            int age = sc.nextInt();
            voteElig(age);
            break;
            case 4: 
            System.out.println("Enter Base");
            int b = sc.nextInt();
            System.out.println("Enter Exponent");
            int e = sc.nextInt();
           System.out.println(e+" power of base "+b+" is = "+powerOfNum(b,e));
            break;
            case 5:
            System.out.println("Enter a number to print it's fibonacci");
            int num = sc.nextInt();
            fibonaccieSeries(num);
            break;

            default:
            System.out.println("Please enter from given options!");

        }
        
       

    }
    
}

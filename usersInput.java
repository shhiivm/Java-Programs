import java.util.Scanner;
public class usersInput {

    public static void numberInput(int num,int ar[]){

        int pos =0;
        int neg =0;
        int zer =0;
        for(int i=0;i<ar.length;i++){
            ar[i] = sc.nextInt();
            if(ar[i]>0){
                pos +=1;
            }
            else if(ar[i]<0){
                neg+=1;
            }
            else{
                zer+=1;
            }
        }
            System.out.println("Positive numbers Entered By User = "+pos);
            System.out.println("Negative numbers Entered By User = "+neg);
            System.out.println("Zeros numbers Entered By User = "+zer);
        

    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number till you want to print");
        int num = sc.nextInt();
        System.out.println("Enter numbers!");
        int [] arr = new int[num];
        numberInput(num,arr);
        
            

        

        
    }

    
}

package Basic_Programs;

import java.util.Scanner;

public class Q2_Prime_Numbers
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();

        int temp=0;

        for(int i=2;i<n-1;i++){
            if(n%i==0){
                temp=temp+1;
            }
        }
        if(temp>0){
            System.out.println("It is not a Prime Number.");
        }
        else{
            System.out.println("It is a Prime Number.");
        }
    }
}

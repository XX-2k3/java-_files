package syllabus.u1;
/*Write a java program to find ODD or EVEN number using
command line argument */

import java.util.Scanner;
public class oddEven {
    boolean even(int num){
        if (num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ifElse z = new ifElse();
        
        System.out.println("enter an ingeger : ");
        int x = a.nextInt();

        if(z.even(x)){
            System.out.println(x+" is even");
        }
        else{
            System.out.println(x+" is odd");
        }
        a.close();
    }
}
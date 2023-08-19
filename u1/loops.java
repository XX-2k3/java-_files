package syllabus.u1;
/*Write a java program to get the name from user and print 10 times
using loop (for, while and do while) */
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        String name;

        System.out.println("enter the name : ");
        name = x.nextLine();

        System.out.println("for loop");
        for(int i=0;i<10;i++){
            System.out.println(name);
        }
        
        int z = 1;
        
        System.out.println("while loop");
        while(z<11){
            System.out.println(name);
            ++z;
        }
        
        int f = 1;
        System.out.println("do while loop");
        do{
            System.out.println(name);
            ++f;
        }while(f<10);

        x.close();        
    }
}

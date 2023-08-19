package syllabus.u1;
/*Write a java program to get different values from user at runtime
using Scanner class */
import java.util.Scanner;

public class scannerClass {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("enter num");
        int num = x.nextInt();

        System.out.println("enter str");
        String str = x.nextLine();

        System.out.println("enter ch");
        char ch = x.next().charAt(0);

        System.out.println("enter boolean");
        Boolean bool = x.nextBoolean();

        System.out.println(num + str + ch + bool);

        x.close();
    }    
}

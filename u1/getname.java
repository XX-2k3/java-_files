package syllabus.u1;
/*Write a java program to get a name from user and display on
screen. */
import java.util.Scanner;

public class getname {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter a name : ");
        String name = x.nextLine();
        System.out.println("name is : "+name);
        x.close();
    }
}

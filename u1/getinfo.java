package syllabus.u1;
/*Write a java program to get personal information from user and
display on screen. */
import java.util.Scanner;

public class getinfo {
    static class Info{
        String name;
        String div;
        String course;
        int cpi;
        int age;

    void getInfo(){
        
        Scanner x = new Scanner(System.in);
        System.out.println("enter name");
        name = x.nextLine(); 
        System.out.println("enter course");
        course = x.nextLine(); 
        System.out.println("enter div");
        div = x.nextLine(); 
        System.out.println("enter cpi");
        cpi = x.nextInt(); 
        System.out.println("enter age");
        age = x.nextInt(); 
        
        x.close();
    }
}
    public static void main(String[] args) {
        Info z = new Info();
        z.getInfo();
        System.out.println("name is :"+z.name);
        System.out.println("course is :"+z.course);
        System.out.println("div is :"+z.div);
        System.out.println("cpi is :"+z.cpi);
        System.out.println("age is :"+z.age);
    }
}

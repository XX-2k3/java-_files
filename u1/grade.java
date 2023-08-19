package syllabus.u1;
/*Write a java program to find out students result/grade using if condition*/
import java.util.Scanner;

public class grade {
    static class Result {
        int sub1;
        int sub2;
        int sub3;
        int sub4;

        void setmarks(int sub1, int sub2, int sub3, int sub4) {
            this.sub1 = sub1;
            this.sub2 = sub2;
            this.sub3 = sub3;
            this.sub4 = sub4;
        }

        int percentage() {
            return (this.sub1 + this.sub2 + this.sub3 + this.sub4) / 4;
        }

        String grade(){
            if(this.percentage()>90){
                return "gread is : A";
            }
            else if(this.percentage()>75){
                return "gread is : b";
            }
            else if(this.percentage()>60){
                return "gread is : c";
            }
            else if(this.percentage()>45){
                return "gread is : d";
            }
            else if(this.percentage()>35){
                return "gread is : e";
            }
            else{
                return "you failed";
            }
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        Result r = new Result();

        System.out.println("enter marks one by one for 4 subs (out of hundred): ");
        r.setmarks(x.nextInt(), x.nextInt(), x.nextInt(), x.nextInt());

        System.out.println(r.grade());

        x.close();
    }
}

package syllabus.u1;

/*Write a java program to perform different arithmetic operations.
(Using Command Line args) */
import java.util.Scanner;

public class Arithmatic {
    static class ArithmaticOprations {
        int num1;
        int num2;

        public void getNum(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public int sum() {
            return this.num1 + this.num2;
        }

        public int sub() {
            return this.num1 - this.num2;
        }

        public int mul() {
            return this.num1 * this.num2;
        }

        public float div() {
            return this.num1 / this.num2;
        }

        public int mod() {
            return this.num1 % this.num2;
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArithmaticOprations z = new ArithmaticOprations();
        System.out.println("enter num1 and num 2");
        z.getNum(x.nextInt(), x.nextInt());
        System.out.println("sum is : "+z.sum());
        System.out.println("sub is : "+z.sub());
        System.out.println("mul is : "+z.mul());
        System.out.println("div is : "+z.div());
        System.out.println("mod is : "+z.mod());
        x.close();
    }
}

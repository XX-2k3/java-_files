package syllabus.u1;
/*Write a java program to use if Condition */
public class ifElse {
    boolean even(int num){
        if (num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int x = 8;
        ifElse z = new ifElse();
        
        boolean a = z.even(x);
        System.out.println(a);
    }
}

package syllabus.u1;
/*Write a java programs of 1D and 2D array*/
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int oneD[] = new int[10];
        int twoD[][] = new int[3][3];
        
        System.out.println("enter 1d array");
        for(int i = 0 ; i<10; i++){
            oneD[i] = x.nextInt();
        }
        System.out.println("enter 2d array");
        for(int i = 0 ; i<3; i++){
            for(int j = 0 ; j<3; j++){
                twoD[i][j] = x.nextInt();
            }
        }

        System.out.println("1d array");
        for(int i = 0 ; i<10; i++){
            System.out.println(oneD[i]);
        }

        System.out.println("2d array");
        for(int i = 0 ; i<3; i++){
            for(int j = 0 ; j<3; j++){
                System.out.println(twoD[i][j] + " ");
            }
            System.out.println();
        }
        

        x.close();
    }
}



import java.util.Scanner;

public class Roots {

    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        int A = nr.nextInt();

        int B = nr.nextInt();

        int C = nr.nextInt();
        //double D = Math.pow(B,2)-(4*A*C);
        double D = (-1);
        if (A == 0) {
            double root1 = C/B ;
            System.out.println(root1);

        }


      else if (D < 0) {
            System.out.println("No Real numbers R are roots in this equation");

        }

        else {
            double root1 = (B + Math.sqrt(D))/(2*A);
            double root2 = (B-Math.sqrt(D))/(2*A);

            System.out.println(+root1+" is a root ");
            System.out.println(root2+" is a root ");
        }
    }





}

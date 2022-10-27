import java.util.Scanner;

public class LigningsAflæser {
    public static void main(String[] args){
      Scanner Ligningscan = new Scanner(System.in);
        int a = Ligningscan.nextInt();


        int b = Ligningscan.nextInt();

        int x0 = Ligningscan.nextInt();
        int y0 = Ligningscan.nextInt();



       int kage = Math.abs(a * x0-y0+b);


       //double kage1 = Math.sqrt((1 + Math.pow(a,2)));
        int kage1 = 0;

        if (kage1 < 0) {
       double kage3 = kage/kage1;
        System.out.println("Dist(L,P)= "+ kage3);}
        else {
            System.out.println("Error illegal operation (kage/0)");
        }
    }



}

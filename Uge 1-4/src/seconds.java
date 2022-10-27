import java.util.Scanner;

public class seconds {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of seconds: ");
        int s = sc .nextInt();

        int d = s / 86400;
        int h = (s%86400) / 3600;

        int m = (s %86400% 3600) / 60;

        int s2 = s % 86400% 3600 % 60;

        System.out.println(d+ " Days "+ h + " Hours "+m+ " Minutes " +s2 + " Seconds ");
    }


}

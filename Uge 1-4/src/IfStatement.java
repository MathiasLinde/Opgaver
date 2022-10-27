import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner tal = new Scanner(System.in);
        int nr = tal.nextInt();

        if (nr != 0){

            int result = (100/nr)*100;
            System.out.println(result);

        }
        else{
            System.out.println("Error can't / by 0: ");

        }

    }


}

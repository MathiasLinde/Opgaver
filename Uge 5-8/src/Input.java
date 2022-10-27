
import java.util.Scanner;
public class Input {

    public  static String namescan(){
        System.out.println("What is the name of the person?");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }


}

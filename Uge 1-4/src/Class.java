import java.util.Scanner;

public class Class {
    public static void main(String args[]){
while (true){
    Scanner in = new Scanner(System.in);

    System.out.println("Please type your password");
    String password = in.nextLine();

    int length = password.length();

    //System.out.println(password);
    //System.out.println(length);
    if (length < 7){
        System.out.println("Your password is too short, please try a longer more secure one");


    }


    else if (length > 15){
        System.out.println("Your password is too long");
    }
    else if(length >= 7 && length <= 14){
        System.out.println("Congratz on choosing your password!");
        break;

    }


}

    }

}

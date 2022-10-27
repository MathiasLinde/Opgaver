import java.util.Scanner;

public class tabel {


    public static void main(String[] args) {


            while (true){
                Scanner scanner = new Scanner(System.in);
                String  s = scanner.nextLine();


                char c = s.charAt(0);
                 if (s.equals("exit")) {
                    System.out.println("Exiting program");
                    break;
                }

                else if (c>=65&&c<=90){
                    System.out.println("Tegnet er et stort bogstave");
                }

                else if (c>=97&&c<=122){
                    System.out.println("Lille bogstav");
                }

                else if (c>=48&& c<=57){
                    System.out.println("Tegnet er et tal");
                }

                else if (c==33 ||c==35||c==43||c==92) {
                    System.out.println("Tegnet er et special tegn");

                }



                else {
                    System.out.println("invalid input");
                }
        }

    }
}

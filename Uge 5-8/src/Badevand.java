import java.util.Scanner;

public class Badevand {
    public static void main(String[] args) {
        String[] arr = args ;
      //  int[] badetemp = {Integer.parseInt[arr]};

        int[] badetemp = new int[args.length];
        for (int i = 0; i< args.length; i++){
            badetemp[i]= Integer.parseInt(args[i]);
        }

        System.out.println("Maksimum " + maks(badetemp));
        System.out.println("Antal faldt " + antalfald(badetemp));

    }

    public static int maks(int[] badetemp) {

        int max = badetemp[0];
        for (int temp : badetemp) {

            if (temp > max) {
                max = temp;
            }

        }
        return max;
    }

    public static int antalfald(int[] badetemp){

        int fald = 0;

        for (int i=0; i<badetemp.length - 1  ; i++) {

            if ( badetemp[i] > badetemp[i+1] ) {
                fald++;
            }


        }


        return fald;
    }



    }

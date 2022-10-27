import java.util.Random;

public class D6 {

    public static int die(){
        Random r = new Random();
        int roll = r.nextInt(6);
        roll++;
        return roll;


    }


}

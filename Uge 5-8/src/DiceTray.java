public class DiceTray {

    public static int roll(){
        int a = D6.die();
        int b = D6.die();
        int sum = a + b ;
        System.out.println(sum);

        return sum;


    }


}

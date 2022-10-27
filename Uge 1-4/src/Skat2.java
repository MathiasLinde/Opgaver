import java.security.PrivateKey;
import java.sql.SQLOutput;

public class Skat2 {
    public static void main(String[] args){
    int indkomst = 120000;
    double ambi, pension, bundskat;
    int personfradrag = 33400;
    ambi = indkomst * 8.0/100.0;
    pension = indkomst * 1.0/100.0;
    bundskat = (indkomst-(ambi+pension+personfradrag));

    System.out.print("Arbejdesmarkedsbidrag: ");
    System.out.println(ambi);
        System.out.print("Særlig pensionsopsparing: ");
        System.out.println(pension);
        System.out.println("Bundskat: ");
        System.out.println(bundskat);



    }

}

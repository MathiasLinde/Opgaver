public class Saldo {



    public static void main(String[] args) {
         int saldopstart = 0;
         int saldo1=1000;
         int saldo2=1000;
         int i;
         String name1 = Input.namescan();
        System.out.println(name1);

        String name2 = Input.namescan();
        System.out.println(name2);


        while (saldo1<5000&&saldo2<5000){
            int roll1 = DiceTray.roll();

            if(roll1==2){
               int turp1 = saldo1 - 80;

            }
            if(roll1==3){
                int turp1 = saldo1 + 10;

            }
            if(roll1==4){
                int turp1 = saldo1 - 150;

            }
            if(roll1==5){
                int turp1 = saldo1 + 100;

            }
            if(roll1==6){
                int turp1 = saldo1 - 850;

            }
        }



    }


}

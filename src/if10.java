import java.util.Scanner;
public class if10 {
    public static void main(String[] args){
        Scanner klawisz = new Scanner(System.in);
        int lk;
        int lt;
        System.out.println("Podaj liczbę kalorii: ");
        lk = klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj ilośc tluszczu: ");
        lt = klawisz.nextInt();
        klawisz.nextLine();
         double kalorieztłuszczu=lt*9;
         double pkt=(kalorieztłuszczu/lk)*100;

         if(pkt<=0.3){
             System.out.println("twój posiłek ma " + lk+ " kalorii Z czego " + lt + " g to tłuszcze czyli " + pkt + " Twojego Posiłku to tłuszcze co oznacza że jest nisko tłuszczowy");
         }else{
             System.out.println("twój posiłek ma " + lk+ " kalorii Z czego " + lt + " g to tłuszcze czyli " + pkt + " Twojego Posiłku to tłuszcze co oznacza że jest wysoko tłuszczowy");
         }


    }
}

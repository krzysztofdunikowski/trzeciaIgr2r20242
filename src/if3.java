import java.util.Scanner;
public class if3 {
    public static void main(String[] args){

        Scanner klawisz= new Scanner(System.in);

        double waga;
        double wzrost;

        System.out.println("Podaj swoją wagę: ");
        waga= klawisz.nextDouble();

        System.out.println("Podaj swoją wzrost: ");
        wzrost= klawisz.nextDouble();

        double bmi;
        bmi=waga/(wzrost*2);

        if(bmi>=18.5 && bmi<=25) {
        System.out.println("Twoja waga jest optymalna");

        }
            if(bmi>=25){
                System.out.println("Twoja waga jest za duża");

            }
                if(bmi<=18.5){
                    System.out.println("Twoja waga jest za mała");


                }
    }
}

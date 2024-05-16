import java.util.Scanner;
public class if9 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        double waga;
        double odleglosc;
        double cena = 0;
        System.out.println("Podaj wagę przesyłki: ");
        waga = klawisz.nextDouble();

        System.out.println("Podaj odległość przesyłki: ");
        odleglosc = klawisz.nextDouble();

        if (waga<=1){
            cena = 1.10;
        }  if (waga>1 && waga<=3) {
            cena = 2.20;
        }  if (waga>3 && waga<=5) {
            cena = 3.70;
        }  if(waga>5) {
            cena = 3.80;
        }
        if (odleglosc>500){
            double cena2 = cena*2;
            System.out.println("Cena przesyłki wynosi: " + cena2 + " Zł");
        } else {
            System.out.println("Cena przesyłki wynosi: " + cena + " Zł");
        }
    }
}

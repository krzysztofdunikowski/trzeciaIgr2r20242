import java.util.Scanner;
public class if8 {
    public static void main(String[] args) {
        Scanner przycisk = new Scanner(System.in);
        int pakiety;
        int cena;
        cena = 99;

        System.out.println("Podaj liczbę zakupionych pakiektów");
        pakiety = przycisk.nextInt();
        przycisk.nextLine();

        double r20;
        double r30;
        double r40;
        double r50;

        r20 = 0.2;
        r30 = 0.3;
        r40 = 0.4;
        r50 = 0.5;


        if (pakiety >= 100) {
            System.out.println("Rabat wynosi 50%");
            double iloscRabatu50 = cena * r50;
            double cenaPoRabacie50 = cena - iloscRabatu50;
            double lacznakwota50=pakiety*cenaPoRabacie50;
            System.out.println("Cena po rabacie za sztukę wynosi: " + cenaPoRabacie50 + " zł Natomiast cena za cały pakiet wynosi: " + lacznakwota50 + " Zł");
        }
        if (pakiety >= 50 && pakiety<=99) {
            System.out.println("Rabat wynosi 40%");
            double iloscRabatu40 = cena * r40;
            double cenaPoRabacie40 = cena - iloscRabatu40;
            double lacznakwota40=pakiety*cenaPoRabacie40;
            System.out.println("Cena po rabacie za sztukę wynosi: " + cenaPoRabacie40 + " zł Natomiast cena za cały pakiet wynosi: " + lacznakwota40 + " Zł");
        }
        if (pakiety >= 20 && pakiety<=49) {
            System.out.println("Rabat wynosi 30%");
            double iloscRabatu30 = cena * r30;
            double cenaPoRabacie30 = cena - iloscRabatu30;
            double lacznakwota30=pakiety*cenaPoRabacie30;
            System.out.println("Cena po rabacie za sztukę wynosi: " + cenaPoRabacie30 + " zł Natomiast cena za cały pakiet wynosi: " + lacznakwota30 + " Zł");
        }
        if (pakiety >= 10 && pakiety<=19) {
            System.out.println("Rabat wynosi 20%");
            double iloscRabatu20 = cena * r20;
            double cenaPoRabacie20 = cena - iloscRabatu20;
            double lacznakwota20=pakiety*cenaPoRabacie20;
            System.out.println("Cena po rabacie za sztukę wynosi: " + cenaPoRabacie20 + " zł Natomiast cena za cały pakiet wynosi: " + lacznakwota20 + " Zł");
        }
    }
}
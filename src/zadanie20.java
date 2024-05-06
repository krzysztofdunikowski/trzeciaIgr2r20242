import java.util.Scanner;

public class zadanie20 {
    public static void main(String[] args) {

        double ciasteczka = 48;
        double szklankicukru= 1.5;
        double szklankamasła= 1;
        double szklankimaki= 2.75;

        Scanner amount= new  Scanner(System.in);

        System.out.println("Podaj ilość ciastek: ");
        int ilosc = amount.nextInt();

        double przepis = ilosc/ciasteczka;
        double nowyprzepiscukier = przepis * szklankicukru;
        double nowyprzepismasło = przepis * szklankamasła;
        double nowyprzepismąka = przepis * szklankimaki;

        System.out.println("Żeby upiec " + ilosc + "Ciastek potrzeba ");
        System.out.println( + nowyprzepiscukier + " szklanki cukru");
        System.out.println( + nowyprzepismasło + " szklanki masła");
        System.out.println( + nowyprzepismąka + " szklanki mąki");

    }
}

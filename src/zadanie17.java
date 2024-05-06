import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args ) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj cene posiłku:  ");
       double cp= klawisz.nextDouble();
        klawisz.nextLine();

        double podatek = 0.0675;
        double napiwek = 0.2;

        double iloscnapiwku = 0.2*cp;
        double iloscpodatku = 0.0675*cp;
        double cenazamowienia= cp + iloscnapiwku + iloscpodatku;

        System.out.println("Cena posiłku wynosi: " + cp );
        System.out.println("Kwota napiwku to: " + iloscnapiwku );
        System.out.println("kwota podatku to: " + iloscpodatku);
        System.out.println("Całkwowita kwota zamówienia to: " + cenazamowienia);









    }
}

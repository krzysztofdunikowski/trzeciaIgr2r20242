import java.util.Scanner;

public class zadanie21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj początkowe pieniądze: ");
        double kasa= input.nextDouble();

        System.out.println("Podaj roczna stope oprocentowania: ");
        double stopa= input.nextDouble();

        System.out.println("Ile razy w ciągu roku odsetki są doliczne do kapitału");
        double doliczane = input.nextDouble();

        System.out.println("Podaj przez ile lat środki będą znajdować się na końcie:");
        double lata = input.nextDouble();

            Double a= kasa * Math.pow((1 + stopa/doliczane), doliczane * lata);

        System.out.println("Zdobędziesz: " + a + " Zł");

    }
}

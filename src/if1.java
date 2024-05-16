import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj Liczbę od 1 do 10:  ");
        double liczba = klawisz.nextDouble();

        if (liczba >= 1 && liczba < 10) {

            System.out.println("Podana liczba mieści się w przedziale");
        } else {
    System.out.println("Błąd 404");
        }
    }
}
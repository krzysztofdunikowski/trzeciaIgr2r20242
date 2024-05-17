import java.util.Scanner;

public class petla9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char odpowiedz;

        do {
            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            double suma = liczba1 + liczba2;
            System.out.println("Suma wprowadzonych liczb wynosi: " + suma);

            System.out.print("Czy chcesz wykonać operację ponownie? (T/N): ");
            odpowiedz = scanner.next().charAt(0);
        } while (odpowiedz == 'T' || odpowiedz == 't');

        System.out.println("Koniec programu.");
    }
}

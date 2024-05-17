import java.util.Scanner;
public class petla7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Podaj jakąkolwiek liczbę: ");
            double liczba = scanner.nextInt();
            suma += liczba;
        }
        System.out.println("Suma podanych liczb wynosi: " + suma);
    }
}

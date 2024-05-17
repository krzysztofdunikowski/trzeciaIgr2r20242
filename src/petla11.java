import java.util.Scanner;

public class petla11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Podaj liczbę: ");
            int liczba = scanner.nextInt();
            suma += liczba;
        }

        System.out.println("Suma wprowadzonych liczb wynosi: " + suma);
    }
}

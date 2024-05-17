import java.util.Scanner;
public class petla8 {
    public static void main(String[] args) {
        int product = 0;
        Scanner scanner = new Scanner(System.in);


        while (product < 100) {
            System.out.print("Podaj liczbę: ");
            int liczba = scanner.nextInt();
            product = liczba * 10;
        }

        System.out.println("Wartość zmiennej  przekroczyła 100");
    }
}


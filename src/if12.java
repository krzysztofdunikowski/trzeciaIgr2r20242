import java.util.Scanner;


public class if12 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String nazwa;
        System.out.println("Podaj nośnik dźwiękowy: ");
        nazwa = klawisz.nextLine();
        int metry;
        System.out.println("Podaj odległość przebytą w metrach: ");
        metry = klawisz.nextInt();
        klawisz.nextLine();
        double czas = 0;
        double czasPowietrze = 343;
        double czasWoda = 1490;
        double czasStal = 5100;
        if (nazwa.compareToIgnoreCase("powietrze") == 0) {
            czas = (double) metry / czasPowietrze;
            System.out.println("Czas potrzebny na przebycie tej odległości w powietrzu wynosi: " + czas + " sekund");
        }


    }
}
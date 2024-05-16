
import java.util.Scanner;
public class if11 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);

        String imie1;
        System.out.println("Podaj pierwsze nazwisko: ");
        imie1 = klawisz.nextLine();
        double czas1;
        System.out.println("Podaj jego czas w sekundach: ");
        czas1 = klawisz.nextDouble();
        klawisz.nextLine();

        String imie2;
        System.out.println("Podaj drugie nazwisko: ");
        imie2 = klawisz.nextLine();
        double czas2;
        System.out.println("Podaj jego czas w sekundach: ");
        czas2 = klawisz.nextDouble();
        klawisz.nextLine();

        String imie3;
        System.out.println("Podaj trzecie nazwisko: ");
        imie3 = klawisz.nextLine();
        double czas3;
        System.out.println("Podaj jego czas w sekundach: ");
        czas3 = klawisz.nextDouble();
        klawisz.nextLine();

        if (czas1 < czas2 && czas1 < czas3 && czas2 < czas3) {
            System.out.println(imie1 + "\n" + imie2 + "\n" + imie3);
        } else if (czas1 < czas2 && czas1 < czas3 && czas2 > czas3) {
            System.out.println(imie1 + "\n" + imie3 + "\n" + imie2);
        } else if (czas1 < czas2 && czas1 > czas3 && czas2 > czas3) {
            System.out.println(imie3 + "\n" + imie1 + "\n" + imie2);
        } else if (czas1 > czas2 && czas1 < czas3 && czas2 < czas3) {
            System.out.println(imie2 + "\n" + imie1 + "\n" + imie3);
        } else if (czas1 < czas2 && czas1 > czas3 && czas2 < czas3) {
            System.out.println(imie2 + "\n" + imie3 + "\n" + imie1);
        } else {
            System.out.println(imie3 + "\n" + imie2 + "\n" + imie1);
        }

    }
}
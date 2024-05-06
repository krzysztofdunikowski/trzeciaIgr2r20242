import java.util.Scanner;

public class zadanie15 {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Wprowadź cenę produktu  ");
        double cenaproduktu = klawisz.nextDouble();
        klawisz.nextLine();

            double marza = 0.4;
            double zysk = cenaproduktu * marza;
            double cenakońcowa= cenaproduktu + zysk;

        System.out.println("Cena produktu wynosi: " + cenaproduktu + " marza wynosi: " + zysk + " a cena sprzedarzy to :" + cenakońcowa );



    }
}

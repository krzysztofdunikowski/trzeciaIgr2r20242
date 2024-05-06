import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj wartość produktu: ");
       int wartosc = klawisz.nextInt();
        klawisz.nextLine();

        double podatekstanowy = 0.04;
        double podateklokalny = 0.02;


        //WartoscPodatkuStanowego=wps
        //WartoscPodatkuLokalnego=wpl

        double wpl = wartosc * podateklokalny;
        double wps = wartosc * podatekstanowy;
        double cenasprzedarzy = wartosc + wpl + wps;

        System.out.println("Wartość podanego towaru wynosi: " + wartosc + " Natomiast cena po podatku stanowym i lokalnym wynosi: " + cenasprzedarzy );








    }
}

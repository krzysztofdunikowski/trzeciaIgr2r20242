import java.util.Scanner;

public class zadanie12 {
    public static void main(String [] args) {

        Scanner klawisz = new Scanner(System.in);

        //PrzejechaneKilometry=pk

        System.out.println("Podaj liczbę przejechanych kilometrów: ");
        double pk = klawisz.nextDouble();
        klawisz.nextLine();

        //iloscpaliwa=ip

        System.out.println("Podaj ilośc spalonego paliwa: ");
        double ip = klawisz.nextDouble();
        klawisz.nextLine();

        //Kilometrynalitrze=knl
        double knl = pk/ip;

        System.out.println("Na jednym litrze paliwa samochód przejechał " + knl + " Kilometrów" );
    }
}

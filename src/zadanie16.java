import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {

        Scanner city = new Scanner(System.in);

    System.out.println("Podaj nazwę ulubionego miasta:");
    String miasto = city.nextLine();

    int dlugosc = miasto.length();

    String male,duze;

    duze=miasto.toUpperCase();
    male=miasto.toLowerCase();

    char pierwsza = miasto.charAt(0);

    System.out.println("twoje miasto to: " + miasto + " i ma " + dlugosc +" znaków");
    System.out.println(male);
    System.out.println(duze);
    System.out.println("Pierwsza litera to: " + pierwsza);


    }
}

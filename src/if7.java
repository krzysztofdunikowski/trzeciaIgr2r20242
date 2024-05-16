import java.util.Scanner;
public class if7 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        String imie1;
        String imie2;
        String imie3;

        System.out.println("Podaj pierwsze imię: ");
        imie1 = klawisz.nextLine();

        System.out.println("Podaj drugie imię: ");
        imie2 = klawisz.nextLine();

        System.out.println("Podaj trzecie imię: ");
        imie3 = klawisz.nextLine();

        double pom1 = imie1.compareToIgnoreCase(imie2);
        double pom2 = imie1.compareToIgnoreCase(imie3);
        double pom3 = imie2.compareToIgnoreCase(imie3);
        if (pom1 < 0 && pom2 < 0 && pom3 < 0){
            System.out.println(imie1+"\n"+imie2+"\n"+imie3);
        } else if (pom1 < 0 && pom2 < 0 && pom3 > 0) {
            System.out.println(imie1+"\n"+imie3+"\n"+imie2);
        } else if (pom1 < 0 && pom2 > 0 && pom3 > 0){
            System.out.println(imie3+"\n"+imie1+"\n"+imie2);
        } else if (pom1 > 0 && pom2 < 0 && pom3 < 0){
            System.out.println(imie2+"\n"+imie1+"\n"+imie3);
        } else if (pom1 > 0 && pom2 > 0 && pom3 < 0) {
            System.out.println(imie2+"\n"+imie3+"\n"+imie1);
        } else {
            System.out.println(imie3+"\n"+imie2+"\n"+imie1);
        }

    }
}

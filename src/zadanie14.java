import java.math.BigDecimal;
import java.util.Scanner;
import java.math.RoundingMode;


public class zadanie14 {
    public static void main(String[] args) {

        Scanner kbrd = new Scanner(System.in);

        System.out.println("Podaj wyniki z testu 1: ");
        double t1 = kbrd.nextDouble();

        System.out.println("Podaj wyniki z testu 2: ");
        double t2 = kbrd.nextDouble();

        System.out.println("Podaj wyniki z testu 3: ");
        double t3 = kbrd.nextDouble();

        double st1 = (t1 +t2 +t3) /3;

        BigDecimal bd = new BigDecimal(st1).setScale(2,RoundingMode.HALF_UP);
        double st=bd.doubleValue();

        System.out.println("twoje wyniki z testów to: " + t1 + "," + t2 + "," + t3 + " a twoja średnia to: " + st1 );




    }

    }

import java.util.Scanner;
public class if4 {
    public static void main(String[] args){

        Scanner klawisz= new Scanner(System.in);

        int wynik1;
        int wynik2;
        int wynik3;
        System.out.println("Podaj swoją ocenę: ");
        wynik1= klawisz.nextInt();

        System.out.println("Podaj swoją ocenę: ");
        wynik2= klawisz.nextInt();

        System.out.println("Podaj swoją ocenę: ");
        wynik3= klawisz.nextInt();

        double sr;
        sr=(wynik1+wynik2+wynik3)/3;

        if(sr>=90){
            System.out.println("Twoja średnia to:" + sr + " I otrzymałeś ocenę BDB");
        }

        if(sr>=80 && sr<=89){
            System.out.println("Twoja średnia to:" + sr + " I otrzymałeś ocenę DB");
        }

        if(sr>=70 && sr<=79){
            System.out.println("Twoja średnia to:" + sr + " I otrzymałeś ocenę dst");
        }

        if(sr>=60 && sr<=69){
            System.out.println("Twoja średnia to:" + sr + " I otrzymałeś ocenę DOP");
        }

        if(sr<=60){
            System.out.println("Twoja średnia to:" + sr + " I otrzymałeś ocenę NDST");
        }













    }
}

import java.util.Scanner;


public class zadanie8 {
    public static void main(String[] args){
        //pomieszczenie1powierzchnia=p1p
        //pomieszczenie1długość=p1d
        //pomieszczenie1szerokość=p1s
        Scanner klawisz = new Scanner(System.in);

        int p1d;
        int p1s;
        int p1p;



        System.out.println("Podaj długośc pokoju nr1:  ");
         p1d= klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr1:  ");
        p1s= klawisz.nextInt();
        klawisz.nextLine();

        p1p=p1d*p1s;


        System.out.println("Mieszkanie1 o szerokości " + p1s + " i długości " + p1d + " Ma powierzchnię równa " + p1p );

        int p2d;
        int p2s;
        int p2p;

        System.out.println("Podaj długośc pokoju nr2:  ");
        p2d= klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr24:  ");
        p2s= klawisz.nextInt();
        klawisz.nextLine();

        p2p=p2d*p2s;



        System.out.println("Mieszkanie2 o szerokości " + p2s + " i długości " + p2d + " Ma powierzchnię równa " + p2p );

        int p3d;
        int p3s;
        int p3p;

        System.out.println("Podaj długośc pokoju nr3:  ");
        p3d= klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr3:  ");
        p3s= klawisz.nextInt();
        klawisz.nextLine();

        p3p=p3d*p3s;

        System.out.println("Mieszkanie3 o szerokości " + p3s + " i długości " + p3d + " Ma powierzchnię równa " + p3p );

        int p4d;
        int p4s;
        int p4p;

        System.out.println("Podaj długośc pokoju nr4:  ");
        p4d= klawisz.nextInt();
        klawisz.nextLine();

        System.out.println("Podaj szerokość pokoju nr4:  ");
        p4s= klawisz.nextInt();
        klawisz.nextLine();


        p4d=2;
        p4s=2;
        p4p=p4d*p4s;

        System.out.println("Mieszkanie4 o szerokości " + p4s + " i długości " + p4d + " Ma powierzchnię równą " + p4p );



    }
}

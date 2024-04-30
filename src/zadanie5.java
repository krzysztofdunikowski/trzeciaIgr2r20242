public class zadanie5 {
    public static void main(String[] args){
        //pomieszczenie1powierzchnia=p1p
        //pomieszczenie1długość=p1d
        //pomieszczenie1szerokość=p1s
        int p1d;
        int p1s;
        int p1p;
         p1d = 4;
         p1s = 3;
         p1p = p1d*p1s;

         System.out.println("Mieszkanie1 o szerokości " + p1s + " i długości " + p1d + " Ma powierzchnię równa " + p1p );

        int p2d;
        int p2s;
        int p2p;

        p2d = 4;
        p2s = 3;
        p2p = p2d*p2s;

        System.out.println("Mieszkanie2 o szerokości " + p2s + " i długości " + p2d + " Ma powierzchnię równa " + p2p );

        int p3d;
        int p3s;
        int p3p;

        p3d=2;
        p3s=3;
        p3p=p3d*p3s;

        System.out.println("Mieszkanie3 o szerokości " + p3s + " i długości " + p3d + " Ma powierzchnię równa " + p3p );

        int p4d;
        int p4s;
        int p4p;

        p4d=2;
        p4s=2;
        p4p=p4d*p4s;

        System.out.println("Mieszkanie4 o szerokości " + p4s + " i długości " + p4d + " Ma powierzchnię równą " + p4p );




   int osoby;
   int p1pos;
   osoby=4;
   p1p=12;
   p1pos=p1p/osoby;

   System.out.println("W Mieszkaniu1 o powierzchni " + p1p + " na osobę przypada " + p1pos + "m2" );

   int p2pos;
   osoby=4;
   p2p=12;
   p2pos=p2p/osoby;

   System.out.println("W Mieszkaniu2 o powierzchni " + p2p + " na osobę przypada " + p2pos + "m2" );

   double p3pos;
   osoby=4;
   p3p=6;
   p3pos=(double)p3p/osoby;

   System.out.println("W Mieszkaniu3 o powierzchni " + p3p + " na osobę przypada " + p3pos + "m2" );

   int p4pos;
   osoby=4;
   p4p=4;
   p4pos=p4p/osoby;

   System.out.println("W Mieszkaniu4 o powierzchni " + p4p + " na osobę przypada " + p4pos + "m2" );
    }
}

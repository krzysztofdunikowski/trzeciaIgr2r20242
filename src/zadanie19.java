public class zadanie19 {
    public static void main(String[] args) {

       double ankietowani = 12467;
       double napojtygodniowo = 0.14;
       double napojcytrynowy= 0.64;

       double liczbanapojetygodniowo = ankietowani * napojtygodniowo;
       double liczbanapojcytrynowy= ankietowani * napojcytrynowy;

       System.out.printf("W przybliżeniu napoje energetyczne kupuje: %.0f " , liczbanapojetygodniowo );
       System.out.printf("W Przybliżeniu napoje cytrusowe około: %.0f" , liczbanapojcytrynowy);

    }
}

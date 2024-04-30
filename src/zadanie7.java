public class zadanie7 {
    public static void main(String[] args){
        double wartośćSprzedanychProduktów;
        double ProcentWRegionMazowiecki;
        double ZyskiWmazowieckim;

        wartośćSprzedanychProduktów=4600000;
        ProcentWRegionMazowiecki=0.62;
        ZyskiWmazowieckim=(double)wartośćSprzedanychProduktów*ProcentWRegionMazowiecki;

        System.out.print("W ciągu roku sprzedarz w regionie mazowieckim wynosiła " + ZyskiWmazowieckim + " złotych" );
    }
}

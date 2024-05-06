public class zadanie18 {
    public static void main(String[] args) {

      int liczbaakcji = 600;
      double cenaakcji = 21.77;
      double prowizja = 0.02;

      double cenazaakacje = liczbaakcji * cenaakcji;
      double wysokoscprowizji= cenazaakacje * prowizja;
      double lacznakwota= cenazaakacje + wysokoscprowizji;

        System.out.println("Akcje kosztowały: " + cenazaakacje + " zł,wysokość prowizji to:" + wysokoscprowizji + " Zł a cała zapłacona kwota to:" + lacznakwota);



   }
}
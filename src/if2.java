import java.util.Scanner;
public class if2 {
    public static void main(String[] args){

        Scanner klawisz = new Scanner(System.in);
        int liczba;
        int liczba2;
        int liczba3;
        System.out.println("Podaj dzień:  ");
         liczba = klawisz.nextInt();

        System.out.println("Podaj miesiąc:  ");
        liczba2 = klawisz.nextInt();

        System.out.println("Podaj dwie ostatnie cyfry roku:  ");
         liczba3 = klawisz.nextInt();

        int magiczna;
        magiczna=liczba*liczba2;

        if (magiczna==liczba3){
            System.out.println("Liczba jest magiczna");

        }else{
            System.out.println("Liczba nie jest magiczna");
        }













    }
}

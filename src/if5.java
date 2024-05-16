import java.util.Scanner;
public class if5 {
    public static void main(String[] args) {

        Scanner klawisz = new Scanner(System.in);
        double masakg;

        masakg = klawisz.nextDouble();
        klawisz.nextLine();

        double ciezar = masakg*9.8;


        if (ciezar >= 1000) {
            System.out.println("Obiekt waży: " + ciezar +  " N i jest zbyt ciężki");
        } else if (ciezar <= 10) {
            System.out.println("Obiekt waży; " + ciezar + " N i jest zbyt lekki");
        }

    }

}
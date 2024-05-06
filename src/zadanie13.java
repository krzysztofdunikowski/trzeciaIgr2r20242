import java.util.Scanner;

public class zadanie13 {
    public static void main(String [] args) {

        //jedno ciastko ma 30kcal
        //iloscciastek=ic

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj ilość zjedzonych ciastek:  ");
        int ic= klawisz.nextInt();
        klawisz.nextLine();

        //skonsumowaneciastka=sc
        int sc= ic * 30;

        System.out.println("Zjadłeś " + ic + " ciastek" +  " czyli " + sc + " kalorii");
    }
}

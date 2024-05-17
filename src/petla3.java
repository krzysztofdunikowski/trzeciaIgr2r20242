import java.util.Scanner;
public class petla3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj słowo Tak albo Nie");
            String num =scanner.nextLine();

            while(!num.equalsIgnoreCase("Tak") && !num.equalsIgnoreCase("Nie")){
                System.out.println("Czytanie sprawia ci trudność");

                num = scanner.nextLine();
            }
        System.out.println("Wszystko jest ok");
    }
}

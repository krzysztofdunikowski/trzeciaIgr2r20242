import java.util.Scanner;
public class petla2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Literę N albo T");
    String num = scanner.nextLine();
    while(!num.equalsIgnoreCase("T") && !num.equalsIgnoreCase("N")){
        System.out.println("Czytanie sprawia ci trudność");
        num = scanner.nextLine();
    }
    }
}

import java.util.Scanner;


public class zadanie10 {
    public static void main(String[] args){

        Scanner kbrd = new Scanner(System.in);

        System.out.println("Podaj swoje pierwsze imie:  ");
        String firstname = kbrd.nextLine();

        System.out.println("Podaj swoje drugie imie:  ");
        String middlename = kbrd.nextLine();

        System.out.println("Podaj swoje nazwisko:  ");
        String lastname = kbrd.nextLine();

        char fi = firstname.charAt(0);
        char mi = middlename.charAt(0);
        char li = lastname.charAt(0);

        System.out.println("Twoje pełne imię to: " + firstname +" " + middlename + " " + lastname + " a twoje inicjały to: " + fi + "," + mi + "," + li + "," );
    }
}

public class petla12 {
    public static void main(String[] args) {
        double suma = 0.0;

        for (int i = 1; i <= 30; i++) {
            double element = (double) i / (31 - i);
            suma += element;
        }

        System.out.println("Suma ciągu wynosi: " + suma);
    }
}
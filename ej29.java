import java.util.Scanner;

public class ej29 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double millas, km;
        do {
            System.out.println("Ingrese una cantidad de millas");
            millas = leer.nextDouble();

            km = millas * 1.6093;
            System.out.println("las " + millas + " millas, equivalen a " + km + "km");
        } while (millas != 0);
    }
}

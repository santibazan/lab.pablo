import java.util.Scanner;
public class ej27 {
    public static void main(String[] args) {
        int a, b;
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca el numero a: ");
        a = leer.nextInt();

        System.out.print("Introduzca el numero b: ");
        b = leer.nextInt();

        while (a > b) {
            System.out.println("a es mayor que b. Ingrese nuevamente el numero a: ");
            a = leer.nextInt();

            System.out.print("Introduzca nuevamente el numero b: ");
            b = leer.nextInt();
        }

        while (a < b) {
            a++;
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}

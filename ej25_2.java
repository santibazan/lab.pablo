import java.util.Scanner;
public class ej25_2 {
    public static void main(String[] args) {
        int N, num;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        N = leer.nextInt();

        num = 0;
        while (N>num) {
            System.out.println(N);
            N--;
        }
    }
}

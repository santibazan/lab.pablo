import java.util.Scanner;
public class ej24_2 {
    public static void main(String[] args) {
        int N, num;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        N = leer.nextInt();

        num = 0;
        while (num<N) {
            num++;
            System.out.println(num);
        }
    }
}

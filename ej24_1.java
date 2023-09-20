import java.util.Scanner;
public class ej24_1 {
    public static void main(String[] args) {
        int N;
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        N=leer.nextInt();

        for(int i=1; i<=N; i++){
            System.out.println(i);
        }
    }
}

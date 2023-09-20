import java.util.Scanner;
public class ej25_1 {
    public static void main(String[] args) {
        int N;
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        N=leer.nextInt();

        for(int i=N; i>=1; i--){
            System.out.println(i);
        }
    }
}

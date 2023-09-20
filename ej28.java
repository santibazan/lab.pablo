import java.util.Scanner;

public class ej28 {
    public static void main(String[] args) {
        int N, M;
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca el numero N: ");
        N = leer.nextInt();
        while(N<0){
            System.out.println("Ingrese nuevamente el numero N: ");
            N = leer.nextInt();
        }

        System.out.print("Introduzca el numero M: ");
        M = leer.nextInt();
        while(M<0 || M<N){
            System.out.print("Introduzca nuevamente el numero M: ");
            M = leer.nextInt();
        }

        for(int i=1; i<=M; i++){
            if( i % N == 0){
                System.out.println(i);
            }
        }
    }
}

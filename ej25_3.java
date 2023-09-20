import java.util.Scanner;
public class ej25_3 {
    public static void main(String[] args) {
        int N ,num;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        N= leer.nextInt();
        num=0;
        do{
            System.out.println(N);
            N--;
        }while(num<N);
    }
}

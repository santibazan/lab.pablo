import java.util.Scanner;
public class ej24_3 {
    public static void main(String[] args) {
        int N ,num;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        N= leer.nextInt();
        num=0;
        do{
            num++;
            System.out.println(num);
        }while(num<N);
    }
}

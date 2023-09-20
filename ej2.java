import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num=leer.nextInt();

        System.out.println(num + (num%10==0 ? " es multiplo de 10 ": " no es multiplo de 10 "));

    }
}

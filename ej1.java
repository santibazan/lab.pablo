import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num=leer.nextInt();

        System.out.println(num + (num%2==0 ? " es par ": " es impar "));

    }
}

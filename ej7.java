import java.util.Scanner;
public class ej7 {
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num = leer.nextInt();


        if (num%3==0 & num%5==0) {
            System.out.println(num + " es multiplo de 3 y de 5");
        }
        else{
            System.out.println(num + " no es multiplo de 3 y de 5");
        }
    }
}

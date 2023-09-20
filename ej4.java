import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca el primer numero: ");
        num1 = leer.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = leer.nextInt();

        if (num1==num2) {
            System.out.println("Los numeros son iguales");
        }
        else{
            System.out.println("Los numeros no son iguales");
        }
    }
}

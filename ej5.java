import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca el primer numero: ");
        num1 = leer.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = leer.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " es el numero mayor");
        }
        else if (num1<num2){
            System.out.println(num2 + " es el numero mayor");
        }
        else{
            System.out.println("los numeros son iguales");
        }
    }
}

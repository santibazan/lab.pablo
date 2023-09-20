import java.util.Scanner;
public class ej12 {
    public static void main(String[] args) {
        float num1, num2;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca el primer numero: ");
        num1 = leer.nextInt();

        System.out.print("Introduzca el primer numero: ");
        num2 = leer.nextInt();

        double div;
        div=num1/num2;

        if(num2==0){
            System.out.println("No se puede dividir un numero por 0");
        }
        else{
            System.out.print("El resultado de la division entre "+ num1 + " y "+num2+ " es "+ div);
        }
    }
}

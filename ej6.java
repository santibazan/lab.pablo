import java.util.Scanner;
public class ej6 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca el primer numero: ");
        num1 = leer.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = leer.nextInt();

        if (num1%10>num2%10) {
            System.out.println(num1 + ". La ultima cifra es mayor que la del segundo numero");
        }
        else if (num1%10<num2%10){
            System.out.println(num2 + ". La ultima cifra es mayor que la del primer numero");
        }
        else{
            System.out.println("las ultimas cifras son iguales");
        }
    }
}

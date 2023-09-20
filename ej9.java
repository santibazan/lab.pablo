import java.util.Scanner;
public class ej9 {
    public static void main(String[] args) {
        char letra1, letra2;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca el primer caracter: ");
        letra1 = leer.next().charAt(0);

        System.out.print("Introduzca el segundo caracter: ");
        letra2 = leer.next().charAt(0);

        if(letra1==letra2) {
            System.out.println("Son iguales");
        }
        else{
            System.out.print("No son iguales");
        }
    }
}

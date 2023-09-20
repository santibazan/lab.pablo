import java.util.Scanner;
public class ej10 {
    public static void main(String[] args) {
        char letra1, letra2;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca el primer caracter: ");
        letra1 = leer.next().charAt(0);

        System.out.print("Introduzca el segundo caracter: ");
        letra2 = leer.next().charAt(0);

        if(Character.isLowerCase(letra1 & letra2)){
            System.out.println("Las dos letras son minusculas");
        }
        else{
            System.out.print("No son minusculas");
        }
    }
}

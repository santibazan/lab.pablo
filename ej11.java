import java.util.Scanner;
public class ej11 {
    public static void main(String[] args) {
        char letra;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un caracter: ");
        letra = leer.next().charAt(0);

        if(Character.isDigit(letra)){
            System.out.println("Es un numero");
        }
        else{
            System.out.print("No es un numero");
        }
    }
}

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        char letra;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un caracter: ");
        letra = leer.next().charAt(0);
        if(Character.isUpperCase(letra)) {
            System.out.println("Es una mayuscula");
        }
        else{
            System.out.print("Es una minuscula");
        }
    }
}

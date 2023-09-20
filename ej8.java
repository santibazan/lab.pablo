import java.util.Scanner;
public class ej8 {
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num = leer.nextInt();


        if (num%2==0 & num%3==0) {
            System.out.println("Es multiplo de 2 y 3");
        }
        else if (num%2==0) {
            System.out.println(num + " es multiplo de 2");
        }
        else if(num%3==0){
            System.out.println(num + " es multiplo de 3");
        }
        else{
            System.out.println("No es multiplo de ninguno");
        }
    }
}

import java.util.Scanner;
public class ej14 {
    public static void main(String[] args) {
        int num;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un año: ");
        num = leer.nextInt();
        if(num<0 || num>999) {
            System.out.println("No es un numero de 3 cifras");
        }
        else if(num/100 == num%10){
            System.out.println("Es capicua");
        }
        else {
            System.out.println("No es capicua");
        }
    }
}

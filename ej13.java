import java.util.Scanner;
public class ej13 {
    public static void main(String[] args) {
        int anio;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca un año: ");
        anio = leer.nextInt();

        if(anio%4==0 & anio%100!=0){
            System.out.println("Es un año biciesto");
        }
        else if (anio%400==0){
            System.out.println("Es un año biciesto");
        }
        else {
            System.out.println("No es un año biciesto");
        }
    }
}

import java.util.Scanner;
public class ej17 {
    public static void main(String[] args) {
        int nota;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca una nota: ");
        nota= leer.nextInt();

        if(0<=nota && nota<5){
            System.out.println("Insuficiente");
        }
        else if (5<=nota && nota<6){
            System.out.println("Suficiente");
        }
        else if (6<=nota && nota<7){
            System.out.println("Bien");
        }
        else if (7<=nota && nota<9){
            System.out.println("Notable");
        }
        else if (9<=nota && nota<=10){
            System.out.println("Sobresaliente");
        }
        else {
            System.out.println("Nota fuera de rango");
        }
    }
}

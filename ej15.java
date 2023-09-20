import java.util.Scanner;
public class ej15 {
    public static void main(String[] args) {
        int H, M, S;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca una hora: ");
        H = leer.nextInt();

        System.out.print("Introduzca unos minutos: ");
        M = leer.nextInt();

        System.out.print("Introduzca unos segundos: ");
        S = leer.nextInt();
        if((H<0 || H>23) || (M<0 || M>59) || (S<0 || S>59)) {
            System.out.println("Hora invalida");
        }
        else{
            System.out.println("Es una hora valida");
        }
    }
}

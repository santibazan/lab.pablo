import java.util.Scanner;
public class ej16 {
    public static void main(String[] args) {
        int mes;
        Scanner leer=new Scanner(System.in);

        System.out.print("Introduzca una mes: ");
        mes= leer.nextInt();

        if((mes==1) || (mes==3) || (mes==5) || (mes==7) || (mes==8) || (mes==10) || (mes==12)){
            System.out.println("Tiene 31 dias");
        }
        else if (mes==2){
            System.out.println("Tiene 28 dias");
        }
        else {
            System.out.println("Tiene 30 dias");
        }
    }
}

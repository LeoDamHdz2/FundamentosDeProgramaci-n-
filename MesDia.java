import java.util.Scanner;
public class MesDia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un mes por numero: ");
        int mes = sc.nextInt();
        
        switch (mes){
            case 1:
                System.out.println("El mes Enero cuenta con 31 dias");
                break;
            case 2:
                System.out.println("El mes Febrero cuenta con 28 dias");
                break;
            case 3:
                System.out.println("El mes Marzo cuenta con 31 dias");
                break;
            case 4:
                System.out.println("El mes Abril cuenta con 30 dias");
                break;
            case 5:
                System.out.println("El mes Mayo cuenta con 31 dias");
                break;
            case 6:
                System.out.println("El mes Junio cuenta con 30 dias");
                break;
            case 7:
                System.out.println("El mes Julio cuenta con 31 dias");
                break;
            case 8:
                System.out.println("El mes Agosto cuenta con 31 dias");
                break;
            case 9:
                System.out.println("El mes Septiembre cuenta con 30 dias");
                break;
            case 10:
                System.out.println("El mes Octubre cuenta con 31 dias");
                break;
            case 11:
                System.out.println("El mes Noviembre cuenta con 30 dias");
                break;
            case 12:
                System.out.println("El mes Diciembre cuenta con 31 dias");
                break;
            default:
                System.out.println("Numero de mes invalido");
        }
                
    }
}
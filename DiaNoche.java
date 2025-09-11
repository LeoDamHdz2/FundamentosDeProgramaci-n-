import java.util.Scanner;

public class DiaNoche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora=0;
        do{
            System.out.print("Introduce la hora (0-23): ");
            hora = sc.nextInt();
    
            if (hora >= 6 && hora <= 12){
                System.out.println("Buenos días");
            }else if (hora >= 13 && hora <= 20){
                System.out.println("Buenas tardes");
            }else if (hora >= 21 && hora <= 23 || hora >= 0 && hora <= 5){
                System.out.println("Buenas noches");
            }else{
               System.out.println ("Ingresa una hora valida");
            }
        }while(hora>23 || hora<0);
}
}
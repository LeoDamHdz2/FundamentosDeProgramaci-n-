import java.util.Scanner;

public class DiaNoche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la hora (0-23): ");
        int hora = sc.nextInt();

        if (hora >= 6 && hora <= 12)
            System.out.println("Buenos días");
        else if (hora >= 13 && hora <= 20)
            System.out.println("Buenas tardes");
        else
            System.out.println("Buenas noches");
    }
}
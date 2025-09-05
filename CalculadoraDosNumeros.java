import java.util.Scanner;
public class CalculadoraDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int resultado = 0;
        int mostrar = 1;
        System.out.println("PROGRAMA LEER DOS NUMEROS Y LA OPERACION");
        System.out.println("Ingresa un numero:");
        int numero1 = sc.nextInt();
        System.out.println("Ingrsa otro numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Ingresa el operador (+, -, * o /): ");
        String operador = sc2.nextLine();
        
        switch (operador){
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if(numero2==0){
                    System.out.println("ERROR NO SE PUEDE DIVIDR ENTRE 0");
                    mostrar = 0;
                }else{
                    resultado = numero1 / numero2;
                }
                break;
            default:
                System.out.println("INGRESA UN OPERADOR VALIDO");
                mostrar = 0;
                break;
        }
        if (mostrar == 1){
            System.out.println("El resultado es: " + resultado);
        }
    }
}
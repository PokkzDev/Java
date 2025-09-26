import java.util.Scanner;

public class Greeter {

    String language = "Java";

    public static void main(String[] args) {
        Greeter obj = new Greeter();
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingresa tu nombre: ");
            String nombre = sc.nextLine().trim();

            System.out.print("Ingresa tu edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("Hola, " + nombre + ". Bienvenido al mundo de " + obj.language + ".");

            if (edad < 18) {
                System.out.println("Eres menor de edad.");
            } else {
                System.out.println("Eres mayor de edad.");
            }

            System.out.print("¿Deseas continuar? (s/n): ");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("n")) {
                continuar = false;
                System.out.println("¡Hasta luego!");
            }
        }

        sc.close();
    }
}

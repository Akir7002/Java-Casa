import java.util.Scanner;

public class  Parcial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Para leer la entrada del usuario
        int opcion;
        do {
            System.out.println(
                "Menú:" + System.lineSeparator() +
                "[1]Iniciar juego" + System.lineSeparator() +
                "[2]Volver a jugar" + System.lineSeparator() +
                "[3]Salir del juego" + System.lineSeparator() +
                "Seleccione una opción:"
            );
            opcion = scanner.nextInt(); // Lee la opción del usuario

            switch (opcion) {
                case 1:
                    iniciarJuego(scanner);
                    break; // No usamos return aquí para permitir que el bucle continúe
                case 2:
                    System.out.println("Reiniciando el juego con un nuevo número...");
                    iniciarJuego(scanner); // Reinicia el juego con un nuevo número aleatorio
                    break; 
                case 3: // Salir del juego
                    System.out.println("GRACIAS POR JUGAR /.u./");
                    break; 
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break; 
            }
        } while (opcion != 3);

        scanner.close(); // Cierra el scanner al finalizar
    }

    public static void iniciarJuego(Scanner scanner) {
        int numero;
        int aleatorio = (int) (Math.random() * 100) + 1; // Genera un número aleatorio entre 1 y 100 y multiplica por 100 para que no den decimales 
        int contador = 0;
        int intentosMaximos = 10;
        boolean adivinado = false;

        while (contador < intentosMaximos && !adivinado) {
            System.out.print("Ingrese un número entre 1 y 100: ");
            numero = scanner.nextInt(); // Lee el número ingresado por el usuario

            if (numero == aleatorio) {
                System.out.println("Felicidades, has adivinado el número en " + (contador + 1) + " intentos.:)");
                adivinado = true;
            } else if (numero < aleatorio) {
                System.out.println("El número es mayor." + System.lineSeparator() + "Intentos restantes: " + (intentosMaximos - contador - 1) + System.lineSeparator());
            } else {
                System.out.println("El número es menor." + System.lineSeparator() + "Intentos restantes: " + (intentosMaximos - contador - 1) + System.lineSeparator());
            }
            contador++;
        }

        if (!adivinado) {
            System.out.println(":'C Game Over, El número correcto era: " + aleatorio);
        }
    }
}
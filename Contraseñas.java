import java.security.SecureRandom; // Para generar números aleatorios seguros

public class Contraseñas {
    // Atributos de la clase Contraseña
    private int longitud;
    private String contrasena;

    /**
     * Constructor de la clase Contraseña.
     * Recibe la longitud deseada y genera una contraseña aleatoria con esa longitud.
     * La longitud por defecto si no se especifica es 8.
     *
     * @param longitud La longitud deseada para la contraseña.
     */
    public Contraseñas(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarContrasena(longitud); // Genera la contraseña al inicializar
    }

    /**
     * Constructor por defecto de la clase Contraseña.
     * Inicializa la longitud por defecto en 8 y genera una contraseña aleatoria.
     */
    public Contraseñas() {
        this(8); // Llama al constructor que recibe la longitud con el valor por defecto
    }

    /**
     * Genera una contraseña aleatoria con la longitud especificada.
     * La contraseña contendrá letras mayúsculas, minúsculas y números.
     *
     * @param longitud La longitud de la contraseña a generar.
     * @return La contraseña aleatoria generada.
     */
    private String generarContrasena(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom(); // Generador de números aleatorios seguros
        StringBuilder sb = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(indiceAleatorio));
        }
        return sb.toString();
    }

    /**
     * Verifica si la contraseña actual es fuerte.
     * Una contraseña se considera fuerte si tiene al menos una mayúscula,
     * una minúscula y más de cinco números.
     *
     * @return true si la contraseña es fuerte, false en caso contrario.
     */
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (char caracter : contrasena.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }
        return mayusculas >= 1 && minusculas >= 1 && numeros > 5;
    }

    /**
     * Cambia la contraseña actual por la nueva contraseña indicada.
     *
     * @param nuevaContrasena La nueva contraseña a establecer.
     */
    public void cambiarContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
     // Actualiza la longitud al cambiar la contraseña
    }

    /**
     * Retorna una cadena de texto con toda la información del objeto Contrasena.
     * Por seguridad, solo se muestra la longitud y si es fuerte, no la contraseña en sí.
     *
     * @return Una representación en String de la contraseña.
     */
    @Override
    public String toString() {
        return "Longitud de la contraseña: " + longitud +
            ", ¿Es fuerte?: " + (esFuerte() ? "Sí" : "No");
    }

    /**
     * Retorna la contraseña actual.
     * En un escenario real, se debe tener cuidado al exponer la contraseña directamente.
     *
     * @return La contraseña actual.
     */
    public String getContrasena() {
        // En un escenario real, se debe tener cuidado al exponer la contraseña directamente.
        // Para este ejercicio, la mostramos para verificar el funcionamiento.
        return contrasena;
    }

    public static void main(String[] args) {
        // Crear una instancia de Contraseñas con longitud 12
        Contraseñas miContrasena = new Contraseñas(8);
        System.out.println(miContrasena); // Muestra la longitud y si es fuerte
        System.out.println("Contraseña generada: " + miContrasena.getContrasena()); // Muestra la contraseña generada

        // Cambiar la contraseña a una nueva
        miContrasena.cambiarContrasena("NuevaCont3");
        System.out.println(miContrasena); // Muestra la nueva longitud y si es fuerte

    }
}
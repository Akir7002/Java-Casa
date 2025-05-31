public class Personas {
    // Atributos de la clase Persona
    private final String nombre;
    private final int edad;
    private final char genero; // 'H' para hombre, 'M' para mujer
    private final double peso;
    private final double altura;

    public Personas(String nombre, int edad, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * Constructor de la clase Persona.
     * Recibe todos los parámetros para inicializar los atributos.
     *
     * @param nombre El nombre de la persona.
     * @param edad La edad de la persona.
     * @param genero El género de la persona ('H' para hombre, 'M' para mujer).
     * @param peso El peso de la persona en kilogramos.
     * @param altura La altura de la persona en metros.
     */
  
    public Personas(double altura, int edad, char genero, String nombre, double peso) {
        this.altura = altura;
        this.edad = edad;
        this.genero = genero;
        this.nombre = nombre;
        this.peso = peso;
    }

    /**
     * Calcula y retorna el Índice de Masa Corporal (IMC) del objeto.
     * La fórmula del IMC es peso / (altura * altura).
     *
     * @return El valor del IMC.
     */
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    /**
     * Verifica si la persona es mayor de edad.
     * Se considera mayor de edad si tiene 18 años o más.
     *
     * @return true si es mayor de edad, false en caso contrario.
     */
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    /**
     * Retorna una cadena de texto con toda la información del objeto Persona.
     *
     * @return Una representación en String de la persona.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
            ", Edad: " + edad +
            ", Género: " + genero +
            ", Peso: " + peso + " kg" +
            ", Altura: " + altura + " m" +
            ", IMC: " + String.format("%.2f", calcularIMC()) + // Formatear IMC a 2 decimales
            ", ¿Es mayor de edad?: " + (esMayorDeEdad() ? "Sí" : "No");
}

    // Métodos getters (opcionales pero buena práctica para acceder a los atributos)
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
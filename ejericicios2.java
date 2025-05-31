import java.util.Scanner;

public class ejericicios2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float pi = 3.1416f;  // Valor de pi
     
        System.out.println("/-----------------/");

        // Pedir datos del rectángulo
        System.out.println("Ingrese la altura (a) del rectángulo:");
        float alturaRectangulo = entrada.nextFloat();
        System.out.println("Ingrese el ancho (b) del rectángulo:");
        float anchoRectangulo = entrada.nextFloat();

        System.out.println("/-----------------/");
        
        // Pedir datos de los círculos
        System.out.println("Ingrese el radio (r) de los círculos:");
        float radioCirculo = entrada.nextFloat();

        // Calcular el área del rectángulo
        float areaRectangulo = alturaRectangulo * anchoRectangulo;
        System.out.println("/-----------------/");
        System.out.println("El área del rectángulo es: " + areaRectangulo + " unidades cuadradas");

        // Calcular el área de un círculo
        float areaUnCirculo = pi * radioCirculo * radioCirculo;
        System.out.println("El área de un círculo es: " + areaUnCirculo + " unidades cuadradas");

        // Calcular el área total de los dos círculos
        float areaDosCirculos = 2 * areaUnCirculo;
        System.out.println("El área de los dos círculos es: " + areaDosCirculos + " unidades cuadradas");

        // Calcular el área total del sólido (rectángulo + 2 círculos)
        float areaTotal = areaRectangulo + areaDosCirculos;
        System.out.println("/-----------------/");
        System.out.println("El área total del sólido es: " + areaTotal + " unidades cuadradas");
        System.out.println("/-----------------/");

        // Pedir el ancho del sólido para calcular el volumen
        System.out.println("Ingrese el ancho del sólido (para calcular el volumen del rectángulo):");
        float anchoSolido = entrada.nextFloat();

        // Calcular el volumen del rectángulo
        float volumenRectangulo = alturaRectangulo * anchoRectangulo * anchoSolido;
        System.out.println("/-----------------/");
        System.out.println("El volumen del rectángulo es: " + volumenRectangulo + " unidades cúbicas");

        // Calcular el volumen de una esfera
        float volumenUnaEsfera = (4 / 3f) * pi * radioCirculo * radioCirculo * radioCirculo;
        System.out.println("El volumen de una esfera es: " + volumenUnaEsfera + " unidades cúbicas");

        // Calcular el volumen total de las dos esferas
        float volumenDosEsferas = 2 * volumenUnaEsfera;
        System.out.println("El volumen de las dos esferas es: " + volumenDosEsferas + " unidades cúbicas");

        // Calcular el volumen total del sólido (rectángulo + 2 esferas)
        float volumenTotal = volumenRectangulo + volumenDosEsferas;
        System.out.println("/-----------------/");
        System.out.println("El volumen total del sólido es: " + volumenTotal + " unidades cúbicas");
        System.out.println("/-----------------/");

        entrada.close(); 
    }
}
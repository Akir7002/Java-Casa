import java.util.Scanner;
    public class ejercicios1 {

       //Declaracion  
    public static void main(String[] args) {

        float radioEsfera;
        float volumenEsfera;
        float pi = 3.1416f;

        float radioCono;
        float alturaCono;
        float volumenCono;

        try (Scanner entrada = new Scanner(System.in)) 
        {
            System.out.println("ingrese el radio de la esfera");
            radioEsfera = entrada.nextFloat();

            volumenEsfera = 4 / 3f * (pi * radioEsfera * radioEsfera * radioEsfera);
            System.out.println("El volumen de la esfera es: " + volumenEsfera);


            System.out.println("ingrese el radio del cono");
            radioCono = entrada.nextFloat();
            System.out.println("ingrese la altura del cono");
            alturaCono = entrada.nextFloat();
        }

        // Para el Cono

        volumenCono = 1 / 3f * (pi * radioCono * radioCono * alturaCono);
        System.out.println("El volumen del cono es: " + volumenCono);
        System.out.println("            ");
        System.out.println("El volumen de la figura (esfera + cono) es: " + (volumenEsfera + volumenCono));
        System.out.println("            ");
        System.out.println("✨___________________✨");

        // Para el Triangulo
        float baseTriangulo;
        float alturaTriangulo;
        float areaTriangulo;

        baseTriangulo = radioCono * 2;
        alturaTriangulo = alturaCono;

        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("El area del triangulo es: " + areaTriangulo);

        //Para el Circulo
        float radioCirculo;
        float areaCirculo;

        radioCirculo = radioEsfera;
        areaCirculo = pi * radioCirculo * radioCirculo;

        System.out.println("            ");
        System.out.println("El area del circulo es: " + areaCirculo);
        System.out.println("            ");
        System.out.println("El area total de la figura (circulo + triangulo) es: " + (areaTriangulo + areaCirculo));
    }
}


// Angela Orcera Ruiz 1º DAW

/*
 * Convierte en expresiones algorítmicas con Java
 * las siguientes expresiones algebraicas.
 */

public class Ejercicio3 {

    public static void main(String[] args) {

        // Variables

        double a = 2;
        double b = 5;
        double c = 1;
        double d = 8;
        double e = 2;
        double f = 10;
        double g = 4;
        double h = 3;
        double j = 2;
        double m = 6;
        double n = 2;
        double p = 5;
        double q = 9;
        double r = 2;
        double s = 4;
        double x = 2;
        double y = 3;

        // a) 3/2 + 4/3

        double resultadoA = 3.0 / 2 + 4.0 / 3;
        System.out.println("El resultado de a) es: " + resultadoA);

        // b) 1/(x-5) - 3xy/4

        double resultadoB = 1.0 / (x - 5) - 3 * x * y / 4;
        System.out.println("El resultado de b) es: " + resultadoB);

        // c) 1/2 + 7

        double resultadoC = 1.0 / 2 + 7;
        System.out.println("El resultado de c) es: " + resultadoC);

        // d) 7 + 1/2

        double resultadoD = 7 + 1.0 / 2;
        System.out.println("El resultado de d) es: " + resultadoD);

        // e) a²/(b-c) + (d-e)/(f-gh/j)

        double resultadoE = a * a / (b - c)
                + (d - e) / (f - g * h / j);
        System.out.println("El resultado de e) es: " + resultadoE);

        // f) m/n + p

        double resultadoF = m / n + p;
        System.out.println("El resultado de f) es: " + resultadoF);

        // g) m + n/(p-q)

        double resultadoG = m + n / (p - q);
        System.out.println("El resultado de g) es: " + resultadoG);

        // h) a²/b² + c²/d²

        double resultadoH = a * a / (b * b)
                + c * c / (d * d);
        System.out.println("El resultado de h) es: " + resultadoH);

        // i) (m+n/p)/(q-r/s)

        double resultadoI = (m + n / p) / (q - r / s);
        System.out.println("El resultado de i) es: " + resultadoI);

        // j) (3a+b)/(d+5e) / (c-g/(f+g/(2h)))

        double resultadoJ = (3 * a + b) / (d + 5 * e)/ (c - g / (f + g / (2 * h)));
        System.out.println("El resultado de j) es: " + resultadoJ);

        // k) (a²+2ab+b²)/(1/x²+2)

        double resultadoK = (a * a + 2 * a * b + b * b)/ (1.0 / (x * x) + 2);
        System.out.println("El resultado de k) es: " + resultadoK);
    }
}
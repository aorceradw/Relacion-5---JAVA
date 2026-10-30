// Angela Orcera Ruiz 1º DAW

/*
 * Declarar dos variables x e y de tipo int,
 * y dos variables n y m de tipo double.
 */

public class Ejercicio4 {

    public static void main(String[] args) {

        // Declaración de variables

        int x = 10;
        int y = 3;
        double n = 12.5;
        double m = 2.5;

        // a) Valor de cada variable

        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        System.out.println("El valor de n es: " + n);
        System.out.println("El valor de m es: " + m);

        // b) Suma X + Y

        int sumaXY = x + y;
        System.out.println("La suma de X + Y es: " + sumaXY);

        // c) Diferencia X - Y

        int diferenciaXY = x - y;
        System.out.println("La diferencia de X - Y es: " + diferenciaXY);

        // d) Producto X * Y

        int productoXY = x * y;
        System.out.println("El producto de X * Y es: " + productoXY);

        // e) Cociente X / Y

        double cocienteXY = (double) x / y;
        System.out.println("El cociente de X / Y es: " + cocienteXY);

        // f) Resto X % Y

        int restoXY = x % y;
        System.out.println("El resto de X % Y es: " + restoXY);

        // g) Suma N + M

        double sumaNM = n + m;
        System.out.println("La suma de N + M es: " + sumaNM);

        // h) Diferencia N - M

        double diferenciaNM = n - m;
        System.out.println("La diferencia de N - M es: " + diferenciaNM);

        // i) Producto N * M

        double productoNM = n * m;
        System.out.println("El producto de N * M es: " + productoNM);

        // j) Cociente N / M

        double cocienteNM = n / m;
        System.out.println("El cociente de N / M es: " + cocienteNM);

        // k) Resto N % M

        double restoNM = n % m;
        System.out.println("El resto de N % M es: " + restoNM);

        // l) Suma X + N

        double sumaXN = x + n;
        System.out.println("La suma de X + N es: " + sumaXN);

        // m) Cociente Y / M

        double cocienteYM = y / m;
        System.out.println("El cociente de Y / M es: " + cocienteYM);

        // n) Resto Y % M

        double restoYM = y % m;
        System.out.println("El resto de Y % M es: " + restoYM);

        // o) Doble de cada variable

        int dobleX = x * 2;
        int dobleY = y * 2;
        double dobleN = n * 2;
        double dobleM = m * 2;

        System.out.println("El doble de x es: " + dobleX);
        System.out.println("El doble de y es: " + dobleY);
        System.out.println("El doble de n es: " + dobleN);
        System.out.println("El doble de m es: " + dobleM);

        // p) Suma de todas las variables

        double sumaTodas = x + y + n + m;
        System.out.println("La suma de todas las variables es: "
                + sumaTodas);

        // q) Producto de todas las variables

        double productoTodas = x * y * n * m;
        System.out.println("El producto de todas las variables es: "
                + productoTodas);
    }
}
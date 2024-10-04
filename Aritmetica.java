public class Aritmetica {
    // Constantes para los números
    private static final int NUM_I = 12;
    private static final int NUM_J = 10;

    public static void main(String[] args) {
        System.out.println("Actividad: Operadores Aritmeticos");
        System.out.println("Gonzalez Barrientos Geovanni Daniel");

        // Realizar operaciones aritméticas
        int suma = sumar(NUM_I, NUM_J);
        int resta = restar(NUM_I, NUM_J);
        int mult = multiplicar(NUM_I, NUM_J);
        int div = 0;
        int modulo = 0;

        try {
            div = dividir(NUM_I, NUM_J);
            modulo = calcularModulo(NUM_I, NUM_J);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }

        // Imprimir resultados
        imprimirResultados(NUM_I, NUM_J, suma, resta, mult, div, modulo);
    }

    // Métodos para operaciones aritméticas
    private static int sumar(int a, int b) {
        return a + b;
    }

    private static int restar(int a, int b) {
        return a - b;
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }

    private static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }

    private static int calcularModulo(int a, int b) throws ArithmeticException {
        return a % b;
    }

    // Método para imprimir resultados
    private static void imprimirResultados(int i, int j, int suma, int resta, int mult, int div, int modulo) {
        System.out.println("Numero I = " + i);
        System.out.println("Numero J = " + j);
        System.out.println("Suma i + j = " + suma);
        System.out.println("Resta i - j = " + resta);
        System.out.println("Multiplicacion i * j = " + mult);
        System.out.println("Division i / j = " + div);
        System.out.println("Modulo i % j = " + modulo);
    }
}

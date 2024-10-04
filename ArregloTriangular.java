import java.util.Scanner;

public class ArregloTriangular {
    // Constantes
    private static final String AUTOR = "Gonzalez Barrientos Geovanni Daniel";
    private static final String ACTIVIDAD = "Actividad 11: Arreglo Triangular para el Triángulo de Pascal";

    public static void main(String[] args) {
        System.out.println("\n***" + AUTOR + "***");
        System.out.println("***" + ACTIVIDAD + "***");

        // Se declara la variable para leer número de filas por parte del usuario
        Scanner s = new Scanner(System.in);
        int n = 0;

        // Manejo de excepciones para la entrada del usuario
        try {
            System.out.print("\n\nIngrese el número de Filas del Triángulo de Pascal: ");
            n = s.nextInt(); // Se guarda el valor ingresado en una variable
            if (n < 0) {
                throw new IllegalArgumentException("El número de filas no puede ser negativo.");
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Por favor, ingrese un número entero positivo.");
            return;
        } finally {
            s.close();
        }

        // Se llama a la función que imprime el Triángulo de Pascal
        pascal(n);
    }

    // Función para generar y mostrar el Triángulo de Pascal
    public static void pascal(int n) {
        if (n == 0) { // Si se ingresa "0" en número de filas, no se realiza nada
            return;
        }

        int rows = n; // Número de Filas
        int cols = 2 * n + 1; // Número de columnas con 2 extras

        // Se declara arreglo a utilizar para el Triángulo de Pascal
        int[][] array = new int[rows][cols];
        array[0][n] = 1; // Se asigna 1 a la primera Fila

        // Bucle para generar valores del Triángulo de Pascal
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols - 1; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j + 1];
            }
        }

        // Bucle para imprimir los Valores del Triángulo de Pascal
        imprimirTriangulo(array, rows, cols);
    }

    // Método para imprimir el Triángulo de Pascal
    private static void imprimirTriangulo(int[][] array, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols - 1; j++) {
                if (array[i][j] != 0)
                    System.out.print(array[i][j]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

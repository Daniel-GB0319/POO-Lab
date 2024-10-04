public class TiposDatos {
    // Constantes
    private static final byte BYTE_VAL = 125;
    private static final short SHORT_VAL = 520;
    private static final int INT_VAL = 1234;
    private static final long LONG_VAL = 99999L;
    private static final float FLOAT_VAL = 1.92f;
    private static final double DOUBLE_VAL = 3.9999;
    private static final char CHAR_VAL = 'd';
    private static final boolean BOOLEAN_VAL = false;

    public static void main(String[] args) {
        System.out.println("Gonzalez Barrientos Geovanni Daniel");
        System.out.println("Actividad: Tipos de Datos en Java");

        // Imprimir valores de diferentes tipos de datos
        imprimirValores();
    }

    /**
     * Método para imprimir los valores de diferentes tipos de datos.
     */
    private static void imprimirValores() {
        System.out.println(String.format("byte : %d", BYTE_VAL));
        System.out.println(String.format("short : %d", SHORT_VAL));
        System.out.println(String.format("int : %d", INT_VAL));
        System.out.println(String.format("long : %d", LONG_VAL));
        System.out.println(String.format("float : %.2f", FLOAT_VAL));
        System.out.println(String.format("double : %.4f", DOUBLE_VAL));
        System.out.println(String.format("char : %c", CHAR_VAL));
        System.out.println(String.format("boolean : %b", BOOLEAN_VAL));
    }
}

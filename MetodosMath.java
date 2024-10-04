public class MetodosMath {
        // Constantes
        private static final double NUM1 = 25.5;
        private static final double NUM2 = 15.21;
        private static final double NUM3 = 0;
    
        public static void main(String[] args) {
            System.out.println("Gonzalez Barrientos Geovanni Daniel");
            System.out.println("Actividad 7: Metodos Matematicos en Java");
    
            // Imprimir resultados de algunas funciones matemáticas en Java
            imprimirResultados();
        }
    
        // Método para imprimir resultados
        private static void imprimirResultados() {
            System.out.println(String.format("Función ceil de %.2f = %.2f", NUM1, Math.ceil(NUM1))); // Devuelve 26.0
            System.out.println(String.format("Función arcos de %.2f = %.10f", NUM3, Math.acos(NUM3))); // Devuelve 1.5707963268
            System.out.println(String.format("Función asin de %.2f = %.10f", NUM3, Math.asin(NUM3))); // Devuelve 0.0000000000
            System.out.println(String.format("Función sqrt de %.2f = %.10f", NUM1, Math.sqrt(NUM1))); // Devuelve 5.0497524692
            System.out.println(String.format("Función floor de %.2f = %.2f", NUM2, Math.floor(NUM2))); // Devuelve 15.0
            System.out.println(String.format("Función pow de %.2f^%.2f = %.10e", NUM1, NUM2, Math.pow(NUM1, NUM2))); // Devuelve 2.4744355380e+21
            System.out.println(String.format("Función max de %.2f y %.2f = %.2f", NUM1, NUM2, Math.max(NUM1, NUM2))); // Devuelve 25.5
    
            // Funciones trigonométricas
            System.out.println(String.format("Función sin de %.2f = %.10f", NUM1, Math.sin(NUM1))); // Ejemplo de función seno
            System.out.println(String.format("Función cos de %.2f = %.10f", NUM1, Math.cos(NUM1))); // Ejemplo de función coseno
            System.out.println(String.format("Función tan de %.2f = %.10f", NUM1, Math.tan(NUM1))); // Ejemplo de función tangente
    
            // Generación de números aleatorios
            double randomNum = Math.random();
            System.out.println(String.format("Número aleatorio generado: %.10f", randomNum)); // Número aleatorio entre 0.0 y 1.0
        }
    }
    
public class Primos {
    // Generar números primos de 1 a max
    public static int[] generarPrimos (int max) {
        int i,j;
        if (tamanoRequerido(max)) {
            // Declaraciones
            int tamano = max + 1; // Tamaño del array
            boolean[] esPrimo = new boolean[tamano];
            // Inicializar el array
            for (i=0; i<tamano; i++) {
                esPrimo[i] = true;
            }
            // Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;
            // Criba
            for (i=2; i<Math.sqrt(tamano)+1; i++) {
                if (esPrimo[i]) {
                    // Eliminar los múltiplos de i
                    for (j = 2 * i; j < tamano; j += i) {
                        esPrimo[j] = false;
                    }
                }
            }
            // ¿Cuántos primos hay?
            int cuenta = numeroPrimos(tamano, esPrimo);
            // Rellenar el vector de números primos
            int[] primos = rellenarVector(tamano, esPrimo, cuenta);
            return primos;
        }
        else { // max < 2
            return vaciarVector();
            // Vector vacío
        }
    }

    private static boolean tamanoRequerido(int max) {
        return max >= 2;
    }

    private static int numeroPrimos(int tamano, boolean[] esPrimo) {
        int i;
        int cantidadPrimos = 0;
        for (i=0; i< tamano; i++) {
            if (esPrimo[i]) {
                cantidadPrimos++;
            }
        }
        return cantidadPrimos;
    }

    private static int[] vaciarVector() {
        return new int[0];
    }

    private static int[] rellenarVector(int dim, boolean[] esPrimo, int cuenta) {
        int j;
        int i;
        int[] primos = new int[cuenta];
        for (i=0, j=0; i< dim; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }
}
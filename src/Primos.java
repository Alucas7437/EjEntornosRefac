/**
 * Codigo para calcular numeros primeros
 * @author David Castell
 * @version 2.5
 */
public class Primos {
    /*** Este codigo ayudará a calcular la cantidad de <strong>numeros primos</strong> que hay hasta cierto numero especificado en el parametro
     * @param este parametro ayudara a calcular el tamaño que tendrá el vector del que sacaremos los primos
     * @return Este método devolverá los numeros primos
     */
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
            eliminarNumeros(esPrimo);
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

    /**
     * Este metodo elimina los numeros 0 y 1 al no ser primos
     *
     */
    private static void eliminarNumeros(boolean[] esPrimo) {
        esPrimo[0] = esPrimo[1] = false;
    }

    /**
     * Esto calcula el <strong>tamaño requerido</strong>
     */
    private static boolean tamanoRequerido(int max) {
        return max >= 2;
    }

    /**
     * Con este metodo calcularemos la cantidad de primos que habrá en el vector
     * @param Esto define el tamaño del vector
     * @param Un vector que calculará cuantos de los numeros del vector son primos
     * @return Devuelve cuantos numeros primos hay en el vector
     */
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

    /**
     * Este metodo vaciará el vector si no se cumple la condicion del tamaño
     * @return Devuelve el vector vacio
     */
    private static int[] vaciarVector() {
        return new int[0];
    }

    /**
     * Este metodo static rellenara el el vector con una cantidad de numeros segun el tamaño especificado
     * @param Este primer parametro especifica el tamaño del vector
     * @param Este nos permitirá comprobar cuales son numeros primos y cuales no
     * @param cuenta
     * @return Devuelve el vector lleno
     */
    private static int[] rellenarVector(int tamano, boolean[] esPrimo, int cuenta) {
        int j;
        int i;
        int[] primos = new int[cuenta];
        for (i=0, j=0; i< tamano; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }
}
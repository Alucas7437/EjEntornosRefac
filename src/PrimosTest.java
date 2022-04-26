import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimosTest {

    @org.junit.jupiter.api.Test
    void generarPrimos() {
        int []array=new int[]{};
        int[] resultado =Primos.generarPrimos(1);
        assertArrayEquals(array,resultado);
    }
    @Test
    void generarPrimosde2() {
        int []array=new int[]{2};
        int[] resultado =Primos.generarPrimos(2);
        assertArrayEquals(array,resultado);
    }
    @Test
    void generarPrimosde5() {
        int []array=new int[]{2,3,5};
        int[] resultado =Primos.generarPrimos(5);
        assertArrayEquals(array,resultado);
    }
    @Test
    void generarPrimosde10() {
        int []array=new int[]{2,3,5,7};
        int[] resultado =Primos.generarPrimos(10);
        assertArrayEquals(array,resultado);
    }
    @Test
    void generarPrimosde100() {
        int []array=new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] resultado =Primos.generarPrimos(100);
        assertArrayEquals(array,resultado);
    }
}
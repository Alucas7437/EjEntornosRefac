import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes;");
        int dato=teclado.nextInt();
        int vector[]=new int[dato];
        Primos primos = new Primos();
        System.out.println("\nVector inicial hasta :"+dato);
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) {
                System.out.println();
            }
            System.out.print(i+1+"\t");
        }
        vector=primos.generarPrimos(dato);
        System.out.println("\nVector de primos hasta:"+dato);
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) {
                System.out.println();
            }
            System.out.print(vector[i] + "\t");
        }
    }
}
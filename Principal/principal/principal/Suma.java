package principal;

import java.util.Scanner;
import libreria.OperacionesNumeros;

public class Suma {
    public static Scanner teclado;

	public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int x,y;
        OperacionesNumeros objeto1;
        objeto1 = new OperacionesNumeros();
        System.out.println("Introduzca dos numeros por pantalla:");
        x = teclado.nextInt();
        y = teclado.nextInt();
        System.out.println("La suma de "+x+" + "+y+" es = "+objeto1.sumaNumeros(x,y));
    }
}

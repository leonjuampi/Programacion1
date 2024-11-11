package pkg101;

import java.util.Scanner;

public class Array {

    private int[] array = new int[5];

    public void rellenarValores() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("El valor del indice es: " + i + " --> Ingrese un valor:");
            array[i] = sc.nextInt();

        }

    }

    public void mostrarValores() {

        System.out.println("El valor que tiene el indice y el valor es: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor indice: " + i + " El valor :" + array[i]);

        }

    }

}

package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

// 4 - Realice un algoritmo para obtener una matriz como el resultado de la resta de dos matrices de
// orden M x N. Represéntelo mediante diagrama de flujo y pseudocódigo.

public class ExerciseFour {
    public static void main(String[] args) {

        int quanRows;
        int quanColumns;

        int[][] matrizA;
        int[][] matrizB;
        int[][] matrizC;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de filas para la matriz: ");
        quanRows = keyboard.nextInt();

        System.out.print("Ingrese la cantidad de columnas para la matriz: ");
        quanColumns = keyboard.nextInt();

        matrizA = new int[quanRows][quanColumns];
        matrizB = new int[quanRows][quanColumns];
        matrizC = new int[quanRows][quanColumns];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Ingrese el valor para la posición %d en el arreglo %d : ", i, j);
                matrizA[i][j] = keyboard.nextInt();

            }

        }
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("Ingrese el valor para la posición %d en el arreglo %d : ", i, j);
                matrizB[i][j] = keyboard.nextInt();

            }

        }
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];

            }

        }

        System.out.println("El resultado de la resta de ambas matrices es: ");
        for (int i = 0; i < quanRows; i++) {
            System.out.print(" | ");
            for (int j = 0; j < quanColumns; j++) {
                System.out.print(matrizC[i][j]);
                System.out.print(" | ");

            }
            System.out.println(); //para el salto de línea de los palitos.
        }

    }
}

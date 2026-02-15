package co.edu.uniquindio;
public class Main {
    public static void main(String[] args) {
        int filas = 7; // altura de la pirámide
        int columnas = 13; // ancho de la matriz (para centrar la pirámide)

        char[][] matriz = new char[filas][columnas];

        // Inicializamos la matriz con espacios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = ' ';
            }
        }

        // Dibujamos la pirámide con '*'
        int centro = columnas / 2;
        for (int i = 0; i < filas; i++) {
            for (int j = centro - i; j <= centro + i; j++) {
                matriz[i][j] = '*';
            }
        }

        // Imprimimos la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}


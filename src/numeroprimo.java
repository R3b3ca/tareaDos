import java.util.Scanner;

public class numeroprimo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int numeroUsuario = 0;

        System.out.println("Bienvenido/a");
        System.out.println("Digite un número entre el rango 5 al 300");
        numeroUsuario = scanner.nextInt();

        if (numeroUsuario >= 5 && numeroUsuario < 300) {
            for (int i = 1; i <= numeroUsuario; i++) {
                if (numeroUsuario % i == 0) {
                    contador++;
                }
            }
            if (contador != 2) {
                System.out.println("No es un número primo");
            } else {
                System.out.println("Si es primo");
            }
        } else System.out.println("Digitó un numero fuera del rango");
    }
}



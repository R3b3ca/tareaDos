import java.util.Scanner;
public class numbersCousin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int user = 0;
        int i = 0;

        System.out.print("Bienvenido al sistema");

        if (user > 5 & user < 300) {

            System.out.print("Ingrese un número que esté entre el rango de 5 y 300");
            user = scanner.nextInt();

            for (i = 1; i <= user; i++) {

                if (user % user == 0) counter++;
            }

            if (counter != 2) {

                System.out.println("No es primo");
            } else {
                System.out.println("Sí es primo");
            }
        }

        else{
                System.out.println("Incorrecto");
            }

        }

    }


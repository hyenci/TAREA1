import java.io.IOException;
import java.util.Scanner;

class Metodos {

    public static void holamundo() {
        System.out.println("Mira mamá, mi primer programa en java!!!");
        System.out.println("Hola mundo!");
        pausar();
    }

    public static void sumas(Scanner scanner) {
        int a, b, z;
        System.out.print("Ingrese un numero para sumar: ");
        a = scanner.nextInt();
        System.out.print("Ingrese otro numero para sumar: ");
        b = scanner.nextInt();
        z = a + b;
        System.out.printf("El resultado de la suma es: " + z);
        pausar();
    }

    public static void imparia(Scanner scanner) {
        int a, y;
        System.out.print("Ingrese un numero para ver si es par o impar: ");
        a = scanner.nextInt();
        y = a % 2;
        if (y == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        pausar();
    }

    public static void Facto(Scanner scanner) {
        int x, y = 0;
        System.out.print("Ingrese un número para saber su factorial: ");
        x = scanner.nextInt();
        for (int i = x - 1 ; i >= 1; i--)
        {
            y = x;
            x = y * i;
        }
        System.out.println("El Factorial es: " + y);
        pausar();
    }

    public static void tablita(Scanner scanner) {
        int x, y;
        System.out.print("Ingrese un núnero para generar su tabla: ");
        x = scanner.nextInt();
        System.out.println("Ascendente");
        for (int i = 1; i <= 10; i++) {
            y = x * i;
            System.out.println("| " + x + " * " + i + " = " + y);
        }
        System.out.println();
        System.out.println("Descendente");
        for (int i = 10; i >= 1; i--) {
            y = x * i;
            System.out.println("| " + x + " * " + i + " = " + y);
        }
        pausar();
    }

    public static void MayorMenor(Scanner scanner){
        int x, y = Integer.MAX_VALUE, z = Integer.MIN_VALUE;
        System.out.print("Ingrese una serie de numeros para comparar (-1) para salir:  ");
        do{
            x = scanner.nextInt();
            if(x >= 0) {
                y = Math.min(x, y);
            }
            z = Math.max(x, z);
        }while(x >= 0);
        System.out.println("El mayor fue: " + z);
        System.out.println("El menor fue: " + y);
        pausar();
    }

    public static void pausar() {
        System.out.print("\nPresiona Enter para continuar...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu de Ejercicios");
            System.out.println("1. - Hola mundo");
            System.out.println("2. - Sumas");
            System.out.println("3. - Número Par o Impar");
            System.out.println("4. - Factorial");
            System.out.println("5. - Tabla de Multiplicar");
            System.out.println("6. - Mayor y Menor (Bonus)");
            System.out.println("0. - Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Metodos.holamundo();
                    break;
                case 2:
                    Metodos.sumas(scanner);
                    break;
                case 3:
                    Metodos.imparia(scanner);
                    break;
                case 4:
                    Metodos.Facto(scanner);
                    break;
                case 5:
                    Metodos.tablita(scanner);
                    break;
                case 6:
                    Metodos.MayorMenor(scanner);
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida, intente otra vez");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
}
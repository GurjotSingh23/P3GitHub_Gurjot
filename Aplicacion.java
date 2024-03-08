package calcu;

import java.util.Scanner;

/**
 * @author Gurjot
 */
public class Aplicacion {

    public static double operando1 = 0;
    public static double operando2 = 0;
    public static double operando3 = 0;

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        int operacion;
        while (!salir) {
           System.out.println("Introduce el primer operando");
            operando1 = entrada.nextDouble();
            System.out.println("Introduce el segundo operando");
            operando2 = entrada.nextDouble();
            mostrarMenu();
            operacion = entrada.nextInt();
            switch (operacion) {
                case 1:
                    System.out.println("La suma es: " + suma(operando1, operando2));
                    break;
                case 2:
                    System.out.println("La resta es: " + resta(operando1, operando2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + multiplicacion(operando1, operando2));
                    break;
                case 4:
                    System.out.println("La división es: " + division(operando1, operando2));
                    break;
                case 5:
                    mayor(operando1, operando2);
                    break;
                case 6:
                    menor(operando1, operando2);
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Elige una opción válida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Selecciona la operación a realizar:");
        System.out.println("1- suma");
        System.out.println("2- resta");
        System.out.println("3- multiplicación");
        System.out.println("4- división");
        System.out.println("5- mayor");
        System.out.println("6- menor");
        System.out.println("7- salir");
    }

    public static double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double division(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public static void mayor(double numero1, double numero2) {
        if (numero1 == numero2) {
            System.out.println("Los dos números son iguales");
        } else if (numero1 > numero2) {
            System.out.println("El mayor es: " + numero1);
        } else {
            System.out.println("El mayor es: " + numero2);
        }
    }

    public static void menor(double numero1, double numero2) {
        if (numero1 == numero2) {
            System.out.println("Los dos números son iguales");
        } else if (numero1 < numero2) {
            System.out.println("El menor es: " + numero1);
        } else {
            System.out.println("El menor es: " + numero2);
        }
    }
}
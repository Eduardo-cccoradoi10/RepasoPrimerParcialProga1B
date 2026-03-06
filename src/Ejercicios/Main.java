package Ejercicios;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== MENU DE EJERCICIOS =====");
            System.out.println("1. Suma divisibles entre 4");
            System.out.println("2. Factorial");
            System.out.println("3. Contar positivos/negativos/cero");
            System.out.println("4. Promedio pares");
            System.out.println("5. Suma de dígitos");
            System.out.println("6. Multiplo de 7 o 11");
            System.out.println("7. Divisible entre 3 pero no entre 2");
            System.out.println("8. Clasificación de hora");
            System.out.println("9. Número romano");
            System.out.println("10. Calculadora con switch");
            System.out.println("11. Mayor, menor y diferencia");
            System.out.println("12. Tabla de división");
            System.out.println("13. Dígitos pares");
            System.out.println("14. Número triangular");
            System.out.println("15. Promedio de negativos");
            System.out.println("16. Múltiplos de 6");
            System.out.println("17. Potencia de 2");
            System.out.println("18. Número invertido");
            System.out.println("19. Suma 1..n par o impar");
            System.out.println("20. Celsius a Fahrenheit");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 9: ejercicio9(); break;
                case 10: ejercicio10(); break;
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 13: ejercicio13(); break;
                case 14: ejercicio14(); break;
                case 15: ejercicio15(); break;
                case 16: ejercicio16(); break;
                case 17: ejercicio17(); break;
                case 18: ejercicio18(); break;
                case 19: ejercicio19(); break;
                case 20: ejercicio20(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    // ============================
    //        EJERCICIOS
    // ============================

    public static void ejercicio1() {
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++)
            if (i % 4 == 0) suma += i;
        System.out.println("Suma = " + suma);
    }

    public static void ejercicio2() {
        int n = sc.nextInt();
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        System.out.println("Factorial = " + f);
    }

    public static void ejercicio3() {
        int n = sc.nextInt();
        int pos = 0, neg = 0, cer = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else cer++;
        }
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cer);
    }

    public static void ejercicio4() {
        int n = sc.nextInt();
        int suma = 0, cont = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
            cont++;
        }
        if (cont > 0) System.out.println("Promedio = " + (suma / (double) cont));
        else System.out.println("No hay pares");
    }

    public static void ejercicio5() {
        int n = sc.nextInt();
        int suma = 0;
        while (n > 0) {
            suma += n % 10;
            n /= 10;
        }
        System.out.println("Suma de dígitos = " + suma);
    }

    public static void ejercicio6() {
        int n = sc.nextInt();
        if (n % 7 == 0 || n % 11 == 0)
            System.out.println("Es múltiplo");
        else
            System.out.println("No es múltiplo");
    }

    public static void ejercicio7() {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            if (i % 3 == 0 && i % 2 != 0)
                System.out.println(i);
    }

    public static void ejercicio8() {
        int h = sc.nextInt();
        if (h >= 0 && h < 12) System.out.println("Mañana");
        else if (h < 18) System.out.println("Tarde");
        else System.out.println("Noche");
    }

    public static void ejercicio9() {
        int n = sc.nextInt();
        switch (n) {
            case 1: System.out.println("I"); break;
            case 2: System.out.println("II"); break;
            case 3: System.out.println("III"); break;
            case 4: System.out.println("IV"); break;
            case 5: System.out.println("V"); break;
            default: System.out.println("Número inválido");
        }
    }

    public static void ejercicio10() {
        int op = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (op) {
            case 1: System.out.println("Suma = " + (a + b)); break;
            case 2: System.out.println("Resta = " + (a - b)); break;
            case 3: System.out.println("Multiplicación = " + (a * b)); break;
            default: System.out.println("Opción inválida");
        }
    }

    public static void ejercicio11() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Mayor: " + Math.max(a, b));
        System.out.println("Menor: " + Math.min(a, b));
        System.out.println("Diferencia: " + Math.abs(a - b));
    }

    public static void ejercicio12() {
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " / " + i + " = " + (n / (double) i));
    }

    public static void ejercicio13() {
        int n = sc.nextInt();
        int cont = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 0) cont++;
            n /= 10;
        }
        System.out.println("Dígitos pares: " + cont);
    }

    public static void ejercicio14() {
        int n = sc.nextInt();
        int suma = 0;
        boolean triangular = false;
        for (int k = 1; suma < n; k++) {
            suma += k;
            if (suma == n) triangular = true;
        }
        System.out.println(triangular ? "Es triangular" : "No es triangular");
    }

    public static void ejercicio15() {
        int n = sc.nextInt();
        int suma = 0, cont = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x < 0) {
                suma += x;
                cont++;
            }
        }
        if (cont > 0) System.out.println("Promedio negativos = " + (suma / (double) cont));
        else System.out.println("No hay negativos");
    }

    public static void ejercicio16() {
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.println(i * 6);
    }

    public static void ejercicio17() {
        int n = sc.nextInt();
        boolean es = true;
        if (n <= 0) es = false;
        else {
            while (n > 1) {
                if (n % 2 != 0) {
                    es = false;
                    break;
                }
                n /= 2;
            }
        }
        System.out.println(es ? "Es potencia de 2" : "No es potencia de 2");
    }

    public static void ejercicio18() {
        int n = sc.nextInt();
        int inv = 0;
        while (n > 0) {
            inv = inv * 10 + (n % 10);
            n /= 10;
        }
        System.out.println("Invertido = " + inv);
    }

    public static void ejercicio19() {
        int n = sc.nextInt();
        int suma = n * (n + 1) / 2;
        System.out.println(suma % 2 == 0 ? "La suma es par" : "La suma es impar");
    }

    public static void ejercicio20() {
        double c = sc.nextDouble();
        double f = c * 9.0 / 5 + 32;
        System.out.println("Fahrenheit = " + f);
    }
}

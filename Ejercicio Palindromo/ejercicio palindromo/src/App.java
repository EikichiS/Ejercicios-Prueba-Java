import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        boolean good = true;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese un número: ");
        numero = reader.nextInt();
        if (numero >= 1 && 1000000 >= numero) {
            if (es_palindromo(numero) && esPrimo(numero)) {
                System.out.printf("El número " + numero + " es palíndromo y primo");
            } else {
                contador = numero + 1;
                while (good) {
                    if (es_palindromo(contador) && esPrimo(contador)) {
                        good = false;
                    }
                    if (good) {
                        contador++;
                    }
                }
                System.out.printf("El número " + contador + " es palíndromo y primo");
            }
        } else {
            System.out.printf("El número debe ser mayor o igual a 1 y menor o igual a 1000000");
        }

    }

    private static boolean es_palindromo(int numero) {
        int numero_invertido = invierte_numero(numero);
        return numero == numero_invertido;
    }

    private static int invierte_numero(int numero) {
        int numero_invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            numero_invertido *= 10;
            numero_invertido += digito;
            numero /= 10;
        }
        return numero_invertido;
    }

    public static boolean esPrimo(int numero) {

        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {

            if (numero % x == 0)
                return false;
        }
        return true;
    }

}
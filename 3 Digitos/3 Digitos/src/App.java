import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese las veces que va a elevar el numero: ");
        double raiz = Math.sqrt(5);
        double calculolapulentaloco = (3 + raiz);
        double elevado = Math.pow(calculolapulentaloco, reader.nextDouble());
        int resultado = Double.valueOf(elevado).intValue();
        System.out.println("El resultado es"+ resultado);
    }
}

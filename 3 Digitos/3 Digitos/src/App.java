import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Ingrese las veces que va a elevar el numero: ");
        String respuesta = "";
        int largo;
        double raiz = Math.sqrt(5);
        double calculo = (3 + raiz);
        double elevado = Math.pow(calculo, reader.nextDouble());
        String digitos = String.valueOf(elevado);
        String[] arrayString = digitos.split("\\.");
        largo = arrayString[0].length() -3;
        if(largo > 0){
            for (int i = largo; i < arrayString[0].length(); i++) {
                respuesta = respuesta + arrayString[0].charAt(i);
            }
            System.out.printf("Los ultimos 3 digitos son " + respuesta);
        } else {
            respuesta = arrayString[0];
           while(largo < 0){
               respuesta = 0 + respuesta;
               largo = largo + 1;
           }
           System.out.printf("Los ultimos 3 digitos son " + respuesta);
        }
        
    }
}

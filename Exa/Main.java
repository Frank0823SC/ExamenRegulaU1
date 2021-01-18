package Exa;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        int num_elementos;
        Lista lista = new Lista();
        String dato;
        int respuesta;
        Scanner user = new Scanner(System.in);

        System.out.println("Digite el número de elementos: ");
        num_elementos=user.nextInt();
        lista.crearArreglo(num_elementos);

        for (int i = 0; i < num_elementos ; i++) {
            System.out.println("Digite el dato "+(i+1)+" :");
            dato=user.next();
            lista.llenarLista(dato);
        }
        Lista.mostrarLista();
        
        do {
            System.out.println("\n");
            System.out.println("¿Desea ingresar un dato más?");
            System.out.println("1.- Si   2.- No");
            respuesta = user.nextInt();
        }while (respuesta!=2);
    }
}

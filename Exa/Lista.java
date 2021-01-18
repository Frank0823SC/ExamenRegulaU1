package Exa;
public class Lista {
        String Lista[];
    public void crearArreglo(int num_elementos){
        Lista = new String[num_elementos];
    }

    public void llenarLista(String dato){
        for (int i = 0; i <= Lista.length-1 ; i++) {
            Lista[i]=dato;
        } 
    }
}

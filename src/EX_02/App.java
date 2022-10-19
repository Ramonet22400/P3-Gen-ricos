package EX_02;
// Crea una clase genérica StackArray que utilice un array genérico y un entero que
//cuente el número de objetos insertados. Tiene que contener los siguientes métodos:

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        StackArray<Array> array = new StackArray<>();

        System.out.println();
        //Crearemos la ArrayList que contendra los valore que pasaremos a los metodos.
        System.out.println("Hay contenido en la lista?");

        if (ArrayList.isEmpty() == true ){
            System.out.println("La lista esta vacia.");
        }else{
            System.out.println("La lista tiene contenido.");
        }
        System.out.println();

        //Añadiremos nuevos valores a la lista.
        ArrayList.addFirst("Ramonet");
        ArrayList.addFirst("Nil");
        ArrayList.addFirst("Sergio");

        System.out.println("Contenido de la lista: "+StackArray);

        //Extraemos el primer elemento de la lista.
        StackArray.getFirst();

        //Y luego eliminamos este primer valor de la lista.
        StackArray.removeFirst();

        //Añadiremos un nuevo valor al inicio de la lista.
        StackArray.addFirst("Abadal");
        System.out.println("La lista quedaria tal que así: "+StackArray);

    }






    }
}

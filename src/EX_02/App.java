package EX_02;
// Crea una clase genérica StackArray que utilice un array genérico y un entero que
//cuente el número de objetos insertados. Tiene que contener los siguientes métodos:

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        StackArray<String> array = new StackArray<>();

        System.out.println();
        //Crearemos la ArrayList que contendra los valore que pasaremos a los metodos.
        System.out.println("Hay contenido en la lista?");

        if (array.isEmpty() == true ){
            System.out.println("La lista esta vacia.");
        }else{
            System.out.println("La lista tiene contenido.");
        }
        System.out.println();

        //Añadiremos nuevos valores a la lista.
        array.addFirst("Ramon") ;
        array.addFirst("Nil");
        array.addFirst("Sergio");

        System.out.println("Contenido de la lista: " + array.toString());

        //Extraemos el primer elemento de la lista.
        array.removeFirst();

        System.out.println(array.toString());

        //Y luego eliminamos este primer valor de la lista.
        //StackArray.removeFirst();

        //Añadiremos un nuevo valor al inicio de la lista.
        //StackArray.("Abadal");
        //System.out.println("La lista quedaria tal que así: "+);

    }
}


package EX_02;
// Crea una clase genérica StackArray que utilice un array genérico y un entero que
//cuente el número de objetos insertados. Tiene que contener los siguientes métodos:

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

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

        //Cogemos el primer valor y lo eliminamos.
        array.removeFirst();

        System.out.println("Eliminamos el primer valor que contiene la lista: "+array.toString());

        //Añadiremos un nuevo valor al inicio de la lista.
        StackArray.addFirst("Abadal");
        //System.out.println("La lista quedaria tal que así: "+);

        //Finalmente escribiriamos la lista

        System.out.println(toString);

    }
}


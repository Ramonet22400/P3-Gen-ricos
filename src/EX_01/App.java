package EX_01;

//Crea una clase genérica Stack que contenga los siguientes métodos:

public class App {
    public static void main(String[] args) {

        Stack<String> stackList = new Stack<>();

        System.out.println();
        //Crearemos la stacklist que contendra los valore que pasaremos a los metodos.
        System.out.println("Hay contenido en la lista?");

        if (stackList.isEmpty() == true ){
            System.out.println("La lista esta vacia.");
        }else{
            System.out.println("La lista tiene contenido.");
        }
        System.out.println();

        //Añadiremos nuevos valores a la lista.
        stackList.addFirst("Ramonet");
        stackList.addFirst("Nil");
        stackList.addFirst("Sergio");

        System.out.println("Contenido de la lista: "+stackList);

        //Extraemos el primer elemento de la lista.
        stackList.getFirst();

        //Y luego eliminamos este primer valor de la lista.
        stackList.removeFirst();

        //Añadiremos un nuevo valor al inicio de la lista.
        stackList.addFirst("Abadal");
        System.out.println("La lista quedaria tal que así: "+stackList);

    }
}
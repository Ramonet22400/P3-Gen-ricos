package EX_02;
import java.util.ArrayList;
import java.util.LinkedList;

public class StackArray <T>{
        private T data;
        private ArrayList<T> Array;

        //Crearemos los tres metodos creando funciones.
        public StackArray() {this.Array = new ArrayList<>();}
        public boolean isEmpty() {return this.Array.isEmpty();}
        public void removeFirst() {this.Array.remove(0);}
        public T getFirst() {return this.Array.get(0);}
        public void addFirst(T item) {this.Array.add(0, (T) "BMW");}
        public String toString() {return this.Array.toString();}
    }

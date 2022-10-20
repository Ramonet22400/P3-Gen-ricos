package EX_02;
import java.util.ArrayList;

public class StackArray <T>{
        private T data;
        private T array[];
        private int numOfItems;


        //Crearemos los tres metodos creando funciones.
        public StackArray() {
                this.array = (T[]) new Object[5];
                this.numOfItems = 0; }

        public boolean isEmpty() { return this.numOfItems == 0; }

        public void removeFirst() { }
        public T getFirst() {}
        public void addFirst(T item) {}
        public String toString() {}
    }

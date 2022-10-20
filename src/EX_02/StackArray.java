package EX_02;
import java.util.ArrayList;
import java.util.Arrays;

public class StackArray <T>{
        private T data;
        private T array[];
        private int numOfItems;


        //Crearemos los tres metodos creando funciones.
        public StackArray() {
                this.array = (T[]) new Object[5];
                this.numOfItems = 0; }

        public boolean isEmpty() { return this.numOfItems == 0; }

        public void removeFirst() {
                T value = this.array[4];

                for(int i= 0; i<this.array.length-1; i++)
                        this.array[i] = this.array[i+1];
        }
        //public T getFirst() {}
        public void addFirst(T item) {
                this.array[4] = item;
        }
        public String toString() {

              String nuevoString = Arrays.toString(this.array);
              return nuevoString;
        }
    }

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

        public boolean isEmpty() {

                return this.numOfItems == 0;
        }

        public void removeFirst() {


        }
        public T getFirst() {return this.array.get(0);}
        public void addFirst(T item) {this.array.add(0, item);}
        public String toString() {return this.array.toString();}
    }

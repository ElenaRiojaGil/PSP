package Restaurante;

//Hijack these for simplicity
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public class CircularBuffer<T> {

    private T[] buffer;

    private int tail; /** indica donde est� el final del buffer **/
    private int head; /** indica donde est� el comienzo del buffer **/

    @SuppressWarnings("unchecked")
    public CircularBuffer(int n) {
        buffer = (T[]) new Object[n];
        tail = 0;
        head = 0;
    }

    public void add(T toAdd) {
        if (head != (tail - 1)) {
            buffer[head++] = toAdd;
        } else {
            throw new BufferOverflowException();
        }
        head = head % buffer.length;
    }

    public T get() {
        T t = null;
        int adjTail = tail > head ? tail - buffer.length : tail;
        if (adjTail < head) {
            t = (T) buffer[tail++];
            tail = tail % buffer.length;
        } else {
            throw new BufferUnderflowException();
        }
        return t;
    }

    public boolean isEmpty() {
        int adjTail = tail > head ? tail - buffer.length : tail;
        if (adjTail >= head) {
            System.out.println("El circularbuffer está vacío");
            System.out.println(this.toString());
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (head != (tail - 1)) {
            return false;
        } else {
            System.out.println("El circularbuffer está lleno.");
            System.out.println(this.toString());
            return true;
        }
    }


    public String toString() {
        String cadena = "[";
        for (int i = 0; i < buffer.length; i++) {
            cadena = cadena + buffer[i] + ", ";
        }
        cadena = cadena + "]";
        return cadena + "\n CircularBuffer(size=" + buffer.length + ", head=" + head + ", tail=" + tail + ")";

    }

}
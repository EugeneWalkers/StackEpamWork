import java.util.Arrays;

public class CustomStackArray<T> {

    private T[] elements;
    private int current;
    private int capacity;

    public CustomStackArray(){
        current = 0;
        capacity = 10;
        elements = (T[]) new Object[capacity];
    }

    public int size(){
        return current;
    }

    public void push(T element){
        if (current < capacity){
            elements[current++] = element;
        }
        else{
            capacity*=2;
            T[] temp = elements.clone();
            elements = (T[]) new Object[capacity];
            elements[current++] = element;
            System.arraycopy(temp, 0, elements, 0, current);
        }
    }

    public T pop(){
        if (current > 0){
            return elements[--current];
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T pull(){
        if (current > 0){
            return elements[current - 1];
        }
        else{
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}

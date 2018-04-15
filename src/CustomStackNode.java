public class CustomStackNode<T> {

    private Entry<T> current;
    private int size = 0;

    static private class Entry<T>{

        T element;
        Entry<T> next;
        Entry<T> prev;
        Entry(){}

        Entry(T element, Entry<T> prev){
            this.element = element;
            this.next = null;
            this.prev = prev;
        }
    }

    public CustomStackNode(){
        current = new Entry<>();
    }

    public int size(){
        return size;
    }

    public void push(T element){
        current.next = new Entry<>(element, current);
        current = current.next;
        size++;
    }

    public T pull(){
        T element = current.element;
        return element;
    }

    public T pop(){
        T element = current.element;
        current = current.prev;
        current.next = null;
        size--;
        return element;
    }
}

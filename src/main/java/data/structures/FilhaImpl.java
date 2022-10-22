package data.structures;

public class FilhaImpl<T> implements Fila<T> {
    private final T[] elements;
    private int front;
    private int rear;
    private int count;

    public FilhaImpl(int size) {
        if (size <= 0)
            throw new RuntimeException("Tamanho inválido: " + size);

        this.elements = (T[]) new Object[size];
        this.front = -1;
        this.rear = -1;
        this.count = 0;
    }

    @Override
    public void enqueue(T data) {
        if (isFull())
            throw new RuntimeException("Fila lotada.");
        if (isEmpty()) {
            elements[0] = data;
            front++;
            rear++;
        } else {
            rear = (++rear) % size();
            elements[rear] = data;
        }

        count++;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            throw new RuntimeException("A lista está vazia.");

        T data = elements[front];
        front = ++front % size();
        count--;

        return data;
    }

    @Override
    public T front() {
        if(isEmpty())
            throw new RuntimeException("A fila está vazia");
        return elements[front];
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean isFull() {
        return count == size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int i = front;
        while(i != rear) {
            builder.append(elements[i]+"\n");
            i = (i+1) % size();
        }

        builder.append(elements[i]+"\n");

        return builder.toString();
    }

    public static void main(String[] args) {
        FilhaImpl<Integer> fila = new FilhaImpl<Integer>(4);
        fila.enqueue(5);
        fila.enqueue(6);
        fila.enqueue(7);
        fila.enqueue(8);
        System.out.println(fila);
        System.out.println("Dequeue: " + fila.dequeue());
        System.out.println("Dequeue: " + fila.dequeue());
        fila.enqueue(9);
        System.out.println("Enqueue: 9");
        System.out.println(fila);

    }
}

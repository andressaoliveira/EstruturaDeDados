package data.structures;

import java.util.NoSuchElementException;

public class ListaLigadaImpl<T> implements ListaLigada<T>{

    private Node<T> first;
    private Node<T> last;

    @Override
    public String toString() {
        return "ListaLigadaImpl{" + "\nInicio=" + first + '}';
    }

    @Override
    public void inserirInicio(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    @Override
    public void inserirFinal(T data) {
        Node<T> node = new Node<>(data);
        if (isEmpty()) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
    }

    @Override
    public T removerInicio() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            Node<T> node = first;
            first = last = null;
            return node.value;
        }
        T valueFirst = first.value;

        Node<T> second = first.next;
        first.next = null;
        first = second;
        return valueFirst;


    }

    @Override
    public T removerFinal() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            T node = first.value;
            first = last = null;
            return node;
        }
        Node<T> node = first;
        while (isNotNull(node)) {
            if (node.next == last) {
                break;
            } else {
                node = node.next;
            }
        }
        T valueLast = node.next.value;
        node.next = null;
        last = node;
        return valueLast;
    }

    @Override
    public void imprimir() {
        System.out.println(this);

    }

    private boolean isEmpty() {
        return first == null;
    }

    private boolean isNotNull(Node<T> node) {
        return node != null;
    }

    private class Node<T> {
        private T value;
        private ListaLigadaImpl<T>.Node<T> next;

        public Node(T value) {
            this.value = value;

        }

        @Override
        public String toString() {
            return "Node{" + "\nvalue=" + value + ", \nnext=" + next + '}';
        }

    }
}

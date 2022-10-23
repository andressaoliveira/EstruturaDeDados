package data.structures;

public class ListaDuplamenteLigadaImpl<T> implements  ListaDuplamenteLigada<T>{
    private int anterior;
    private int posterior;
    private final T[] elements;

    public ListaDuplamenteLigadaImpl(int anterior, int posterior, T[] elements) {
        this.anterior = anterior;
        this.posterior = posterior;
        this.elements = elements;
    }

    @Override
    public void reverse() {

    }

    @Override
    public void inserirInicio(T data) {

    }

    @Override
    public void inserirFinal(T data) {

    }

    @Override
    public T removerInicio() {
        return null;
    }

    @Override
    public T removerFinal() {
        return null;
    }

    @Override
    public void imprimir() {

    }
}

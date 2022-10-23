package data.structures;

public interface Busca<T extends Comparable<T>> {

    int buscaSequencial(T[] elements, T x);

    int buscaBinaria(int[] elements, int x);

}

package data.structures;

public class BuscaImpl<T extends Comparable<T>> implements Busca<T>{

    @Override
    public int buscaSequencial(T[] elements, T x) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == x){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int buscaBinaria(int[] elements, int x) {
        int esq = 0;
        int dir = elements.length - 1;
        while(esq <= dir){
            int meio = (esq + dir)/2;
            if(elements[meio] == x)
                return meio;
            else if(elements[meio] < x)
                esq = meio + 1;
            else
                dir = meio - 1;
        }
        return -1;
    }
}

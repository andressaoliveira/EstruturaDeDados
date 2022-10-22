package data.structures;

public class ListaLigadaMain {
    public static void main(String[] args) {
        /*ListaLigadaImpl<Integer> listaLigada = new ListaLigadaImpl<>();
        listaLigada.inserirInicio(1);
        listaLigada.inserirInicio(2);
        listaLigada.inserirInicio(3);
        listaLigada.inserirInicio(4);
        listaLigada.imprimir();

        System.out.println("\n///////////////////////////\n");

        listaLigada.inserirFinal(5);
        listaLigada.imprimir();
        System.out.println("\n///////////////////////////\n");

        System.out.println(listaLigada.removerInicio());
        listaLigada.imprimir();
        System.out.println("\n///////////////////////////\n");
        System.out.println(listaLigada.removerFinal());
        listaLigada.imprimir();*/

        ListaLigadaImpl<String> listaLigada = new ListaLigadaImpl<>();
        listaLigada.inserirInicio("a");
        listaLigada.inserirInicio("b");
        listaLigada.inserirInicio("c");
        listaLigada.inserirInicio("d");
        listaLigada.imprimir();
        System.out.println("\n///////////////////////////\n");

        listaLigada.inserirFinal("e");
        listaLigada.imprimir();
        System.out.println("\n///////////////////////////\n");
        System.out.println(listaLigada.removerInicio());
        listaLigada.imprimir();
        System.out.println("\n///////////////////////////\n");
        System.out.println(listaLigada.removerFinal());
        listaLigada.imprimir();





    }
}

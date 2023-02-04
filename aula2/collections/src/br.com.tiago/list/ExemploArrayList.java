
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* É como um array, mas o seu tamanho pode crescer
   a busca por elentos são rápidas mas a inserção e exclusão não são
   @autor: Tiago Nascimento Hilario 
*/
public class ExemploArrayList {
    public static void main(String[] args) throws Exception {
        executarListaSimples();
        executarListaOrdenada();
    }

    public static void executarListaSimples() {

        System.out.println("Exemplo arrayList simples");

        List<String> lista = new ArrayList<String>();

        lista.add("Antônio josé");
        lista.add("Caio Monteiro");
        lista.add("Andresa Carla");
        lista.add("Sônia Helana");
        System.out.println(lista);
    }
    public static void executarListaOrdenada(){

        System.out.println("Exemplo arrayList ordenada");

        List<String> listaOrdenada = new ArrayList<String>();

        listaOrdenada.add("Sônia Helana");
        listaOrdenada.add("Andresa Carla");
        listaOrdenada.add("Caio Monteiro");
        listaOrdenada.add("Antônio josé");
        Collections.sort(listaOrdenada);
        System.out.println(listaOrdenada);

    }

}

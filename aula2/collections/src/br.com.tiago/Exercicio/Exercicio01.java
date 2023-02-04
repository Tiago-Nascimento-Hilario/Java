import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        int contador = 1;
        String nomes = " Arthur, Levi, Gabriel, Jussara, Lorraine, Thais, Randeli, ";
        List<String> lista = new ArrayList<String>();
        lista.add(nomes);
        
        for (String string : lista) {
            System.out.println(string);
        }

    }
}

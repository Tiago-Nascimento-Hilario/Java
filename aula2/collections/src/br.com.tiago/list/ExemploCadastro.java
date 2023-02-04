
import java.util.ArrayList;
import java.util.List;

public class ExemploCadastro {
    public static void main(String[] args) {
        listarCadastros();
    }

    private static void listarCadastros() {
        List<Cadastro> lista = new ArrayList<Cadastro>();
        
        Cadastro a = new Cadastro("Luciana braga", "645464",  "feminina");
        Cadastro b = new Cadastro("Caio anão","98767", "masculina");

        lista.add(a);
        lista.add(b);
        // lista.remove(a);

        for (Cadastro cadastro : lista) {
            System.out.println(cadastro);
        }
    }
}

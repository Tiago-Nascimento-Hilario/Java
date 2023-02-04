import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    /**
     * @param args
     * @autor Tiago Nascimento hilario
     */
    public static void main(String[] args) {
        
        List<Cadastro> listaDeCadastro = new ArrayList<Cadastro>();
        
        List<Cadastro> homens = new ArrayList<Cadastro>();
        List<Cadastro> mulheres =  new ArrayList<Cadastro>();

        int h = 0;
        int m = 0;
        
        Cadastro primeiro = new Cadastro("Tiago Nascimento", "87878", "homem");
        Cadastro segundo = new Cadastro("Ana Moraes", "87654", "mulher");
        Cadastro terceiro = new Cadastro("Ghuilherme garcia", "65432", "homem");
        Cadastro quarto = new Cadastro("Soraia", "86757", "mulher" );
        
        listaDeCadastro.add(primeiro);
        listaDeCadastro.add(segundo);
        listaDeCadastro.add(terceiro);
        listaDeCadastro.add(quarto);

        for (Cadastro cadastro : listaDeCadastro) {
            if (cadastro.getGenero().contains("homem")){
                h++;
                homens.add(cadastro);
                
            }else if(cadastro.getGenero().contains("mulher")){
                m++;
                mulheres.add(cadastro);
            }
        }

        System.out.println("Qnt homens: "+ h +"\n" + homens.toString());
        System.out.println("Qnt mulheres: "+ m +"\n" + mulheres.toString());
    }

}

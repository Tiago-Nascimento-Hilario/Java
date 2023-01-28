


public class Cadastro {
    private String nomeCompleto;
    private String matricula;

    public Cadastro(String nomeCompletoString, String matricula){
        this.nomeCompleto = nomeCompletoString;
        this.matricula = matricula;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Cadastro [nomeCompleto=" + nomeCompleto + ", matricula=" + matricula + "]";
    }
    
    
}
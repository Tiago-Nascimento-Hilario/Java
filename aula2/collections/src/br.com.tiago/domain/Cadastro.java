


public class Cadastro {
    private String nomeCompleto;
    private String genero;
    private String matricula;

    public Cadastro(String nomeCompletoString, String matricula, String genero){
        this.nomeCompleto = nomeCompletoString;
        this.matricula = matricula;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

     @Override
     public String toString() {
    //     return "Cadastro [nomeCompleto=" + nomeCompleto + ", genero=" + genero + ", matricula=" + matricula + "]";
     return "Cadastro [\nNome completo= " + nomeCompleto + "\n" +
            "Genero= " + genero + "\n" + 
            "Matricula= " + matricula + 
            "]";
}
     
    
    
    
    
}
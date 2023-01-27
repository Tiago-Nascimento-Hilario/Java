import java.util.Scanner;

// echo "# Java" >> README.md
// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/Tiago-Nascimento-Hilario/Java.git
// git push -u origin main

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade");
        Integer idade = sc.nextInt();
        String setIdade = verficarIdade(idade);
        System.out.println(setIdade);
    }
    public static String verficarIdade(Integer idade){
        String resultado;
        if (idade <= 5) {
            resultado = "ã";
        }else{
            resultado = "ã";
        }
        return resultado;
    }
}
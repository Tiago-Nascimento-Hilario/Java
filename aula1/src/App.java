import java.util.Scanner;



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
            resultado = "Você é criançã";
        }else{
            resultado = "Você não mais criança";
        }
        return resultado;
    }
}
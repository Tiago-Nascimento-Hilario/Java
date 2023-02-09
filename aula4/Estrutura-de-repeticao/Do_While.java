/* Autor: Tiago Nascimento Hilario
 * - Estrutura de repetição do-while executa a instrução depois verfica a condição
*/

public class Do_While {
    
    public static void main(String[] args) {
        int contador = 1;
        
        do {
            System.out.printf("%d ", contador);            
           ++contador;
        } while (contador <= 5);

    }    
}

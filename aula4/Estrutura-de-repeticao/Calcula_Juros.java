/* Projeto - código para calcular juros de 5% ao ano.
 * autor: Tiago Nascimento hilario
*/
/* - Não utilizar variáveis do tipo double ou float para realizar cálculos montários precisos.  
 */

public class Calcula_Juros {
    public static void main(String[] args) {

        double quantidadeDepositoAnual;
        double valorInvestido = 1000.0; 
        double juros = 0.05;

        // exibe cabeçalho
        System.out.printf("%s%20s %n", "Ano", "Saldo atual anual");

        // calcula quantidade de deposito para cada um dos dez anos
        for (int ano = 1; ano <= 5; ++ano) {

            // calcula nova quantidade durante ano especificado
            quantidadeDepositoAnual = valorInvestido * Math.pow(1.0 + juros, ano);

            // exibe o ano e a quantidade
            System.out.printf("%d%,20.2f%n", ano, quantidadeDepositoAnual);
        }
    }
}

package exercicios;
import java.util.Scanner;
/**
 *
 * @author dede
 */

//classe teste
public class ContasTeste {
    
    public static void main(String[] args) {
        //criar uma objeto de entradade de dados
        Scanner input = new Scanner(System.in);
        //cria uma variavel conta do Objeto contas
        Contas minhaconta = new Contas("Andre");
        
        //verifica o nome da conta da minha conta criada (output1)
        System.out.printf("O nome da sua conta e: %s%n%n ", minhaconta.getName());
        
        //coloca a entrada na variavel que sera instanciada
        System.out.println("Digite o nome da conta: ");
        String nome = input.nextLine(); 
        System.out.println();

        //Armazena a linha digitada na variavel nome
        /*Acessa a objeto minhaconta da classe Contas usando o metodo 
        setName(Configurar o nome)passando uma string criada na linha acima*/
        
        minhaconta.setName(nome);
        
        //output2
        System.out.printf("O nome da conta no objeto minha conta é %s%n%n", minhaconta.getName());
        
        
    }//fim da aplicacao
    
}//fim classe

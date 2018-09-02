package exercicios;
import java.util.Scanner;
/**
 *
 * @author dede
 */
public class SolucaoSomaDoisInt {
    //Metodo estatico que recebe dois inteiros e retorna a soma entre eles
    static int calculaSoma(int a, int b){ 
        return a + b;
    }
    
    //aplicacao
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        int primeiroNum = input.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int segundoNum = input.nextInt();
        
        int resultado;
        //chamada dos metodos
        resultado = calculaSoma(primeiroNum, segundoNum); // resultado recebe o metodo com os argumentos do primeiro numero e do segundo numero
        
        //output
        System.out.println(resultado);
        
    }//fim da aplicacao
    
}//fim da classe

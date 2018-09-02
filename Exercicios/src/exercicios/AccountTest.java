package exercicios;

import java.util.Scanner;

public class AccountTest {
    
    //inicio aplicacao
    public static void main(String[] args){
        //cria um novo objeto de entrada do tipo scanner com o nome input
        Scanner input = new Scanner(System.in);
        
        //cria um objeto conta e atribui minha conta
        Account conta = new Account("Andre");
        
        //exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", conta.getName());
        
        //solicita e lê o nome
        System.out.println("Please enter the name: ");
        String nome = input.nextLine();
        conta.setName(nome); //insere the name in myAccount
        System.out.println();//gera uma saida de linha em branco
        
        
        //exibe o nome armazenado no objeto myAccount
        System.out.printf("O nome da sua conta e: %s%n%n ", conta.getName());
        
        
    }//fim aplicacao
    
    
    
}//fim da classe teste


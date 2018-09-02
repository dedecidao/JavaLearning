package exercicios;

import java.util.Scanner;

public class Arrays {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numAlunos = 5;
        double[] notasAlunos = new double[numAlunos];
        
        //Ler as posicoes do array numAlunos
        for(int i = 0; i < numAlunos; ++i){
            System.out.println("Insira a nota do " + (i+1) + " aluno: ");
            notasAlunos[i] = input.nextDouble();
            
        }
        for(int i = 0; i< numAlunos; ++i){
            System.out.println("-> " + notasAlunos[i]);
            
            
        }
        
    }//fim da aplicacao
}//fim da classe

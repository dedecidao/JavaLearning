package exercicios;

/**
 *
 * @author dede
 */
public class OrdenarVetor {
    public static void main(String[] args) {
        
        int vetor[] = {19, 3, 6, 2, 1, 8, 4, 12, 15};
        int aux;
        boolean controle;
        
            for (int j = 0; j < (vetor.length - 1); ++j) {
                
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }//end if que compara
                
                
            }//vai para o proximos indices comparar


        //ciclo percorre e imprimi as posicoes do vetor
        for(int i = 0; i < vetor.length ; ++i){
            
            System.out.print(vetor[i] + " "); 
        }
        
        
    }//fim main
    
}//fim da classe

package exercicios;

/**
 *
 * @author dede
 */
public class BubbleSort {
    public static void main(String[] args) {
    int[] vetor = {2, 1, 3, 4, 5};
    int aux;
    int contador = 0;
    int troca = 0;
    //boolean estaEmOrdem;
    
        System.out.println("Imprimindo vetor desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }//end output
        
        for (int j = 0; j < vetor.length - 1; j++) { //percorre o vetor
            contador++;
            //estaEmOrdem = true;
            for (int k = 0; k < vetor.length - 1; k++) {//percorre e troca se necessario
                if(vetor[k] > vetor[k+1]){
                    aux = vetor[k];
                    vetor[k] = vetor[k+1];
                    vetor[k+1] = aux;
                    troca++;
                    //estaEmOrdem = false;
                    
                }//fim condicao if de troca
                
                
            }//fim do for de dentro
//            if(estaEmOrdem == false){
//                break;
//            }
        }//fim do for de fora
        System.out.println(" ");
        System.out.println("Imprimindo vetor ordenado, foram feitas " + contador + " verificacoes" + " e " + troca + " troca(s)");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
    }//fim da main    
    
    
}//fim da classe bubble sort

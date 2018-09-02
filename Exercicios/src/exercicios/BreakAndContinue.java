package exercicios;
import java.util.Scanner;


public class BreakAndContinue {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero de 0 a 10");
        int numero = entrada.nextInt();
        
        for(int i = 0; i <= 10; ++i){
            
            if(i == numero){
                System.out.println("O seu numero e " + i);
                break;
                
            } else {
                System.out.println("O seu numero nao e " + i);
                System.out.println("oi");
                //continue;
               
                
            } //end if else
            
        }//end for
           System.out.println("Oi");
        
                
        
        
        
        
    }//end main method
    
    
}//end class

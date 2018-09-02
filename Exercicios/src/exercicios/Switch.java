package exercicios;
import java.util.Scanner;

public class Switch {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um numero de 1 a 5");
        int num = input.nextInt();
        
        switch(num){
            
            case 1:
                System.out.println("Voce escolheu o numero 1");
                break;
            case 2:
                System.out.println("Voce escolheu o numero 2");
                break;
            case 3:
                System.out.println("Voce escolheo o numero 3");
                break;
            case 4:
                System.out.println("Voce escolheo o numero 4");
                break;
            case 5:
                System.out.println("Voce escolheo o numero 5");
                break;
            default:
                System.out.println("Voce escolheu um numero invalido");
        }
        
        
    }//fim do metodo main
    
    
    
}//fim da classe

package exercicios;

public class notaAluno {

    public static void main(String[] args) {
        int nota = 95;
        if(nota >= 90){
            System.out.println("A");
        }else
            if(nota >= 80){
                System.out.println("B");
            }
            else
                if(nota >= 70){
                    System.out.println("C");
                }
                else
                    if(nota >- 60){
                        System.out.println("D");
                    }
                    else
                        System.out.println("F");
                
    }//end main method
    
}//end class
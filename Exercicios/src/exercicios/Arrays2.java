package exercicios;

public class Arrays2 {
    //main
    public static void main(String[] args) {
        int i;
        int[] x = {1};
        //assume o valor k em cada posicao
        //for (int k = 0; k < x.length; k++) {
        //    x[k] = k;
        //}
        
        java.util.Arrays.fill(x, 20);
        
        for (int j = 0; j < x.length; j++) {
            System.out.println(x[j]);
            
        }

       
    }//end main
    
}//fim da classe

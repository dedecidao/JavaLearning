package exercicios;

/**
 *
 * @author dede
 */

//class conta
public class Account {
    
    //variavel de instancia
    private String name; 
    private double balance;
    
    //metodo contrutor
    public Account(String name){
        this.name = name;
        
        
    }//fim do metodo construtor
    
    
    //metodo para definir o nome do objeto
    public void setName(String name){
        
        this.name = name;
    }
    
    //metodo para recuperar o nome do objeto
    public String getName(){
        
        return name;
    }
    
    
}//fim da classe

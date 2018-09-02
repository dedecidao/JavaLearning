package exercicios;

public class Contas {
    //variavel nome que sera instanciada
    private String name;
    //metodo construtor
    public Contas(String name){
    
        this.name = name;
}
    

    //Atribui um parametro a uma variavel de instancia
    public void setName(String name){
        this.name = name;
        
    }
    //Recupera o nome da variavel de instancia para uso
    public String getName(){
        
        return name;
    }
    
    
}//fim da classe

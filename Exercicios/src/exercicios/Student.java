
package exercicios;


public class Student { //Classe Student armazena o nome e media do aluno
    private String name;
    private double average;
    
    //Metodo Construtor inicia variaveis de instancia
    public Student (String name, double average){ 
        this.name = name;
        
        if (0 < average && average <= 100){
            this.average = average; //atribui a variavel de instancia
        } 
            
        }//fim metodo construtor
    
    //define o nome do estudante
    public void setName(String name){
        this.name = name;
    }//fim definir o nome do estudante
    
    //recupera nome do estudante
    public String getName(){
        return name;
    }//fim da recuperacao de nome do estudante
    
    //define a media do estudante
    public void setAverage(double average){
        if (average > 0)
            if (average <= 100)
                this.average = average;
    }//fim da definição da media do estudante
    
    //recupera a media do estudante
    public double getAverage(){
        return average;
    }
    //fim recupera a media do estudante
    
    //determina e retona a letra da nota do estudante
    public String getLetterGrade(){
        String letterGrade = " "; //Inicia uma string vazia
        
        if (average >= 90)
            letterGrade = "Inconpativel";
        else if (average >= 80)
            letterGrade = "B";
        else if (average >= 70)
            letterGrade = "C";
        else if (average >= 60)
            letterGrade = "D";
        else
            letterGrade = "F";
        return letterGrade;
    }//fim do metodo que recebe media e retorna a letra correspondente a media
    
    
        
        
}//end class  
    



package exercicios;
//Cria e testa objetos do tipo Student
public class StudenTest {
    public static void main(String[] args) {
        //objetos students
        Student account1 = new Student("Jane green", 90);
        Student account2 = new Student("John blue", 72.85);
        //ouput
        System.out.printf("%s letter grade is: %s%n", account1.getName(),account1.getLetterGrade());
        System.out.printf("%s letter grade is: %s%n", account2.getName(), account2.getLetterGrade());
        
        
    }//end aplicacao
    
}//fim da classe teste

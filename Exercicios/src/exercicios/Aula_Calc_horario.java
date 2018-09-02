
package exercicios;


public class Aula_Calc_horario {
    public static void main(String[] args) {
        
        long totalMilisegundos = System.currentTimeMillis(); //obtendo milisegundos desde a era unix
        
        long totalSegundos = totalMilisegundos / 1000; //obtendo total de segundos desde a era unix
        long segundoAtual = totalSegundos % 60; //obtendo segundos atuais
        
        long totalMinutos = totalSegundos / 60; //obtendo total de minutos desde a era unix
        long minutoAtual = totalMinutos % 60; //obtendo minutos atuais
        
        long totalHoras = totalMinutos / 60; //obtendo as horas unix
        long horaatual = (totalHoras % 24) - 3; //horas atuais compensando 3 horas atras do horarios brasileiro de diferença do meridiano
        
        
        //Saida
        System.out.println(horaatual + ":" + minutoAtual + ":" + segundoAtual);
        
    }//end main
    
}//end class

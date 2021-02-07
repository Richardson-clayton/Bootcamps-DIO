/*Norminia é uma professora e pesquisadora renomada de uma famosa Universidade do Brasil, com inúmeras prêmiações e reconhecimento internacional pelo seu trabalho. Recentemente, Norminia foi convidada para ministrar aulas em uma Universidade da Alemanhã. Mesmo falando muito bem a Língua alemã, Norminia ficou um pouco apreensiva com a responsabilidade, mas resolveu aceitar a proposta e encará-la como um bom desafio.*/

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota = input.nextInt();
        if(nota == 0){
            System.out.println("E");
        }else if (nota >= 1 && nota <= 35){
            System.out.println("D");
        }else if (nota >= 36 && nota <= 60){
            System.out.println("C");
        }else if (nota >= 61 && nota <= 85){
            System.out.println("B");
        }else if (nota >= 86 && nota <= 100){
            System.out.println("A");
        }
        input.close();
        
    }
}

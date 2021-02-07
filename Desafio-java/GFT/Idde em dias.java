/* Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias*/

import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int idadeDias = input.nextInt();
    int anos = idadeDias / 362;
    int meses = ((idadeDias % 365) / 30);
    int dias = ((idadeDias % 365) % 30);
    System.out.println(anos + " anos(s)");
    System.out.println(meses + " mes(es)");
    System.out.println(dias + " dia(s)");
  }
}
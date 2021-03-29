/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author gabi_
 */
public class Calc {
    public int som(int num1, int num2) {
        return num1 + num2;
    }  
    public int sub(int num1, int num2){
        return num1 - num2;
    }  
    public int div(int num1,int num2){
        return num1 / num2;
    }  
    public int mult(int num1, int num2){
        return num1 * num2;
    }  
    public int quad(int num1){
        return num1 * num1;
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calc c = new Calc();  
          
        //declarando as varíaveis  
        int opcao = 6;  
        int num1;  
        int num2;  
        
        Scanner input = new Scanner(System.in);
        System.out.println("-Escolha uma opção-");  
        System.out.println("1. Soma");    
        System.out.println("2. Subtracao");    
        System.out.println("3. Multiplicacao");    
        System.out.println("4. Divisao");
        System.out.println("5. Quadrado");   
        System.out.println("0. Sair");    
        System.out.println("Operação: ");    
          
        opcao = input.nextInt(); 
        OUTER:
        while (opcao != 0) {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Qual o primeiro numero: ");
            num1 = input1.nextInt();
            System.out.println("Qual o segundo numero: ");
            num2 = input1.nextInt();
            switch (opcao) {
                case 1:
                    {
                        int operacao = c.som(num1, num2);
                        System.out.printf("\nO resultado da soma é: %d\n", operacao);
                        break OUTER;
                    }
                case 2:
                    {
                        int operacao = c.sub(num1, num2);
                        System.out.printf("\nO resultado da subtração é: %d\n", operacao);
                        break OUTER;
                    }
                case 3:
                    {
                        int operacao = c.mult(num1, num2);
                        System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);
                        break OUTER;
                    }
                case 4:
                    {
                        int operacao = c.div(num1, num2);
                        System.out.printf("\nO resultado da divisão é: %d\n", operacao);
                        break OUTER;
                    }
                case 5:
                    {
                        int operacao = c.quad(num1);
                        System.out.printf("\nO resultado do quadrado é: %d\n", operacao);
                        break OUTER;
                    }
                default:
                    System.out.println("Até a próxima!");
                    break OUTER;
            }
        }
    }  // fim do metodo principal 
}


 
    

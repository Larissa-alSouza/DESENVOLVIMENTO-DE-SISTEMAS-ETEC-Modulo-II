/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

/**
 *
 * @author Aluno
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x, tab;
        x = 5;
        
        for(int n = 0; n < 11; n++)
        {
            tab = n * x;
            
            System.out.println(n + " X " + x + " = " + tab);
        }
    }
    
}

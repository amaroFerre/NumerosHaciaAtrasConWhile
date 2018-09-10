/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroshaciaatrasconwhile;

/**
 *
 * @author Amarico
 */
public class NumerosHaciaAtrasConWhile {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    //Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
    //utilizando un bucle while.
    
    //Creo una variable de tipo entero con el valor 340
    
    int numero = 320;
    
    // Inicio bucle While
    
    while (numero > 160) {

    numero = numero - 20;
      
    
      System.out.println(numero);
    }
    
  }

}

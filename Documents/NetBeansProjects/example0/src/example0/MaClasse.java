/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example0;

/**
 *
 * @author Romy
 */
public class MaClasse {
    public static int calculer(int a, int b) {
    int res = a + b;
    
    if (a == 0){
      res = b * 2;
    } 
    
    if (b == 0) {
      res = a * a;     
    }
    return res; 
  }
}

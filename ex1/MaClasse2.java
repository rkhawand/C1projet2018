package example1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Romy
 */
public class MaClasse2 {
     private int a;
     private int b;

  //constructeur
  public MaClasse2(int a, int b) {
    this.a = a;
    this.b = b;        
  }

  public int getA() {
    return a;  
  }

  public int getB() {
    return b;  
  }

  public void setA(int unA) {
    this.a = unA;
  }

  public void setB(int unB) {
    this.b = unB;
  }
  
  // methode normale avec if / else
  
  public int calculer() {
    int res = a + b;
    
    if (a == 0){
      res = b * 2;
    } 
    
    if (b == 0) {
      res = a * a;     
    }
    return res; 
  }

  // methode qui lève une exxception 
  
  public int sommer() throws IllegalStateException {
    if ((a == 0) && (b==0)) {
      throw new IllegalStateException("Les deux valeurs sont nulles");
    }
    return a+b; 
  }
}


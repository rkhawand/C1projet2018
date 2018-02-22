/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Romy
 */
import junit.framework.TestCase;
import example1.MaClasse2;

        //alt+F6 to run the test methodes or from the menu bar choose run the test Project

public class MaClasse2Test extends TestCase {
    
//    public void testCalculer() throws Exception {
//    MaClasse2 mc = new MaClasse2(1,1);
//    assertEquals(2,mc.calculer());
//  }
//    
//               // 1er essaie pour la methode sommer qui subit un fail du test
//
//    public void testSommer() throws Exception {
//    MaClasse2 mc = new MaClasse2(0,0);
//    mc.sommer();        
//  }  
// }

            //comme resultat on a unn fail pour le test de la classe sommer
            //donc il faut re ecrire cette methode tout en ajoutant les conditions
            //qui doivent lever une exception et en appelant la méthode fail()
            //si l'exception désirée n'est pas levée.
    
                //2eme essaie qui doit passé avec succé

 public void testSommer() throws Exception {
   MaClasse2 mc = new MaClasse2(1,1);
    
    // cas de test 1
    assertEquals(2 , mc.sommer());
    
    // cas de test 2
    try {
      mc.setA(0);
      mc.setB(0);
      mc.sommer();    
      fail("Une exception de type IllegalStateException aurait du etre levee");
    } catch (IllegalStateException ise) {
    } 
  }
}
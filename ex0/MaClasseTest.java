/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import example0.MaClasse;
import junit.framework.TestCase;
/**
 *
 * @author Romy
 */
public class MaClasseTest extends TestCase {
    
    public void testCalculer() throws Exception {
    assertEquals(3,MaClasse.calculer(1,1));
  }
    
            //essayons avec la valeur 3
    
            // dans le cas où on ecrit le nom de la methode incorrectement
            //un failure doit apparaitre . ds mon cas j'ai ecrit test calculer
            //avec un t majuscule
    
//     public void TestCalculer() throws Exception {
//    assertEquals(2,MaClasse.calculer(1,1));
//  }
    
}

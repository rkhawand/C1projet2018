/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import example3.SecuriteHelper ;
/**
 *
 * @author Romy
 */
public class SecurirteHelperTest {
//     @Test
//  public void testIsMotDePasseValide() {
//    try {
//      SecuriteHelper.isMotDePasseValide(null);
//      fail("Absence de la levee de l'exception IllegaleArgumentException");
//    } catch (IllegalArgumentException iae) {
//      // l'exception est levée
//    }
//    
//    assertFalse("Le mot de passe est vide", 
//      SecuriteHelper.isMotDePasseValide(""));
//    assertFalse("Le mot de passe est trop court", 
//      SecuriteHelper.isMotDePasseValide("aaa"));
//    assertFalse("Le mot de passe est trop long", 
//      SecuriteHelper.isMotDePasseValide("aaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
//    assertFalse("Le mot de passe ne contient pas de chiffre", 
//      SecuriteHelper.isMotDePasseValide("aaaaa"));
//    assertFalse("Le mot de passe contient un chiffre en derniere position", 
//      SecuriteHelper.isMotDePasseValide("aaaaa6"));
//
//    assertTrue("Le mot de passe est valide", 
//      SecuriteHelper.isMotDePasseValide("aAa6Aa"));
//    assertTrue("Le mot de passe est valide", 
//      SecuriteHelper.isMotDePasseValide("a@aA6aa"));
//    assertTrue("Le mot de passe est valide", 
//      SecuriteHelper.isMotDePasseValide("abc456def"));
  //}
  
            //  Il est préférable d'écrire une méthode par cas de tests
  
  @Test(expected=IllegalArgumentException.class)
  public void testIsMotDePasseValideNull() {
      SecuriteHelper.isMotDePasseValide(null);
  }
  
  @Test
  public void testIsMotDePasseValideVide() {
    assertFalse("Le mot de passe est vide", 
      SecuriteHelper.isMotDePasseValide(""));
  }
  
  @Test
  public void testIsMotDePasseValideTropCourt() {
    assertFalse("Le mot de passe est trop court", 
      SecuriteHelper.isMotDePasseValide("aaa"));
  }
  
  @Test
  public void testIsMotDePasseValideTropLong() {
    assertFalse("Le mot de passe est trop long", 
      SecuriteHelper.isMotDePasseValide("aaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
  }
  
  @Test
  public void testIsMotDePasseValideSansChiffre() {
    assertFalse("Le mot de passe ne contient pas de chiffre", 
      SecuriteHelper.isMotDePasseValide("aaaaa"));
  }
  
  @Test
  public void testIsMotDePasseValideChiffreEnDernier() {
    assertFalse("Le mot de passe contient un chiffre en derniere position", 
      SecuriteHelper.isMotDePasseValide("aaaaa6"));
  }
  
  @Test
  public void testIsMotDePasseValideAvecMinMaj() {
    assertTrue("Le mot de passe est valide", 
      SecuriteHelper.isMotDePasseValide("aAa6Aa"));
  }
  
  @Test
  public void testIsMotDePasseValideAvecArobase() {
    assertTrue("Le mot de passe est valide", 
      SecuriteHelper.isMotDePasseValide("a@aA6aa"));
  }
  
  @Test
  public void testIsMotDePasseValideStandard() {
    assertTrue("Le mot de passe est valide", 
      SecuriteHelper.isMotDePasseValide("abc456def"));
  }
}

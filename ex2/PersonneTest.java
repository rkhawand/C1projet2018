/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import example2.Personne;

/**
 *
 * @author Romy
 */
public class PersonneTest extends TestCase  {
    
 private Personne personne;
  
  public PersonneTest(String name) {
    super(name);
  }

        //méthode setUp()(->@before) est invoquée systématiquement avant l'appel
        //de chaque méthode de tests.Elle est requise si toutes les méthodes 
       //de tests ont besoin de créer une instance d'un même type ou d'exécuter
       //un même traitement.
  
  protected void setUp() throws Exception {
    super.setUp();
    personne = new Personne("nom1","prenom1");
  }

            //tearDown -> @after elle remet à null l'instance créé
  
  protected void tearDown() throws Exception {
    super.tearDown();
    personne = null;
  }

  public void testPersonne() {
    assertNotNull("L'instance n'est pas créée", personne);
  }

  public void testGetNom() {
    assertEquals("Le nom est incorrect", "nom1", personne.getNom());
  }

  public void testSetNom() {
    personne.setNom("nom2");
    assertEquals("Le nom est incorrect", "nom2", personne.getNom());
  }
  
//   public void testSetNom() {
//    personne.setNom("nom2");
//    assertEquals("Le nom est incorrect", "nom2", personne.getNom());
//    try {
//      personne.setNom(null);
//      fail("IllegalArgumentException non levée avec la propriété nom à null");
//    } catch (IllegalArgumentException iae) {
//      // ignorer l'exception puisque le test est OK (l'exception est levée)
//    }
//  }

  public void testGetPrenom() {
    assertEquals("Le prenom est incorrect", "prenom1", personne.getPrenom());
  }

  public void testSetPrenom() {
    personne.setPrenom("prenom2");
    assertEquals("Le prenom est incorrect", "prenom2", personne.getPrenom());
  }
}

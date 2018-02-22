/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.extensions.RepeatedTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import example4.Personne;

/**
 *
 * @author Romy
 */

        //JUnit propose la classe junit.extensions.RepeatedTest 
        //qui permet d'exécuter plusieurs fois la même suite de tests.
        //Le constructeur de cette classe attend en paramètre une instance
        //de la suite de tests et le nombre de répétitions de l'exécution

public class PersonneTest extends TestCase {  
  private Personne personne;

  public PersonneTest(String name) {
    super(name);
  }
  
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

  public void testGetPrenom() {
    assertEquals("Le prenom est incorrect", "prenom1", personne.getPrenom());
  }

  public void testSetPrenom() {
    personne.setPrenom("prenom2");
    assertEquals("Le prenom est incorrect", "prenom2", personne.getPrenom());
  }

  public static Test suite() {
    return new RepeatedTest(new TestSuite(PersonneTest.class), 5);
  }
  
  public static void main(String[] args) {
      junit.textui.TestRunner.run(suite());
  }
    
}

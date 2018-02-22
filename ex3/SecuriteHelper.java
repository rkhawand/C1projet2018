/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example3;

/**
 *
 * @author Romy
 */
public class SecuriteHelper {
     public static boolean isMotDePasseValide(String mdp) {
    boolean resultat = true;

    if (mdp == null) {
      resultat = false;
      throw new IllegalArgumentException("le mot de passe n'est pas renseigne");
    } else {

      if (mdp.length() < 6 || mdp.length() > 15) {
        resultat = false;
      }

      if (!mdp.matches(".*[a-zA-Z]*[0-9]*[a-zA-Z]")) {
        resultat = false;
      }
    }
    return resultat;
  }
}

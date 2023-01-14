package com.exo.correction.exercice.dtos;

/**
 * @author Abderrahmane
 */

public class LoginUser {
   private String login;
   private String mdp;

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getMdp() {
      return mdp;
   }

   public void setMdp(String mdp) {
      this.mdp = mdp;
   }
}

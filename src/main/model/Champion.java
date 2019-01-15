package main.model;

import main.enums.Role;

import java.util.ArrayList;

/**
 * Created by RachaelDaly on 12/13/18.
 */
public class Champion {

  private String champ_name;
  private ArrayList<Role> roles;

  public Champion(String name){
    roles = new ArrayList<>();
    champ_name = name;
  }

  public String getChamp_name(){
    return this.champ_name;
  }

  public ArrayList<Role> getRoles(){
    return this.roles;
  }

  public void addRole(Role role){
    if (!roles.contains(role)) {
      roles.add(role);
    }
  }
}

package main.controller;

import main.enums.Role;
import main.model.Champion;
import main.model.ChampionList;
import main.model.ReadInChampions;

import java.util.ArrayList;

/**
 * Created by RachaelDaly on 12/13/18.
 */
public class RoleStorage {

  private ChampionList junglers;
  private ChampionList tops;
  private ChampionList mids;
  private ChampionList bots;
  private ChampionList sups;

  public RoleStorage(){
    junglers = new ChampionList();
    bots = new ChampionList();
    sups = new ChampionList();
    tops = new ChampionList();
    mids = new ChampionList();
    ReadInChampions readInChampions = new ReadInChampions();
    sortChampions(readInChampions.getChampions());
  }

  private void sortChampions(ArrayList<Champion> champions){
    for(int x = 0; x < champions.size(); x++){
      placeChampion(champions.get(x));
    }
  }

  public void placeChampion(Champion champ){
    if (champ.getRoles().contains(Role.JUN)){
      junglers.addChampion(champ);
    }
    if (champ.getRoles().contains(Role.MID)){
      mids.addChampion(champ);
    }
    if (champ.getRoles().contains(Role.TOP)){
      tops.addChampion(champ);
    }
    if (champ.getRoles().contains(Role.SUP)){
      sups.addChampion(champ);
    }
    if (champ.getRoles().contains(Role.BOT)){
      bots.addChampion(champ);
    }
  }

  public Champion getRandomTop(){
    return tops.getRandomChampion();
  }

  public Champion getRandomMid(){
    return mids.getRandomChampion();
  }

  public Champion getRandomJun(){
    return junglers.getRandomChampion();
  }

  public Champion getRandomSup(){
    return sups.getRandomChampion();
  }

  public Champion getRandomBot(){
    return bots.getRandomChampion();
  }
}

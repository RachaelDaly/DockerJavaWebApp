package main.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by RachaelDaly on 12/13/18.
 */
public class ChampionList {

  private ArrayList<Champion> champions;

  public ChampionList(){
    champions = new ArrayList<>();
  }

  public Champion getRandomChampion(){
    Random r = new Random();
    int x = r.nextInt(champions.size());
    return champions.get(x);
  }

  public void addChampion(Champion champ){
    if(!champions.contains(champ)){
      champions.add(champ);
    }
  }
}

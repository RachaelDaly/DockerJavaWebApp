package main.model;

import main.enums.Role;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RachaelDaly on 12/14/18.
 */
public class ReadInChampions {

  private ArrayList<Champion> champions;

  public ReadInChampions(){
    champions = new ArrayList<>();
    readFile();
  }

  public ArrayList<Champion> getChampions(){
    return champions;
  }

  private void readChampion(String line){
    List<String> items = new ArrayList<>(Arrays.asList(line.split(",")));
    Champion temp = new Champion(items.get(0));
    for(int x = 1; x < items.size(); x++){
      switch (items.get(x)){
        case "jungle":
          temp.addRole(Role.JUN);
          break;
        case "bottom":
          temp.addRole(Role.BOT);
          break;
        case "support":
          temp.addRole(Role.SUP);
          break;
        case "toplaner":
          temp.addRole(Role.TOP);
          break;
        case "midlaner":
          temp.addRole(Role.MID);
          break;
      }
    }
    champions.add(temp);
  }

  private void readFile(){
    try {
      BufferedReader reader = new BufferedReader(new FileReader("src/docs/championslist"));
      String line;
      while((line = reader.readLine()) != null){
        readChampion(line);
      }
      reader.close();
    }
    catch (Exception e){
      System.out.println("Exception occurred trying to read in Champions.");
      e.printStackTrace();
    }
  }

//  public static void main(String args[]){
//    ReadInChampions re = new ReadInChampions();
//  }
}

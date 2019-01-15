package main;

import main.controller.RoleStorage;

import java.util.Scanner;

/**
 * Runs the program through command line
 */
public class Main {

    public static void main(String[] args) {
    //C:\Users\Rachael\IdeaProjects\WhoToPlay
	// write your code here
        RoleStorage storage = new RoleStorage();
        System.out.println("Welcome to Random Champion! Type 'exit' to quit. Enter your role:");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String request = scanner.nextLine();
            request = request.toLowerCase();
            if (request.equals("jungle")) {
                System.out.println(storage.getRandomJun().getChamp_name());
            }else if(request.equals("mid")){
                System.out.println(storage.getRandomMid().getChamp_name());
            }else if(request.equals("support")){
                System.out.println(storage.getRandomSup().getChamp_name());
            }else if(request.equals("adc")){
                System.out.println(storage.getRandomBot().getChamp_name());
            }else if(request.equals("top")){
                System.out.println(storage.getRandomTop().getChamp_name());
            }else if(request.equals("exit")){
                break;
            }else{
                System.out.println("Not a valid role.");
            }
        }
    }
}

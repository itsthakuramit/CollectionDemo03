package com.stackroute.mar18demo01.newpkg.comp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
	
    public static void main( String[] args ) throws IOException{
    
    	
    	List<Player> playerlist = new ArrayList<>();
    	
    	playerlist.add(new Player(101, "Matts Wilander", "Tennis"));
    	playerlist.add(new Player(99, "Ivan Lendl", "Tennis"));
    	playerlist.add(new Player(50, "Desmond Haynes", "Cricket"));
    	playerlist.add(new Player(121, "Ben Johnson", "Athelete"));
    	playerlist.add(new Player(10, "Carl Lewis", "Athelete"));
    	playerlist.add(new Player(5, "Sachin", "Cricket"));
    	playerlist.add(new Player(1, "Gabriela Sabatini", "Tennis"));
    	playerlist.add(new Player(203, "Martina Hingis", "Tennis"));
    	playerlist.add(new Player(330, "Stephen Edberg", "Tennis"));
    	
    	
    	
//    	Collections.sort(playerlist,new IdComparator());
//    	for(Player pl: playerlist) {
//    		System.out.println(pl);
//    	}
    	
//    	Collections.sort(playerlist,new NameComparator());
//    	for(Player pl: playerlist) {
//    		System.out.println(pl);
//    	}
//    	
//    	Collections.sort(playerlist,new SportsComparator());
//    	for(Player pl: playerlist) {
//    		System.out.println(pl);
//    	}
//    	
    	
    	Collections.sort(playerlist,new SportsPlayerComparator());
    	for(Player pl: playerlist) {
    		System.out.println(pl);
       	}
   	
    	
    	
    	
    }
    
}

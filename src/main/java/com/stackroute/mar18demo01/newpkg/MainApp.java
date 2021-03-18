package com.stackroute.mar18demo01.newpkg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {
	
    public static void main( String[] args ) throws IOException{
    
    	
    	List<Player> playerlist = new ArrayList<>();
    	
    	playerlist.add(new Player(101, "Matts Wilander", "Tennis"));
    	playerlist.add(new Player(99, "Ivan Lendl", "Tennis"));
    	playerlist.add(new Player(121, "Ben Johnson", "Athelete"));
    	playerlist.add(new Player(10, "Carl Lewis", "Athelete"));
    	
    	Collections.sort(playerlist);
    	
    	for(Player pl: playerlist) {
    		System.out.println(pl);
    	}
    	
    }
    
}

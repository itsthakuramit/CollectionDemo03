package com.stackroute.mar18demo01.newpkg.comp;

import java.util.Comparator;

public class IdComparator implements Comparator<Player>{

	@Override
	public int compare(Player pl1, Player pl2) {
		
		if(pl1.getPlayerid() == pl2.getPlayerid()) {
			return 0;
		}else if(pl1.getPlayerid() > pl2.getPlayerid()) {
			return 1;
		}else {
			return -1;
		}
		
		
	}
	
	

}

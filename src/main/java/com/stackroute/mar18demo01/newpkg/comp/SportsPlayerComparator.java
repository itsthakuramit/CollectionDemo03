package com.stackroute.mar18demo01.newpkg.comp;

import java.util.Comparator;

public class SportsPlayerComparator implements Comparator<Player>{

		@Override
		public int compare(Player pl1, Player pl2) {
			
			int temp = pl1.getSports().compareTo(pl2.getSports());
			
			if(temp==0) {
				return pl1.getPlayername().compareTo(pl2.getPlayername());
			}
			return temp;
			
		}
		
		
}
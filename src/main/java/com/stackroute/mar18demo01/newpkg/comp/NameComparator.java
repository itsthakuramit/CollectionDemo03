package com.stackroute.mar18demo01.newpkg.comp;

import java.util.Comparator;

public class NameComparator implements Comparator<Player>{

		@Override
		public int compare(Player pl1, Player pl2) {
			
			return pl1.getPlayername().compareTo(pl2.getPlayername());
			
		}
		
		
}
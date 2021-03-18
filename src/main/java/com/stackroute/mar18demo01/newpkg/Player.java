package com.stackroute.mar18demo01.newpkg;

public class Player implements Comparable<Player>{
	
	private int playerid;
	private String playername;
	private String sports;
	
	public Player(int playerid, String playername, String sports) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.sports = sports;
	
	}
	
	

	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", sports=" + sports + "]";
	}



	@Override
	public int compareTo(Player pl) {
		if(playerid == pl.playerid)
		return 0;
	else if(playerid < pl.playerid)
		return 1;
	else 
		return -1;
	}



//	@Override
//	public int compareTo(Player pl) {
//		
//		if(playerid == pl.playerid)
//			return 0;
//		else if(playerid > pl.playerid)
//			return 1;
//		else 
//			return -1;
//		
//	}
//	
	
	
		
	

}

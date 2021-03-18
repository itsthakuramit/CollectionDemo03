package com.stackroute.mar18demo01.newpkg.comp;

public class Player{
	
	private int playerid;
	private String playername;
	private String sports;
	
	public Player(int playerid, String playername, String sports) {
		this.playerid = playerid;
		this.playername = playername;
		this.sports = sports;
	}
	
	
	public int getPlayerid() {
		return playerid;
	}


	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}


	public String getPlayername() {
		return playername;
	}


	public void setPlayername(String playername) {
		this.playername = playername;
	}


	public String getSports() {
		return sports;
	}


	public void setSports(String sports) {
		this.sports = sports;
	}


	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", sports=" + sports + "]";
	}

	
		
	

}

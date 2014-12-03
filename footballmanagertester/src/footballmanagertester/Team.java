package footballmanagertester;

import java.util.ArrayList;

public class Team 
{
	private String name;
	private int teamid;
	private int balance;
	private int points;
	private boolean active;
	private int wins;
	private int losses;
	private int draws;
	private int goaldif;
	private ArrayList<Player> PlayerList;
	
	public Team(){}
	
	public Team (String name, int teamid, int balance, int points, boolean active,int wins, int losses, int draws, int goaldif)
	{
		this.name = name;
		this.teamid = teamid; 
		this.balance = balance;
		this.points = points;
		this.active = active;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
		this.goaldif = goaldif;
		PlayerList = new ArrayList<Player>();
	}
	
	//Setters for the match class - set what the name implies
	
	public void add(Player p)
	{
		this.PlayerList.add(p);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setTeamid(int teamid)
	{
		this.teamid = teamid;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	public void setPoints(int points)
	{
		this.points = points;
	}
	public void setActive(boolean active)
	{
		this.active = active;
	}
	public void setWins(int wins)
	{
		this.wins = wins;
	}
	public void setLosses(int losses)
	{
		this.losses = losses;
	}
	public void setDraws(int draws)
	{
		this.draws = draws;
	}
	public void setGoaldif(int goaldif)
	{
		this.goaldif = goaldif;
	}
	
	//****************************************************************************
	//Getters for the match class - get what the name implies
	
	public String getName()
	{
		return this.name;
	}
	public int getTeamid()
	{
		return this.teamid;
	}
	public int getBalance()
	{
		return this.balance;
	}
	public int getPoints()
	{
		return this.points;
	}
	public boolean getActive()
	{
		return this.active;
	}
	public int getWins()
	{
		return this.wins;
	}
	public int getLosses()
	{
		return this.losses;
	}
	public int getDraws()
	{
		return this.draws;
	}
	public int getGoaldif()
	{
		return this.goaldif;
	}
}

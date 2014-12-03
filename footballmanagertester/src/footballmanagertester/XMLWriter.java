package footballmanagertester;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XMLWriter 
{
	public static void matchWriter(Match match, BufferedWriter bw) throws IOException
	{
		bw.write("<match>");
		bw.newLine();
		
		String uid = lineMaker("uid",match.getUid());
		uid = indenter(uid,1);
		bw.write(uid);
		bw.newLine();
		
		String points1 = lineMaker("points1",match.getPoints1());
		points1 = indenter(points1,1);
		bw.write(points1);
		bw.newLine();
		
		String points2 = lineMaker("points2",match.getPoints2());
		points2 = indenter(points2,1);
		bw.write(points2);
		bw.newLine();
		
		bw.write("</match>");
		bw.newLine();
	}
	public static void teamWriter(Team team, BufferedWriter bw) throws IOException
	{
		bw.write("<team>");
		bw.newLine();
		
		String name = lineMaker("name",team.getName());
		name = indenter(name,1);
		bw.write(name);
		bw.newLine();
		
		String teamid = lineMaker("teamid",team.getTeamid());
		teamid = indenter(teamid,1);
		bw.write(teamid);
		bw.newLine();
		
		String balance = lineMaker("balance",team.getBalance());
		balance = indenter(balance,1);
		bw.write(balance);
		bw.newLine();
		
		String points = lineMaker("points",team.getPoints());
		points = indenter(points,1);
		bw.write(points);
		bw.newLine();
		
		String ava = "true";
		if(team.getActive() == false)
			ava = "false";
		String active = lineMaker("avtive", ava);
		active = indenter(active,1);
		bw.write(active);
		bw.newLine();
		
		String wins = lineMaker("wins",team.getWins());
		wins = indenter(wins,1);
		bw.write(wins);
		bw.newLine();
		
		String losses = lineMaker("losses",team.getLosses());
		losses = indenter(losses,1);
		bw.write(losses);
		bw.newLine();
		
		String draws = lineMaker("draws",team.getDraws());
		draws = indenter(draws,1);
		bw.write(draws);
		bw.newLine();
		
		String goaldif = lineMaker("goaldif",team.getGoaldif());
		goaldif = indenter(goaldif,1);
		bw.write(goaldif);
		bw.newLine();
		
		bw.write("</team>");
		bw.newLine();
	}
	public static void playerWriter(Player player, BufferedWriter bw) throws IOException
	{
		bw.write("<player>");
		bw.newLine();
		
		//string name
		String name = lineMaker("name", player.getName());
		name = indenter(name,1);
		bw.write(name);
		bw.newLine();
		
		//double attack
		String attack = lineMaker("attack", player.getAttack());
		attack = indenter(attack,1);
		bw.write(attack);
		bw.newLine();
		
		//double defense
		String defense = lineMaker("defense", player.getDefense());
		defense = indenter(defense,1);
		bw.write(defense);
		bw.newLine();
		
		//double goalkeeping
		String goalkeeping = lineMaker("goalkeeping", player.getGoalkeeping());
		goalkeeping = indenter(goalkeeping,1);
		bw.write(goalkeeping);
		bw.newLine();
		
		//double staminafactor
		String staminafactor = lineMaker("staminafactor", player.getStaminafactor());
		staminafactor = indenter(staminafactor,1);
		bw.write(staminafactor);
		bw.newLine();
		
		//double stamina
		String stamina = lineMaker("stamina", player.getStamina());
		stamina = indenter(stamina,1);
		bw.write(stamina);
		bw.newLine();
		
		//int position
		String position = lineMaker("position", player.getPosition());
		position  = indenter(position,1);
		bw.write(position);
		bw.newLine();
		
		//int aggression
		String aggression = lineMaker("aggression", player.getAggression());
		aggression = indenter(aggression,1);
		bw.write(aggression);
		bw.newLine();
		
		//int price
		String price = lineMaker("price", player.getPrice());
		price = indenter(price,1);
		bw.write(price);
		bw.newLine();
		
		//int teamid
		String teamid = lineMaker("teamid", player.getTeamid());
		teamid = indenter(teamid,1);
		bw.write(teamid);
		bw.newLine();
		
		//int card
		String card = lineMaker("card", player.getCard());
		card = indenter(card,1);
		bw.write(card);
		bw.newLine();
		
		//int injury
		String injury = lineMaker("injuryleft", player.getInjuryleft());
		injury = indenter(injury,1);
		bw.write(injury);
		bw.newLine();
		
		//boolean forsale
		String ava = "true";
		if(player.getForsale() == false)
			ava = "false";
		String forsale = lineMaker("forsale", ava);
		forsale = indenter(forsale,1);
		bw.write(forsale);
		bw.newLine();
		bw.write("</player>");
		bw.newLine();
	}
	/**
	 * creates the xml line for the given tag and element
	 * @param tag
	 * @param element - String
	 * @return
	 */
	public static String lineMaker(String tag, String element)
	{
		String ret = "";
		ret = "<" + tag + ">" + element + "</" + tag + ">";
		return ret;
	}
	/**
	 * creates the xml line for the given tag and element
	 * @param tag
	 * @param element - int
	 * @return
	 */
	public static String lineMaker(String tag, int element)
	{
		String ret = "";
		ret = "<" + tag + ">" + element + "</" + tag + ">";
		return ret;
	}
	/**
	 * creates the xml line for the given tag and element
	 * @param tag
	 * @param element - double
	 * @return
	 */
	public static String lineMaker(String tag, double element)
	{
		String ret = "";
		ret = "<" + tag + ">" + element + "</" + tag + ">";
		return ret;
	}
	/**
	 * indents the input string a given number of times
	 * used for formatting in the xml file
	 * @param str
	 * @param indents
	 * @return
	 */
	public static String indenter(String str, int indents)
	{
		for(int i = 0; i < indents; i++)
		{
			str = "    " + str;
		}
		return str;
	}
}

package footballmanagertester;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser
{	
	/**
	 * Creates a nodelist from the given filepath, using
	 * input tag as nodes.
	 * @param file - filepath
	 * @param tag - tag to makes nodes by
	 * @return
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static NodeList makeNL(String file, String tag) throws ParserConfigurationException, SAXException, IOException
	{
		NodeList ret;
		File players = new File(file);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(players);
		doc.getDocumentElement().normalize();
		ret = doc.getElementsByTagName(tag);
		return ret;
	}
	
	/**
	 * Takes in an arraylist of players and an arraylist of
	 * teams and assigns players to the appropriate team
	 * @return - returns an arraylist of teams with the 
	 * 			 appropriate players in them.
	 */
	public static ArrayList<Team> playerAssigner(ArrayList<Team> teamList, ArrayList<Player> playerList)
	{
		for(int i = 0; i < teamList.size(); i++)
		{
			for(int f = 0; f < playerList.size(); f++)
			{
				if(teamList.get(i).getName().equals(playerList.get(f).getName()))
						teamList.get(i).add(playerList.get(f));
			}
		}
		return teamList;
	}
	
	/**
	 * Takes in the NodeList of "player" and
	 * returns an arraylist of players
	 * @param player
	 * @return
	 */
	public static ArrayList<Player> createPM(NodeList player)
	{
		ArrayList<Player> playerList = new ArrayList<Player>();
		Player evan = new Player();
		for (int i = 0; i < player.getLength(); i++) 
		{
			Node node = player.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element) node;
			
				String name = getValue("name", element);
			
				String att = getValue("attack", element);
				double attack = Double.parseDouble(att);
			
				String def = getValue("defense", element);
				double defense = Double.parseDouble(def);
				
				String gk = getValue("goalkeeping", element);
				double goalkeeping = Double.parseDouble(gk);
			
				String stamf = getValue("staminafactor", element);
				double staminafactor = Double.parseDouble(stamf);
			
				String stam = getValue("stamina", element);
				double stamina = Double.parseDouble(stam);
			
				String pos = getValue("position", element);
				int position = Integer.parseInt(pos);
			
				String agg = getValue("aggression", element);
				double aggression = Double.parseDouble(agg);
			
				String pr = getValue("price", element);
				int price = Integer.parseInt(pr);
			
				String team = getValue("teamid", element);
				int teamid = Integer.parseInt(team);
			
				String c = getValue("card", element);
				int card = Integer.parseInt(c);
			
				String inj = getValue("injuryleft", element);
				int injuryleft = Integer.parseInt(inj);
			
				String ava = getValue("forsale", element);
				boolean forsale = false;
				if(ava.equals("true"))
					forsale = true;
			
				evan = new Player(name, attack, defense, goalkeeping, staminafactor, stamina, position, aggression, price, teamid, card, injuryleft, forsale);
			}
			playerList.add(evan);
		}
		return playerList;
	}
	
	/**
	 * Method takes in the NodeList from "team" and 
	 * returns an arraylist of teams.
	 * @param team
	 * @return
	 */
	public static ArrayList<Team> createTM(NodeList team)
	{
		ArrayList<Team> teamList = new ArrayList<Team>();
		ArrayList<Player> players = new ArrayList<Player>();
		Team teamEvan = new Team();
		for (int i = 0; i < team.getLength(); i++) 
		{
			Node node = team.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element) node;
			
				String name = getValue("teamname", element);
				
				String tid = getValue("teamid", element);
				int teamid = Integer.parseInt(tid);
				
				String dolladollabillsyo = getValue("balance", element);
				int balance = Integer.parseInt(dolladollabillsyo);
				
				String point = getValue("points", element);
				int points = Integer.parseInt(point);
				
				String act = getValue("active", element);
				boolean active = false;
				if(act.equals("true"))
					active = true;
				
				String win = getValue("wins", element);
				int wins = Integer.parseInt(win);
				
				String loss = getValue("losses", element);
				int losses = Integer.parseInt(loss);
				
				String draw = getValue("draws", element);
				int draws = Integer.parseInt(draw);
				
				String goal = getValue("goaldif", element);
				int goaldif = Integer.parseInt(goal);
			
				teamEvan = new Team(name,teamid,balance,points,active,wins,losses,draws,goaldif);
			}
			teamList.add(teamEvan);
		}
		return teamList;
	}
	
	//MATCH CREATOR (createMM) STILL NEEDS COMPLETING
	
	/**
	 * Takes in the NodeList for "match" and 
	 * returns an arraylist of matches
	 * @param match
	 * @return
	 */
	public static ArrayList<Match> createMM(NodeList match)
	{
		ArrayList<Match> matchList = new ArrayList<Match>();
		ArrayList<String> events = new ArrayList<String>();
		Match evansMatch = new Match();
		for (int i = 0; i < team.getLength(); i++) 
		{
			Node node = team.item(i);
			if(node.getNodeType() == Node.ELEMENT_NODE)
			{
				Element element = (Element) node;
			
				String id = getValue("uid", element);
				int uid = Integer.parseInt(id);
				
				String p1 = getValue("points1", element);
				int points1 = Integer.parseInt(p1);
				
				String p2 = getValue("points2", element);
				int points2 = Integer.parseInt(p2);
				
				for(int f = 1; f <= node.getChildNodes().getLength() - 3; f++)
				{
					String tag = "event" + f;
					String event = getValue(tag, element);
					events.add(event);
				}
			
				evansMatch = new Match(uid, points1, points2, events);
			}
			matchList.add(evansMatch);
		}
		return matchList;
	}

	/**
	 * gets the value from the html tag in the form
	 * of a string
	 * @param tag - tag of element you want
	 * @param element - just needs to be element, doesnt matter
	 * @return
	 */
	private static String getValue(String tag, Element element) 
	{
		NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodes.item(0);
		return node.getNodeValue();
	}
}
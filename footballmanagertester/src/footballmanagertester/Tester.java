package footballmanagertester;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
 
public class Tester 
{
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		String name = "as;dlfkvjaslgfovnaqw";
		double attack = 100;
		double defense = 100;
		double goalkeeping = 100;
		double staminafactor = 100;
		double stamina = 100;
		int position = 1; // 0-keeper, 1-aanvaller, 2-verdediger, 3-middenvelder
		double aggression = 10;
		int price = 100;
		int teamid = 100;
		int card = 0; // 0-geen, 1-geel, 2-rood
		int injuryleft = 0;
		boolean forsale = true;
		Player paul = new Player(name, attack, defense, goalkeeping, staminafactor, stamina, position, aggression, price, teamid, card, injuryleft, forsale);
		try 
		{
			File file = new File("outfile.xml");
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			XMLWriter.playerWriter(paul, bw);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//*********************************************************************************************
		
		NodeList nd = XMLParser.makeNL("outfile.xml", "player");
		ArrayList<Player> playerlist = XMLParser.createPM(nd);
		System.out.println(playerlist.get(0).getName());
		playerlist.get(0).setName("blart - mall cop");
		System.out.println(playerlist.get(0).getName());
		System.out.println(playerlist.get(0).getAggression());
	}
}
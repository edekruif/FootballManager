package footballmanagertester;

public class Player 
{
	private String name;
	private double attack;
	private double defense;
	private double goalkeeping;
	private double staminafactor;
	private double stamina;
	private int position; // 0-keeper, 1-aanvaller, 2-verdediger, 3-middenvelder
	private double aggression;
	private int price;
	private int teamid;
	private int card; // 0-geen, 1-geel, 2-rood
	private int injuryleft;
	private boolean forsale;
	
	public Player(){}
	public Player(String name, double attack, double defense, double goalkeeping,double staminafactor, double stamina,int position, double aggression, int price, int teamid, int card, int injuryleft, boolean forsale)
	{
		this.name = name;
		this.attack = attack;
		this.defense = defense;
		this.goalkeeping = goalkeeping;
		this.staminafactor = staminafactor;
		this.stamina = stamina;
		this.position = position;
		this.aggression = aggression;
		this.price = price;
		this.teamid = teamid;
		this.card = card;
		this.injuryleft = injuryleft;
		this.forsale = forsale;
	}
	
	/*
	 * SETTERS - the name of the setter implies which attribute it sets.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAttack(double attack)
	{
		this.attack = attack;
	}
	public void setDefense(double defense)
	{
		this.defense = defense;
	}
	public void setGoalkeeping(double goalkeeping)
	{
		this.goalkeeping = goalkeeping;
	}
	public void setStaminafactor(double staminafactor)
	{
		this.staminafactor = staminafactor;
	}
	public void setStamina(double stamina)
	{
		this.stamina = stamina;
	}
	public void setPosition(int position)
	{
		this.position = position;
	}
	public void setAggression(double aggression)
	{
		this.aggression = aggression;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public void setTeamid(int teamid)
	{
		this.teamid = teamid;
	}
	public void setCard(int card)
	{
		this.card = card;
	}
	public void setInjuryleft(int injuryleft)
	{
		this.injuryleft = injuryleft;
	}
	public void setForsale(boolean forsale)
	{
		this.forsale = forsale;
	}
	
	/*
	 * GETTERS - the getters get the attribute that the name implies they do.
	 */
	
	public String getName()
	{
		return this.name;
	}
	public double getAttack()
	{
		return this.attack;
	}
	public double getDefense()
	{
		return this.defense;
	}
	public double getGoalkeeping()
	{
		return this.goalkeeping;
	}
	public double getStaminafactor()
	{
		return this.staminafactor;
	}
	public double getStamina()
	{
		return this.stamina;
	}
	public int getPosition()
	{
		return this.position;
	}
	public double getAggression()
	{
		return this.aggression;
	}
	public int getPrice()
	{
		return this.price;
	}
	public int getTeamid()
	{
		return this.teamid;
	}
	public int getCard()
	{
		return this.card;
	}
	public int getInjuryleft()
	{
		return this.injuryleft;
	}
	public boolean getForsale()
	{
		return this.forsale;
	}
}


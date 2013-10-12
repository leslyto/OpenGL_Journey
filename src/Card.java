
public class Card {
	//private
	private String type;
	private String suit;
	private int value;
	
	//private function
	
	private int evalValue(String ff_type)
	{
		switch(ff_type)
		{
		case "Two":
			return 2;
		case "Three":
			return 3;
		case "Four":
			return 4;
		case "Five":
			return 5;
		case "Six":
			return 6;
		case "Seven":
			return 7;
		case "Eight":
			return 8;
		case "Nine":
			return 9;
		case "Ten":
			return 10;
		case "Jack":
			return 11;
		case "Queen":
			return 12;
		case "King":
			return 13;
		case "Ace":
			return 14;
		default:
			return 0;
		}
	}
	
	//constructor //SLOJI FUNKCIQ VALUE = TYPE
	public Card(String f_type,String f_suit)
	{
		type = f_type;
		suit = f_suit;
		value = evalValue(type);
	}
	
	//public
	public void setType(String typeln)
	{
		type = typeln;
	}
	public void setSuit(String suitln)
	{
		suit = suitln;
	}
	public void setValue(int valueln)
	{
		value = valueln;
	}
	public String getType()
	{
		return type;
	}
	public String getSuit()
	{
		return suit;
	}
	public int getValue()
	{
		return value;
	}
}

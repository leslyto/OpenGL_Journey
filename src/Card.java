
public class Card {
	//private
	private String type;
	private String suit;
	private int value;
	
	//constructor //SLOJI FUNKCIQ VALUE = TYPE
	public Card(String f_type,String f_suit)
	{
		type = f_type;
		suit = f_suit;
		int test = 30;
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

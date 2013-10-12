
public class Deck{
	
/// Private //////////////////////////////////////////////////////////////////////////////////	
	
	private Card[] cards = new Card[52]; //Cards in deck

	private Card[] delt = new Card[52]; //Cards already delt 
	
/// Private Func /////////////////////////////////////////////////////////////////////////////	
	
	private String returnType(int f_type)
	{
		switch(f_type){
		
		case 0:
			return "Two";
		case 1:
			return "Three";
		case 2:
			return "Four";
		case 3:
			return "Five";
		case 4:
			return "Six";
		case 5:
			return "Seven";
		case 6:
			return "Eight";
		case 7:
			return "Nine";
		case 8:
			return "Ten";
		case 9:
			return "Jack";
		case 10:
			return "Queen";
		case 11:
			return "King";
		case 12:
			return "Ace";	
		default :
			return null;
		}		
	}
	
	private String returnSuit(int f_suit)
	{
		switch(f_suit)
		{
		case 0:
			return "Hearts";
		case 1:
			return "Spades";
		case 2:
			return "Clubs";
		case 3:
			return "Diamonds";
		default:
			return null;
		}
	}
	
/// Public ///////////////////////////////////////////////////////////////////////////////////
	
	public Card getCard(int f_position)
	{
		return  cards[f_position];
	}
	
	public Card findDeltCard(String f_type,String f_suit )
	{
		for(short i = 0;i<delt.length;i++)
		{
			if(delt[i].getType() == f_type)
			{
				if(delt[i].getSuit() == f_suit)
				{
					return delt[i];
				}
			}
				
		}
		
		System.out.println("Card("+f_type+" "+f_suit+") could not be found");// for deletion
		return null;
	}
	
	
/// Constructor //////////////////////////////////////////////////////////////////////////////	
	
	public Deck() 
	{
		int temp_pos;
		
		for(short i = 0; i <13;i++)
		{
			for(short b = 0; b < 4 ; b++)// 0 - 
			{
				cards[temp_pos] = new Card(returnType(i),returnSuit(b));
				temp_pos++;
			}
		}
	}
	
}

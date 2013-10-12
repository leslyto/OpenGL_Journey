import java.util.Random;

public class Deck{
	
/// Private //////////////////////////////////////////////////////////////////////////////////	
	
	private Card[] cards = new Card[52]; //Cards in deck

	private Card[] delt = new Card[52]; //Cards already delt 
	
/// Private Func /////////////////////////////////////////////////////////////////////////////	
	
	private void shuffle(Card[] c_cards)
	{
		Random rand_num_gen = new Random();
		Card temp = null;
		
		
		for(short i = 0;i<(c_cards.length);i++)
		{
		   int random_num = rand_num_gen.nextInt(c_cards.length);
		   temp = c_cards[i];
		   c_cards[i] = c_cards[random_num];
		   c_cards[random_num] = temp;
		}
	}
	
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
		int temp_pos = 0;
		
		for(short i = 0; i <13;i++)
		{
			for(short b = 0; b < 4 ; b++)// 0 - 
			{
				cards[temp_pos] = new Card(returnType(i),returnSuit(b));
				temp_pos++;
			}
		}
		
		shuffle(cards);
	}
	
}

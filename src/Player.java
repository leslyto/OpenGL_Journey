
public class Player {
	//private
	private Card[] current_deck = new Card[52];
	private Card[] graveyard = new Card[52];
	
	//private func.
	
	private void move_cards(int num_o_cards) // moves cards one up
	{
		int circ = 0;
		do{
			for(short i = 0;i<current_deck.length;i++)
			{
				current_deck[i] = current_deck[i+1];
			}
			circ++;
		}while(circ < num_o_cards);
	}
	
	//testfunc
	public void setDeck(Card[] pd)
	{
		current_deck = pd;
	}
	
	//Constructor
	public Player()
	{
		current_deck = null;
		graveyard = null;
	}
	
	//public
	
	private Card[] playWar()
	{
		Card[] p_card = {current_deck[0],current_deck[1],current_deck[2]}; 
		move_cards(3);
		return p_card;
	}

	public Card playCard()
	{
		Card p_card = current_deck[0];
		move_cards(1);
		return p_card;
	}
	
	
	
}

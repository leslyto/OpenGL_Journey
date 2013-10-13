
public class Main {

	public static void main(String[] args) {
		
		Deck mydeck = new Deck();
		Player player = new Player();
		//test
		for(short i = 0;i<52;i++)
		player.setDeck(mydeck.getCard(i));
		
		
		
		System.out.println(mydeck.getCard(46).getType());
		System.out.println(mydeck.getCard(46).getSuit());
		System.out.println(mydeck.getCard(46).getValue());
		

	}

}

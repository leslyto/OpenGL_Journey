
public class Main {

	public static void main(String[] args) {
		
		Deck mydeck = new Deck();
		
		System.out.println(mydeck.getCard(46).getType());
		System.out.println(mydeck.getCard(46).getSuit());
		System.out.println(mydeck.getCard(46).getValue());
		

	}

}

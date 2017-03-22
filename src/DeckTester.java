/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		String[] ranks = {"A", "B", "C"};
		String [] suits = {"Giraffes", "Lions"};
		int [] values = {2,1,6};
		Deck a = new Deck(ranks, suits, values);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.deal());
		System.out.println(a.deal());
		System.out.println(a.deal());
		System.out.println(a.deal());
		System.out.println(a.deal());
		System.out.println(a.deal());
		System.out.println(a.deal());
		String [] ranks2 = {"2", "3", "4", "5", "6", "7", "8", "9" ,"10", "Jack", "Queen", "King", "Ace"};
		String [] suits2 = {"spades", "hearts", "diamonds", "clubs"};
		int [] values2 = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		Deck b = new Deck(ranks2, suits2, values2);
		System.out.println(b.size());
	}
}

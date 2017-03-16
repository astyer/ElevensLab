/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a = new Card("Ace", "Spaids", 4);
		Card b = new Card("Ace", "Spaids", 4);
		Card c = new Card("Ace", "Hearts", 4);
		System.out.println(a.matches(b));
		System.out.println(a.toString());
	}
}

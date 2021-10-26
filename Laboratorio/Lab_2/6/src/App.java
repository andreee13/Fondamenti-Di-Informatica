
public class App {

	public static void main(String[] args) {
		final int random = 584;
		final String[] array = Integer.toString(random).split("");
		for(String s : array) {
			System.out.print(s+" ");
		}
	}
	
}
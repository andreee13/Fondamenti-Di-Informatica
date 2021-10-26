
public class App {

	public static void main(String[] args) {
		int base = 7, n = 658;
		final StringBuilder stringBuilder = new StringBuilder();
		while (n > 0) {
			stringBuilder.append(n % base);
			n = (int) n / base;
		}
		System.out.println(stringBuilder.reverse());
	}

}

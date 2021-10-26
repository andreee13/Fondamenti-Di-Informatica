
public class App {

	public static void main(String[] args) {
		float circleRadius = 10.12f;
		final float pi = 3.14159265358979f;
		float circumference = 2 * pi * circleRadius;
		System.out.printf("***La circonferenza di un cerchio di raggio %f e' pari a %f***", circleRadius,
				circumference);
		float circleArea = pi * circleRadius * circleRadius;
		System.out.printf("\n***L'area di un cerchio di raggio %f e' pari a %f***", circleRadius, circleArea);
	}

}

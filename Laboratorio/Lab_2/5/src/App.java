
public class App {

	public static void main(String[] args) {
		float cilindreRadius = 10.12f;
		float cilindreHeight = 10.87f;
		final float pi = 3.14159265358979f;
		final float cilindreBaseArea = 2 * cilindreRadius * pi;
		final float cilindreVolume = cilindreBaseArea * cilindreHeight;
		System.out.printf("***Il volume del cilindro di raggio %f e altezza %f e' pari a %f***", cilindreRadius,
				cilindreHeight, cilindreVolume);
	}

}


public class App {
	public static void main(String[] args) {
		int y = 2021;
		int a = y % 19;
		int b = (int)y/100;
		int c = y%100;
		int d = (int)b/4;
		int e = b%4;
		int g = (int)(8*b+13)/25;
		int h = (19*a+b-d-g+15)%30;
		int j = (int) c/4;
		int k = c%4;
		int m = (int)(a+11*h);
		int r = (2*e+2*j-k-h+m+32)%7;
		int n = (h-m+r+90)%25;
		int p = (h-m+r+n+19)%32;
		System.out.println(p);
		System.out.println(n);
		System.out.println(y);
	}
	
}
package ke5;

public class LambdaCalculateTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double multi = 3;
		// sollte final
		// w�re Fehler
		// multi = 8;

		// Implementierung Interface �ber Lambda Ausdruck
		Rectangle rect0 = (l,w) -> 5.0;
		Rectangle rect1 = (l,w) ->  {return l * w;};
		Rectangle rect2 = (l,w) -> {l = l * multi; w = w* multi; return l * w;};

		System.out.println("Fl�che: " + rect1.getArea(4, 3));
	}

}

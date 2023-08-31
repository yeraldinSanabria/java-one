
public class TessMain {

	public static void main(String[] args) {
		int[] edades = new int[5];
		edades[2] = 30;

		int tamanoArray = edades.length;
		System.out.println(tamanoArray);

		for (int i = 0; i < tamanoArray; i++) {
			System.out.println(edades[i]);
		}
	}

}

package application;

import java.io.FileNotFoundException;

public class Main {

	/**
	 * @param args Default parameter.
	 * @throws FileNotFoundException Used to throw an exception if the file is not
	 *                               found.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		controller.initialize();
	}
}

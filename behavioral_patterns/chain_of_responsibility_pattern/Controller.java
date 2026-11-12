package chain_of_responsibility_pattern;

public class Controller implements Handler{

	@Override
	public void handle(Request request) {
		System.out.println("Controller Logic");
		
	}

}
package chain_of_responsibility_pattern;

public class AuthHandler implements Handler{

	@Override
	public void handle(Request request) {
		if(!request.headers.containsKey("Authorization"))
		{
			throw new RuntimeException("Not Authenticated");
		}
		else
		{
			System.out.println("Auth ok");
		}
		
	}

}
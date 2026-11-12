package flyweight_pattern;

public class CLR implements Platform{

	public CLR()
	{
		System.out.println("CLR Created");
	}
	@Override
	public void execute(String code) {
		System.out.println("Code execute on CLR");
	}

}
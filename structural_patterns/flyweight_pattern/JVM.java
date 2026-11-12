package flyweight_pattern;

public class JVM implements Platform{

	public JVM()
	{
		System.out.println("JVM Created");
	}
	@Override
	public void execute(String code) {
		System.out.println("Code execute on JVM");
	}

}
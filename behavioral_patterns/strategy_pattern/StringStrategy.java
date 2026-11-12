package strategy_pattern;

public class StringStrategy implements ComparableStrategy{

	@Override
	public void compare() {
		System.out.println("String comparison");
		
	}
	
}

package strategy_pattern;

public class StrategyDemo {
	public static void main(String[]args)
	{
		ComparableStrategy strategy = new StringStrategy();
		strategy = new IntStrategy();
		SortingAlgorithm algo = new SortingAlgorithm();
		algo.setStrategy(strategy);
		
		algo.sort();
	}
}

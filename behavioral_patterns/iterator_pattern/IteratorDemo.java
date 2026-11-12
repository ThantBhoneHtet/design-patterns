package iterator_pattern;

public class IteratorDemo {
    public static void main(String[]args)
	{
		StringContainer con =new StringContainer("Hello World");
		
		char[] arr = new char[] {'A','B','C'};
		ArrayContainer con2 = new ArrayContainer(arr);
		
		Iterable<Character> iterator = con2.createIterator();
		while(iterator.hasNext())
		{
			System.out.println("Next "+iterator.next());
		}
	}
}

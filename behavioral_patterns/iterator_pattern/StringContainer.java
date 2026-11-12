package iterator_pattern;

public class StringContainer implements Iterator<Character>{
	String content;
	public StringContainer(String content)
	{
		this.content = content;
	}
	@Override
	public Iterable<Character> createIterator() {
		return new StringIterator();
	}
	class StringIterator implements Iterable<Character>
	{
		int index =0;
		
		@Override
		public Character next() {
			return content.charAt(index++);
		}

		@Override
		public boolean hasNext() {
			return index < content.length();
		}
		
	}
}

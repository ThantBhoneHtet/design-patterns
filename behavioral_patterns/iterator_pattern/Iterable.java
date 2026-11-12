package iterator_pattern;

public interface Iterable<T> {
	T next();
	boolean hasNext();
}
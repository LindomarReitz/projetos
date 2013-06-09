package patterns.comportamental.strategy;

import java.util.List;

public interface ISorter {
	public <T extends Comparable<? super T>> List<T> sort(List<T> list);
}
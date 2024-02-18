import java.util.Arrays;

public class SortedList extends IntegerList{
	public SortedList(){
		super();
	}
	public SortedList(int capacity) {
		super(capacity);
	}
	
	public void add(int integer) {
		int index = 0;
		for (int i = 0; i < super.size(); i++) {
			if(integer > super.get(i)) {
				index = i + 1;
			}
		}
		super.insert(index, integer);
	}
	
	public void insert(int index, int integer) {
		throw new UnsupportedOperationException();
	}
}

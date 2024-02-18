
public class UniqueList extends IntegerList{
	
	public UniqueList() {
		super();
	}
	public UniqueList(int capacity) {
		super(capacity);
	}
	
	public void add(int integer) {
		boolean found = false;
		
		for(int i = 0; i < super.size(); i++) {
			if(super.get(i) == integer) {
				found = true;
			}
		}
		
		if (found) {
			throw new IllegalArgumentException("The integer " + Integer.toString(integer) + " is already in the list.");
		}
		else {
			super.add(integer);
		}
		
	}
	
	public void insert(int index, int integer) {
		boolean found = false;
		
		for (int i = 0; i < super.size(); i++) {
			if(integer == super.get(i)) {
				found = true;
			}
		}
		
		if (found) {
			throw new IllegalArgumentException("The integer " + Integer.toString(integer) + " is already in the list.");
		}
		else {
			super.insert(index, integer);
		}
	}
}


public class RangeList extends IntegerList{
	public RangeList() {
		super();
	}
	public RangeList(int lowerBound, int upperBound) {
		super();
		
		if (lowerBound > upperBound) {
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		}
		else {
				for (int i = lowerBound, k = 0; i <= upperBound; i++, k++) {
					super.insert(k, i);
				}
		}
		
	}
	
	public void add(int lowerBound,int upperBound) {
		
		if (lowerBound > upperBound) {
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		}
		if (super.size() == 0) {
			for (int i = lowerBound; i <= upperBound; i++) {
				super.insert(super.size(), i);
			}
		}
		
		int lowNum = super.get(0);
		if (lowerBound < lowNum) {
			int count = lowNum - lowerBound;
			for (int i = 0; i < count; i++) {
				super.insert(i, lowerBound + i);
			}
		}
		
		int highNum = super.get(super.size() - 1);
		if (upperBound > highNum){
			int count = upperBound - highNum;
			for (int i = 1; i <= count; i++) {
				super.insert(super.size(), highNum + i);
			}
		}
	}
	
	public void remove(int lowerBound, int upperBound) {
		if (lowerBound > upperBound) {
			throw new IllegalArgumentException("The upper bound must be greater than or equal to the lower bound.");
		}
		if (size() == 0) {
			throw new UnsupportedOperationException("Cannot remove range from an empty list.");
		}
		if(lowerBound < super.get(0) || upperBound > super.get(super.size() - 1)) {
			throw new IllegalArgumentException("Lower and/or upper bounds are out of the current list range.");
		}
		if (!(lowerBound == super.get(0) || upperBound == super.get(super.size() - 1))) {
			throw new IllegalArgumentException("Cannot remove non-terminal ranges.");
		}
		
		int indexLow = 0;
		for (int i = 0; i < super.size(); i++) {
			if (super.get(i) == lowerBound) {
				indexLow = i;
			}
		}
		
		for (int i = indexLow, k = lowerBound; k <= upperBound; k++) {
			super.remove(i);
		}
			
		
	}
	
	public void insert(int index, int integer) {
		throw new UnsupportedOperationException();
	}
	
	public void add(int integer) {
		throw new UnsupportedOperationException();
	}
}
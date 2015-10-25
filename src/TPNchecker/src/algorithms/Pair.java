package algorithms;

public class Pair<T> {
	private T t1;
	private T t2;
	
	public Pair(T t1, T t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public T getT1() {
		return t1;
	}
	
	public T getT2() {
		return t2;
	}
	
	@Override
	public boolean equals(Object obj) {
		Pair other = (Pair)obj;
		
		if (t1.equals(other.getT1()) &&
				t2.equals(other.getT2())) {
			return true;
		}
		
		if (t1.equals(other.getT2()) &&
				t2.equals(other.getT1())) {
			return true;
		}
		
		return false;
	}
}
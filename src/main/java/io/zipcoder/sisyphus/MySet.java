package io.zipcoder.sisyphus;

public class MySet<T> extends MyList<T> {

	public MySet() {
		super();
	}

	public MySet(T t) {
		super(t);
	}

	public int getSetSize() {
		return getListSize();
	}
	
	@Override
	public void add(T t){
		if (!super.contains(t)){
			super.add(t);
		}
	}
	

}

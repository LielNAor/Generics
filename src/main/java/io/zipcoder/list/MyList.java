package io.zipcoder.list;

public class MyList<T> {
	private int listSize;
	private Object[] cells;

	public MyList(){
		this.listSize = 0; 
	}
	
	public MyList(T t) {
		this.listSize = 1;
		this.cells =  new Object[1];
		this.cells[0] = t ;
	}

	public int getListSize() {
		return listSize;
	}

	public void add(T t){
		listSize++;
		expendList();
		cells[cells.length-1] = t;
	}

	private void expendList() {
		Object[] temp = new Object[listSize];
		for (int i=0 ; i<cells.length;i++){
			temp[i] = cells[i];
		}
		this.cells = temp;

	}

	public T remove() {
		listSize--;
		return (T) cells[listSize];
	}

	public T get(int i) {
		if(i>=listSize || i<0){
			return null;
		}
		return (T) cells[i];
	}

	public void set(int i, T t) {
		if(i<=listSize-1 && i>=0){
			cells[i]=t;
		}
	}

	public void clear() {
		listSize = 0;
	}

	public boolean isEmpty() {
		if (listSize==0){
			return true;
		}
		return false;
	}

	public boolean contains(T t) {
		boolean result = false;
		for(int i = 0; i<listSize; i++){
			if(cells[i].equals(t)){
				return true;
			}
		}
		return result;
	}


}

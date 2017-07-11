package io.zipcoder.list;

public class MyList<T> {
	private int listSize;
	private T[] cells;

	public MyList(){
		this.listSize = 0; 
	}
	
	public MyList(T t) {
		this.listSize = 1;
		this.cells = (T[]) new Object[1];
		this.cells[0] = t ;
	}

	public int getListSize() {
		return listSize;
	}

	public void add(T t){
		listSize++;
		this.cells = copyOldList(cells, t);
	}

	private T[] copyOldList(T[] cells, T t) {
		T[] temp = (T[]) new Object[listSize];
		for (int i=0 ; i<cells.length;i++){
			temp[i] = cells[i];
		}
		temp[cells.length] = t;
		return temp;
	}

	public T remove() {
		listSize--;
		return cells[listSize];
	}

	public T get(int i) {
		return cells[i];
	}

	public void set(int i, T t) {
		if(i<=listSize-1){
			cells[i]=t;
		}
	}

	public void clear() {
		listSize = 0;
	}


}

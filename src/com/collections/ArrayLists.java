package com.collections;

public class ArrayLists extends Lists implements Collections {

	private Object[] array = new Object[10];
	private Object[] arrayCoppy;
	private int index = 0;

	protected Object[] copyArray() {
		
		this.arrayCoppy = new Object[this.array.length * 2];
		for (int i = 0; i < this.array.length; i++) {
			this.arrayCoppy[i] = this.array[i];
		}

		return this.arrayCoppy;
	}

	@Override
	public boolean contains(Object o) {

		boolean doesExist = false;

		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == o) {
				doesExist = true;
				break;
			}
		}

		return doesExist;
	}

	@Override
	public boolean remove(Object o) {

		boolean remove = false;

		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == o) {
				this.array[i] = null;
				this.index--;
				remove = true;
				break;
			}
		}

		return remove;
	}

	@Override
	public boolean add(Object o) {

		if (this.index == this.array.length - 1) {
			this.array = this.copyArray();
		}

		array[this.index] = o;
		this.index++;

		return true;
	}

	@Override
	public void clear() {
		for (int i = 0; i < this.array.length; i++) {
			this.array[i] = null;
		}
		this.index = 0;
	}

	@Override
	public int size() {
		return this.index;
	}

	@Override
	public boolean isEmpty() {

		boolean isEmpty = false;

		if (this.index == 0)
			isEmpty = true;

		return isEmpty;
	}

}

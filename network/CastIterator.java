package com.xSowl.betterrings.network;

import java.util.Iterator;

public class CastIterator<T> implements Iterable<T>, Iterator<T> {

	Iterator<T> iterator;

	public CastIterator(final Iterable<T> iterable) {
		this(iterable.iterator());
	}

	public CastIterator(final Iterator<T> iterator) {
		this.iterator = iterator;
	}

	@Override
	public Iterator<T> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		return this.iterator.hasNext();
	}

	@Override
	public T next() {
		return this.iterator.next();
	}

	@Override
	public void remove() {
		this.iterator.remove();
	}

}
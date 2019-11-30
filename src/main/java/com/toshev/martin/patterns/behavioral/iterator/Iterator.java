package com.toshev.martin.patterns.behavioral.iterator;

public abstract class Iterator<T> {

	public abstract boolean hasNext();
	
	public abstract T next();
}

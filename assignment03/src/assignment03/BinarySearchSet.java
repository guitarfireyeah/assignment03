package assignment03;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BinarySearchSet<E> implements SortedSet<E>, Iterator<E>{

	private Comparator<?super E> wayToCompare;
	private E[] data;
	public BinarySearchSet<E>(){
		wayToCompare = Comparator.naturalOrder();
	}
	public BinarySearchSet<E>(Comparator<? super E> comparator){
		wayToCompare = comparator;
	}
	@Override
	public Comparator<? super E> comparator() {
		return this.wayToCompare;
	}

	@Override
	public E first() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E last() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> elements) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> elements) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> elements) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		int size = 0;
		for(E el: data){
			size++;
		}
		return size;
	}

	@Override
	public Object[] toArray() {
		return data;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
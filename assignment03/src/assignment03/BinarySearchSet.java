package assignment03;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

@SuppressWarnings("unchecked")
public class BinarySearchSet<E> implements SortedSet<E>, Iterator<E>{

	private Comparator<?super E> wayToCompare;
	private E[] data;
	
	public BinarySearchSet(){
		wayToCompare = (Comparator<? super E>)Comparator.naturalOrder();
		data = (E[])new Object[8]; // Creates the array of size 8 as initial size
	}
	
	public BinarySearchSet(Comparator<? super E> comparator){
		wayToCompare = comparator;
	}
	
	@Override
	public Comparator<? super E> comparator() {
		return this.wayToCompare;
	}

	@Override
	public E first() throws NoSuchElementException {
		if(data.length == 0)
		throw new NoSuchElementException();
		else
			return data[0];
	}

	@Override
	public E last() throws NoSuchElementException {
		if(data.length == 0)
			throw new NoSuchElementException();
			else
				return data[0];
	}

	@Override
	public boolean add(E element) {
		int index = Arrays.binarySearch(data, 0, data.length, element);
		for(int i = 0; i < data.length;i++){
			if(i<index){
				continue;
			}else if(i == index){
				
			}
		}
		}

	@Override
	public boolean addAll(Collection<? extends E> elements) {
		
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
/**
 * must have methods remove and regular iterator methods.
 * @return
 */
	@Override
	public Iterator<E> iterator() {
		return new Iterator<E>(){
			@Override
			public void remove(){
				
			}

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
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
		return data.length;
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
	
	/**
	 * Doubles the array size by its size by calling the addAll method
	 */
	public void doubleArrayCapacity(){
		E[] dataCopy = data;
		data = (E[])new Object[data.length*2];
		this.addAll((Collection<? extends E>) Arrays.stream(dataCopy));
	}
	
}
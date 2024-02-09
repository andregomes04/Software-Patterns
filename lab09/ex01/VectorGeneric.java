package ex01;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class VectorGeneric<T> {
	private T[] vec;		
	private int nElem;	      
	private final static int ALLOC = 50;   
	private int dimVec = ALLOC;     

	@SuppressWarnings("unchecked")
	public VectorGeneric() {
		vec = (T[]) new Object[dimVec];
		nElem = 0;
	}
	
	public boolean addElem(T elem) {
		if (elem == null)
			return false;
		ensureSpace();
		vec[nElem++] = elem;
		return true;
	}

	private void ensureSpace() {
		if (nElem>=dimVec) {
			dimVec += ALLOC;
			@SuppressWarnings("unchecked")
			T[] newArray = (T[]) new Object[dimVec];
			System.arraycopy(vec, 0, newArray, 0, nElem );
			vec = newArray;
		}
	}

	public boolean removeElem(T elem) {
		for (int i = 0; i < nElem; i++) {
			if (vec[i].equals(elem)) {
				if (nElem-i-1 > 0) // not last element
					System.arraycopy(vec, i+1, vec, i, nElem-i-1 );
				vec[--nElem] = null; // libertar último objecto para o GC
				return true;
			}
		}
		return false;
	}

	public int totalElem() {
		return nElem;
	}
	
	public T getElem(int i) {
		return (T) vec[i];
	}

    public Iterator<T> iterator() {             // método público de acesso ao VectorIterator
        return (this).new VectorIterator<T>();
    }

    public ListIterator<T> listiterator(){
        return (this).new VectorListIterator<>(0);
    }

    public ListIterator<T> listiterator(int i){
        return (this).new VectorListIterator<>(i);
    }

    private class VectorIterator<K> implements Iterator<K>{  // VectorIterator como classe privada
        private int indice;
        VectorIterator(){
            indice = 0;
        }

        @Override
        public boolean hasNext() {
           return (indice < nElem);
        }

        @Override
        public K next() {
            if (hasNext())
                return (K) VectorGeneric.this.vec[indice++];
            throw new NoSuchElementException("only "+ nElem +" elements");
        }
    }

    private class VectorListIterator<K> implements ListIterator<K>{  // VectorListItertor como classe privada
        private int indice;
        VectorListIterator(int indice){
            this.indice = indice;
        }
        @Override
        public void add(K e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'add'");
        }
        @Override
        public boolean hasNext() {
            return (indice < nElem);
        }
        @Override
        public boolean hasPrevious() {
            return (0 < indice);
        }
        @Override
        public K next() {
            if (hasNext())
                return (K) VectorGeneric.this.vec[indice++];
            throw new NoSuchElementException("only "+ nElem +" elements");
        }
        @Override
        public int nextIndex() {
            return indice+1;
        }
        @Override
        public K previous() {
            if (hasPrevious())
                return (K) VectorGeneric.this.vec[indice--];
            throw new NoSuchElementException("only "+ nElem +" elements");
        }
        @Override
        public int previousIndex() {
            return indice-1;
        }
        @Override
        public void remove() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'remove'");
        }
        @Override
        public void set(K e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'set'");
        }

        
    }
}
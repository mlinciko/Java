package task3;
import java.util.*;

public class SetTest<E>  implements Set<E>{
    HashSet hashset=new HashSet();
    @Override
    public synchronized int size() {
        return hashset.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return hashset.isEmpty();
    }

    @Override
    public  synchronized boolean contains(Object obj) {
        return hashset.contains(obj);
    }

    @Override
    public synchronized Iterator iterator() {
        return hashset.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return hashset.toArray();
    }

    @Override
    public synchronized boolean add(Object obj) {
        return hashset.add(obj);
    }

    @Override
    public synchronized boolean remove(Object obj) {
        return hashset.remove(obj);
    }

    @Override
    public synchronized boolean addAll(Collection collec) {
        return hashset.addAll(collec);
    }

    @Override
    public synchronized void clear() {
        hashset.clear();
    }

    @Override
    public synchronized boolean removeAll(Collection collec) {
        return hashset.removeAll(collec);
    }

    @Override
    public synchronized boolean retainAll(Collection collec) {
        return hashset.retainAll(collec);
    }

    @Override
    public synchronized boolean containsAll(Collection collec) {
        return hashset.containsAll(collec);
    }

    @Override
    public synchronized Object[] toArray(Object[] array) {
        return hashset.toArray(array);
    }
}

package unmodifiable.list;

import java.util.AbstractList;
import java.util.List;

public class ImmutableList<E> extends AbstractList<E>{
    
    private List<E> list;
    
    public ImmutableList(List<E> list) {
        super();
        this.list = list;
    }

    @Override
    public E get(int index) {
        return this.list.get(index);
    }

    @Override
    public int size() {
        return this.list.size();
    }
    
    /*@Override
    public boolean add(E e) {
        return list.add(e);
    }*/
}

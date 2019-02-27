package unmodifiable.list;

import java.util.List;

public class ListUttility {
    public static <E> List<E> getUnmodifiableList(List<E> list){
        return new ImmutableList<E>(list);
    }
}

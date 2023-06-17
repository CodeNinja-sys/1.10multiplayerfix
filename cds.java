/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class cds {
    public static Map a(Iterable iterable, Iterable iterable2) {
        return cds.a(iterable, iterable2, sz.d());
    }

    public static Map a(Iterable iterable, Iterable iterable2, Map map) {
        Iterator iterator = iterable2.iterator();
        for (Object t2 : iterable) {
            map.put(t2, iterator.next());
        }
        if (iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        return map;
    }
}


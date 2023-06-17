/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.sz;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public class bg {
    public static Map a(Iterable iterable, Iterable iterable2) {
        return bg.a(iterable, iterable2, sz.d());
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


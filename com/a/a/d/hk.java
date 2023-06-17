/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.gs;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

public abstract class hk
extends gs
implements SortedMap {
    protected hk() {
    }

    protected abstract SortedMap o();

    public Comparator comparator() {
        return this.o().comparator();
    }

    public Object firstKey() {
        return this.o().firstKey();
    }

    public SortedMap headMap(Object object) {
        return this.o().headMap(object);
    }

    public Object lastKey() {
        return this.o().lastKey();
    }

    public SortedMap subMap(Object object, Object object2) {
        return this.o().subMap(object, object2);
    }

    public SortedMap tailMap(Object object) {
        return this.o().tailMap(object);
    }

    private int b(Object object, Object object2) {
        Comparator comparator = this.comparator();
        if (comparator == null) {
            return ((Comparable)object).compareTo(object2);
        }
        return comparator.compare(object, object2);
    }

    @Override
    protected boolean d(Object object) {
        try {
            hk hk2 = this;
            Object object2 = hk2.tailMap(object).firstKey();
            return this.b(object2, object) == 0;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
        catch (NoSuchElementException noSuchElementException) {
            return false;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
    }

    protected SortedMap a(Object object, Object object2) {
        cl.a(this.b(object, object2) <= 0, (Object)"fromKey must be <= toKey");
        return this.tailMap(object).headMap(object2);
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.o();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.o();
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.ae;
import a.a.a.a.c.b;
import a.a.a.a.c.o;
import a.a.a.a.c.v;
import java.util.Collection;
import java.util.Iterator;

public abstract class y
extends b {
    protected y() {
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return o.a;
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        return arrobject;
    }

    public v c() {
        return ae.a;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Collection)) {
            return false;
        }
        return ((Collection)object).isEmpty();
    }

    @Override
    public /* synthetic */ ad a() {
        return this.c();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.c();
    }
}


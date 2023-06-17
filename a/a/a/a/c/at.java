/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.ae;
import a.a.a.a.c.ap;
import a.a.a.a.c.i;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public class at
extends i
implements Serializable,
Cloneable {
    private static final long b = -7046029254386353129L;
    protected final Object a;

    protected at(Object object) {
        this.a = object;
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object) {
        return object == null ? this.a == null : object.equals(this.a);
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public ap b() {
        return ae.a(this.a);
    }

    @Override
    public int size() {
        return 1;
    }

    public Object clone() {
        return this;
    }

    @Override
    public /* synthetic */ ad a() {
        return this.b();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.b();
    }
}


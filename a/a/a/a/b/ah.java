/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.a;
import a.a.a.a.b.ac;
import java.io.Serializable;

public class ah
extends a
implements Serializable {
    private static final long c = -7046029254386353129L;
    protected final ac b;

    protected ah(ac ac2) {
        if (ac2 == null) {
            throw new NullPointerException();
        }
        this.b = ac2;
    }

    @Override
    public int size() {
        return this.b.size();
    }

    @Override
    public boolean b(long l2) {
        return this.b.b(l2);
    }

    @Override
    public Object a() {
        return this.b.a();
    }

    @Override
    public void a(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object a(long l2, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return this.b.toString();
    }

    @Override
    public Object a(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object c(long l2) {
        return this.b.c(l2);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.b.containsKey(object);
    }

    @Override
    public Object remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object get(Object object) {
        return this.b.get(object);
    }
}


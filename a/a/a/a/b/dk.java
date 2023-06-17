/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.di;
import a.a.a.a.b.u;
import java.io.Serializable;
import java.util.NoSuchElementException;

public class dk
extends u
implements Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected dk() {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public long a() {
        throw new NoSuchElementException();
    }

    @Override
    public long b() {
        throw new NoSuchElementException();
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return -1;
    }

    @Override
    public int b(int n2) {
        return 0;
    }

    @Override
    public int a(int n2) {
        return 0;
    }

    public Object clone() {
        return di.a;
    }

    private Object e() {
        return di.a;
    }
}


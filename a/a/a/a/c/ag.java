/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ae;
import a.a.a.a.c.h;
import java.io.Serializable;
import java.util.NoSuchElementException;

public class ag
extends h
implements Serializable,
Cloneable {
    private static final long a = -7046029254386353129L;

    protected ag() {
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
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public Object previous() {
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
        return ae.a;
    }

    private Object a() {
        return ae.a;
    }
}


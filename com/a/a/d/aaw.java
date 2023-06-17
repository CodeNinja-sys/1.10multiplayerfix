/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.agi;
import com.a.a.d.lo;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.Set;

final class aaw
extends lo {
    final transient Object a;
    private transient int c;

    aaw(Object object) {
        this.a = cl.a(object);
    }

    aaw(Object object, int n2) {
        this.a = object;
        this.c = n2;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.equals(object);
    }

    @Override
    public agi aO_() {
        return nj.a(this.a);
    }

    @Override
    boolean a() {
        return false;
    }

    @Override
    int a(Object[] arrobject, int n2) {
        arrobject[n2] = this.a;
        return n2 + 1;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof Set) {
            Set set = (Set)object;
            return set.size() == 1 && this.a.equals(set.iterator().next());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int n2 = this.c;
        if (n2 == 0) {
            this.c = n2 = this.a.hashCode();
        }
        return n2;
    }

    @Override
    boolean aQ_() {
        return this.c != 0;
    }

    @Override
    public String toString() {
        String string = this.a.toString();
        return new StringBuilder(string.length() + 2).append('[').append(string).append(']').toString();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}


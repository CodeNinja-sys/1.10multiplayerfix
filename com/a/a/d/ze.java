/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.agj;
import com.a.a.d.jl;
import com.a.a.d.nj;
import java.util.ListIterator;

class ze
extends jl {
    private final transient int a;
    private final transient int b;
    private final transient Object[] c;

    ze(Object[] arrobject, int n2, int n3) {
        this.a = n2;
        this.b = n3;
        this.c = arrobject;
    }

    ze(Object[] arrobject) {
        this(arrobject, 0, arrobject.length);
    }

    @Override
    public int size() {
        return this.b;
    }

    @Override
    boolean a() {
        return this.b != this.c.length;
    }

    @Override
    int a(Object[] arrobject, int n2) {
        System.arraycopy(this.c, this.a, arrobject, n2, this.b);
        return n2 + this.b;
    }

    public Object get(int n2) {
        cl.a(n2, this.b);
        return this.c[n2 + this.a];
    }

    @Override
    public int indexOf(Object object) {
        if (object == null) {
            return -1;
        }
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (!this.c[this.a + i2].equals(object)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        if (object == null) {
            return -1;
        }
        for (int i2 = this.b - 1; i2 >= 0; --i2) {
            if (!this.c[this.a + i2].equals(object)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    jl b(int n2, int n3) {
        return new ze(this.c, this.a + n2, n3 - n2);
    }

    @Override
    public agj a(int n2) {
        return nj.a(this.c, this.a, this.b, n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.a(n2);
    }
}


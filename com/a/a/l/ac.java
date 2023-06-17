/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.aa;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class ac
extends AbstractList
implements Serializable,
RandomAccess {
    final short[] a;
    final int b;
    final int c;
    private static final long d = 0L;

    ac(short[] arrs) {
        this(arrs, 0, arrs.length);
    }

    ac(short[] arrs, int n2, int n3) {
        this.a = arrs;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public int size() {
        return this.c - this.b;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public Short a(int n2) {
        cl.a(n2, this.size());
        return this.a[this.b + n2];
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof Short && aa.a(this.a, (short)((Short)object), this.b, this.c) != -1;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        if (object instanceof Short && (n2 = aa.a(this.a, (short)((Short)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        if (object instanceof Short && (n2 = aa.b(this.a, (short)((Short)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    public Short a(int n2, Short s2) {
        cl.a(n2, this.size());
        short s3 = this.a[this.b + n2];
        this.a[this.b + n2] = (Short)cl.a(s2);
        return s3;
    }

    @Override
    public List subList(int n2, int n3) {
        int n4 = this.size();
        cl.a(n2, n3, n4);
        if (n2 == n3) {
            return Collections.emptyList();
        }
        return new ac(this.a, this.b + n2, this.b + n3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ac) {
            ac ac2 = (ac)object;
            int n2 = this.size();
            if (ac2.size() != n2) {
                return false;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.a[this.b + i2] == ac2.a[ac2.b + i2]) continue;
                return false;
            }
            return true;
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        int n2 = 1;
        for (int i2 = this.b; i2 < this.c; ++i2) {
            n2 = 31 * n2 + aa.a(this.a[i2]);
        }
        return n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 6);
        stringBuilder.append('[').append(this.a[this.b]);
        for (int i2 = this.b + 1; i2 < this.c; ++i2) {
            stringBuilder.append(", ").append(this.a[i2]);
        }
        return stringBuilder.append(']').toString();
    }

    short[] a() {
        int n2 = this.size();
        short[] arrs = new short[n2];
        System.arraycopy(this.a, this.b, arrs, 0, n2);
        return arrs;
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.a(n2, (Short)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.d;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class e
extends AbstractList
implements Serializable,
RandomAccess {
    final byte[] a;
    final int b;
    final int c;
    private static final long d = 0L;

    e(byte[] arrby) {
        this(arrby, 0, arrby.length);
    }

    e(byte[] arrby, int n2, int n3) {
        this.a = arrby;
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

    public Byte a(int n2) {
        cl.a(n2, this.size());
        return this.a[this.b + n2];
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof Byte && com.a.a.l.d.a(this.a, (byte)((Byte)object), this.b, this.c) != -1;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        if (object instanceof Byte && (n2 = com.a.a.l.d.a(this.a, (byte)((Byte)object), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        if (object instanceof Byte && (n2 = com.a.a.l.d.b(this.a, (Byte)object, this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    public Byte a(int n2, Byte by2) {
        cl.a(n2, this.size());
        byte by3 = this.a[this.b + n2];
        this.a[this.b + n2] = (Byte)cl.a(by2);
        return by3;
    }

    @Override
    public List subList(int n2, int n3) {
        int n4 = this.size();
        cl.a(n2, n3, n4);
        if (n2 == n3) {
            return Collections.emptyList();
        }
        return new e(this.a, this.b + n2, this.b + n3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof e) {
            e e2 = (e)object;
            int n2 = this.size();
            if (e2.size() != n2) {
                return false;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.a[this.b + i2] == e2.a[e2.b + i2]) continue;
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
            n2 = 31 * n2 + com.a.a.l.d.a(this.a[i2]);
        }
        return n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 5);
        stringBuilder.append('[').append(this.a[this.b]);
        for (int i2 = this.b + 1; i2 < this.c; ++i2) {
            stringBuilder.append(", ").append(this.a[i2]);
        }
        return stringBuilder.append(']').toString();
    }

    byte[] a() {
        int n2 = this.size();
        byte[] arrby = new byte[n2];
        System.arraycopy(this.a, this.b, arrby, 0, n2);
        return arrby;
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.a(n2, (Byte)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}


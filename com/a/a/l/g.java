/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.l;

import com.a.a.b.cl;
import com.a.a.l.f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

class g
extends AbstractList
implements Serializable,
RandomAccess {
    final char[] a;
    final int b;
    final int c;
    private static final long d = 0L;

    g(char[] arrc) {
        this(arrc, 0, arrc.length);
    }

    g(char[] arrc, int n2, int n3) {
        this.a = arrc;
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

    public Character a(int n2) {
        cl.a(n2, this.size());
        return Character.valueOf(this.a[this.b + n2]);
    }

    @Override
    public boolean contains(Object object) {
        return object instanceof Character && f.a(this.a, ((Character)object).charValue(), this.b, this.c) != -1;
    }

    @Override
    public int indexOf(Object object) {
        int n2;
        if (object instanceof Character && (n2 = f.a(this.a, ((Character)object).charValue(), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2;
        if (object instanceof Character && (n2 = f.b(this.a, ((Character)object).charValue(), this.b, this.c)) >= 0) {
            return n2 - this.b;
        }
        return -1;
    }

    public Character a(int n2, Character c2) {
        cl.a(n2, this.size());
        char c3 = this.a[this.b + n2];
        this.a[this.b + n2] = ((Character)cl.a(c2)).charValue();
        return Character.valueOf(c3);
    }

    @Override
    public List subList(int n2, int n3) {
        int n4 = this.size();
        cl.a(n2, n3, n4);
        if (n2 == n3) {
            return Collections.emptyList();
        }
        return new g(this.a, this.b + n2, this.b + n3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof g) {
            g g2 = (g)object;
            int n2 = this.size();
            if (g2.size() != n2) {
                return false;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.a[this.b + i2] == g2.a[g2.b + i2]) continue;
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
            n2 = 31 * n2 + f.a(this.a[i2]);
        }
        return n2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.size() * 3);
        stringBuilder.append('[').append(this.a[this.b]);
        for (int i2 = this.b + 1; i2 < this.c; ++i2) {
            stringBuilder.append(", ").append(this.a[i2]);
        }
        return stringBuilder.append(']').toString();
    }

    char[] a() {
        int n2 = this.size();
        char[] arrc = new char[n2];
        System.arraycopy(this.a, this.b, arrc, 0, n2);
        return arrc;
    }

    @Override
    public /* synthetic */ Object set(int n2, Object object) {
        return this.a(n2, (Character)object);
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.agi;
import com.a.a.d.jl;
import com.a.a.d.nj;
import java.util.Iterator;
import java.util.List;

final class aav
extends jl {
    final transient Object a;

    aav(Object object) {
        this.a = cl.a(object);
    }

    public Object get(int n2) {
        cl.a(n2, 1);
        return this.a;
    }

    @Override
    public int indexOf(Object object) {
        return this.a.equals(object) ? 0 : -1;
    }

    @Override
    public agi aO_() {
        return nj.a(this.a);
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.indexOf(object);
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public jl a(int n2, int n3) {
        cl.a(n2, n3, 1);
        return n2 == n3 ? jl.d() : this;
    }

    @Override
    public jl f() {
        return this;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.equals(object);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof List) {
            List list = (List)object;
            return list.size() == 1 && this.a.equals(list.get(0));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 + this.a.hashCode();
    }

    @Override
    public String toString() {
        String string = this.a.toString();
        return new StringBuilder(string.length() + 2).append('[').append(string).append(']').toString();
    }

    @Override
    public boolean isEmpty() {
        return false;
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
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}


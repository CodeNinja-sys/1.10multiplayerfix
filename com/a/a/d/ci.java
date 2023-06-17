/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.cj;
import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.j.g;
import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

final class ci
extends AbstractList
implements RandomAccess {
    private final transient jl a;
    private final transient int[] b;

    static List a(List list) {
        jn jn2 = new jn(list.size());
        for (List list2 : list) {
            jl jl2 = jl.a(list2);
            if (jl2.isEmpty()) {
                return jl.d();
            }
            jn2.c(jl2);
        }
        return new ci(jn2.b());
    }

    ci(jl jl2) {
        this.a = jl2;
        int[] arrn = new int[jl2.size() + 1];
        arrn[jl2.size()] = 1;
        try {
            for (int i2 = jl2.size() - 1; i2 >= 0; --i2) {
                arrn[i2] = g.g(arrn[i2 + 1], ((List)jl2.get(i2)).size());
            }
        }
        catch (ArithmeticException arithmeticException) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
        this.b = arrn;
    }

    private int a(int n2, int n3) {
        return n2 / this.b[n3 + 1] % ((List)this.a.get(n3)).size();
    }

    public jl a(int n2) {
        cl.a(n2, this.size());
        return new cj(this, n2);
    }

    @Override
    public int size() {
        return this.b[0];
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof List)) {
            return false;
        }
        List list = (List)object;
        if (list.size() != this.a.size()) {
            return false;
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int n2 = listIterator.nextIndex();
            if (((List)this.a.get(n2)).contains(listIterator.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }

    static /* synthetic */ jl a(ci ci2) {
        return ci2.a;
    }

    static /* synthetic */ int a(ci ci2, int n2, int n3) {
        return ci2.a(n2, n3);
    }
}


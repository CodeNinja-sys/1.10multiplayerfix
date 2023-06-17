/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cm;
import com.a.a.d.cs;
import com.a.a.d.jl;
import com.a.a.j.g;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

final class cr
extends AbstractCollection {
    final jl a;

    cr(jl jl2) {
        this.a = jl2;
    }

    @Override
    public int size() {
        return g.b(this.a.size());
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new cs(this.a);
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof List) {
            List list = (List)object;
            return cm.a(this.a, list);
        }
        return false;
    }

    @Override
    public String toString() {
        return "permutations(" + this.a + ")";
    }
}


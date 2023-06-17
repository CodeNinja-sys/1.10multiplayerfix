/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.aw;
import com.a.a.b.cl;
import java.io.Serializable;
import java.util.Iterator;

final class cj
extends aw
implements Serializable {
    final aw a;
    private static final long b = 1L;

    cj(aw aw2) {
        this.a = (aw)cl.a(aw2);
    }

    protected boolean a(Iterable iterable, Iterable iterable2) {
        Iterator iterator = iterable.iterator();
        Iterator iterator2 = iterable2.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            if (this.a.a(iterator.next(), iterator2.next())) continue;
            return false;
        }
        return !iterator.hasNext() && !iterator2.hasNext();
    }

    protected int a(Iterable iterable) {
        int n2 = 78721;
        for (Object t2 : iterable) {
            n2 = n2 * 24943 + this.a.a(t2);
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object instanceof cj) {
            cj cj2 = (cj)object;
            return this.a.equals(cj2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0x46A3EB07;
    }

    public String toString() {
        return this.a + ".pairwise()";
    }

    @Override
    protected /* synthetic */ int b(Object object) {
        return this.a((Iterable)object);
    }

    @Override
    protected /* synthetic */ boolean b(Object object, Object object2) {
        return this.a((Iterable)object, (Iterable)object2);
    }
}


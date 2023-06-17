/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aap;
import com.a.a.d.jt;
import com.a.a.d.ju;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

final class aao
extends AbstractSet {
    final jt a;

    aao(Set set) {
        ju ju2 = jt.n();
        int n2 = 0;
        for (Object e2 : (Set)cl.a(set)) {
            ju2.b(e2, n2++);
        }
        this.a = ju2.b();
        cl.a(this.a.size() <= 30, "Too many elements to create power set: %s > 30", new Object[]{this.a.size()});
    }

    @Override
    public int size() {
        return 1 << this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return new aap(this, this.size());
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof Set) {
            Set set = (Set)object;
            return this.a.g().containsAll(set);
        }
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof aao) {
            aao aao2 = (aao)object;
            return this.a.equals(aao2.a);
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return this.a.g().hashCode() << this.a.size() - 1;
    }

    @Override
    public String toString() {
        return "powerSet(" + this.a + ")";
    }
}


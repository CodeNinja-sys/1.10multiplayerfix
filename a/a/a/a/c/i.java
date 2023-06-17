/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.aq;
import a.a.a.a.c.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class i
extends b
implements aq,
Cloneable {
    protected i() {
    }

    @Override
    public abstract ad a();

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set set = (Set)object;
        if (set.size() != this.size()) {
            return false;
        }
        return this.containsAll((Collection)set);
    }

    @Override
    public int hashCode() {
        int n2 = 0;
        int n3 = this.size();
        ad ad2 = this.a();
        while (n3-- != 0) {
            Object e2 = ad2.next();
            n2 += e2 == null ? 0 : e2.hashCode();
        }
        return n2;
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}


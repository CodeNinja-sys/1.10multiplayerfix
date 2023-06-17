/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.dh;
import a.a.a.a.b.ec;
import a.a.a.a.b.n;
import a.a.a.a.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class v
extends n
implements ec,
Cloneable {
    protected v() {
    }

    @Override
    public abstract dh a();

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
        dh dh2 = this.a();
        while (n3-- != 0) {
            long l2 = dh2.a();
            n2 += g.d(l2);
        }
        return n2;
    }

    @Override
    public boolean g(long l2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean f(long l2) {
        return this.g(l2);
    }

    @Override
    public boolean remove(Object object) {
        return this.g((Long)object);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}


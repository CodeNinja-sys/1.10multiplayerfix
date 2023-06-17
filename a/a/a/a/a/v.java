/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.dh;
import a.a.a.a.a.eb;
import a.a.a.a.a.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class v
extends n
implements eb,
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
            int n4 = dh2.a();
            n2 += n4;
        }
        return n2;
    }

    @Override
    public boolean g(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean f(int n2) {
        return this.g(n2);
    }

    @Override
    public boolean remove(Object object) {
        return this.g((Integer)object);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}


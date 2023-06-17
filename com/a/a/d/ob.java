/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.yd;
import java.io.Serializable;
import java.util.Iterator;

final class ob
extends yd
implements Serializable {
    final yd a;
    private static final long b = 0L;

    ob(yd yd2) {
        this.a = yd2;
    }

    public int a(Iterable iterable, Iterable iterable2) {
        Iterator iterator = iterable.iterator();
        Iterator iterator2 = iterable2.iterator();
        while (iterator.hasNext()) {
            if (!iterator2.hasNext()) {
                return 1;
            }
            int n2 = this.a.compare(iterator.next(), iterator2.next());
            if (n2 == 0) continue;
            return n2;
        }
        if (iterator2.hasNext()) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ob) {
            ob ob2 = (ob)object;
            return this.a.equals(ob2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 0x7BB78CF5;
    }

    public String toString() {
        return this.a + ".lexicographical()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Iterable)object, (Iterable)object2);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.aa;
import a.a.a.a.b.ab;
import a.a.a.a.b.au;
import a.a.a.a.b.x;
import a.a.a.a.b.y;
import a.a.a.a.c.ad;
import a.a.a.a.c.i;
import java.util.Iterator;
import java.util.Map;

final class z
extends i
implements au {
    final /* synthetic */ x a;

    private z(x x2) {
        this.a = x2;
    }

    @Override
    public ad a() {
        return new aa(this);
    }

    @Override
    public ad b() {
        return new ab(this);
    }

    @Override
    public int size() {
        return x.a(this.a);
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        long l2 = (Long)entry.getKey();
        return this.a.b(l2) && (this.a.c(l2) == null ? entry.getValue() == null : this.a.c(l2).equals(entry.getValue()));
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        long l2 = (Long)entry.getKey();
        Object v2 = entry.getValue();
        int n2 = x.a(this.a, l2);
        if (n2 == -1 || !(v2 != null ? v2.equals(x.c(this.a)[n2]) : x.c(this.a)[n2] == null)) {
            return false;
        }
        int n3 = x.a(this.a) - n2 - 1;
        System.arraycopy(x.b(this.a), n2 + 1, x.b(this.a), n2, n3);
        System.arraycopy(x.c(this.a), n2 + 1, x.c(this.a), n2, n3);
        x.d(this.a);
        x.c((x)this.a)[x.a((x)this.a)] = null;
        return true;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }

    /* synthetic */ z(x x2, y y2) {
        this(x2);
    }
}


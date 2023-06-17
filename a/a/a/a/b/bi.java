/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.au;
import a.a.a.a.b.bb;
import a.a.a.a.b.bc;
import a.a.a.a.b.bd;
import a.a.a.a.b.be;
import a.a.a.a.c.ad;
import a.a.a.a.c.i;
import a.a.a.a.g;
import java.util.Iterator;
import java.util.Map;

final class bi
extends i
implements au {
    final /* synthetic */ bb a;

    private bi(bb bb2) {
        this.a = bb2;
    }

    @Override
    public ad a() {
        return new bd(this.a, null);
    }

    @Override
    public ad b() {
        return new be(this.a, null);
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
        Object v2 = entry.getValue();
        if (this.a.n.a(l2, 0L)) {
            return this.a.m && (this.a.k[this.a.o] == null ? v2 == null : this.a.k[this.a.o].equals(v2));
        }
        long[] arrl = this.a.j;
        int n2 = g.b(this.a.n.a(l2)) & this.a.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return false;
        }
        if (this.a.n.a(l2, l3)) {
            return this.a.k[n2] == null ? v2 == null : this.a.k[n2].equals(v2);
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.a.l]) != 0L) continue;
            return false;
        } while (!this.a.n.a(l2, l3));
        return this.a.k[n2] == null ? v2 == null : this.a.k[n2].equals(v2);
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
        if (this.a.n.a(l2, 0L)) {
            if (this.a.m && (this.a.k[this.a.o] == null ? v2 == null : this.a.k[this.a.o].equals(v2))) {
                bb.a(this.a);
                return true;
            }
            return false;
        }
        long[] arrl = this.a.j;
        int n2 = g.b(this.a.n.a(l2)) & this.a.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return false;
        }
        if (this.a.n.a(l3, l2)) {
            if (this.a.k[n2] == null ? v2 == null : this.a.k[n2].equals(v2)) {
                bb.a(this.a, n2);
                return true;
            }
            return false;
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.a.l]) != 0L) continue;
            return false;
        } while (!this.a.n.a(l3, l2) || !(this.a.k[n2] == null ? v2 == null : this.a.k[n2].equals(v2)));
        bb.a(this.a, n2);
        return true;
    }

    @Override
    public int size() {
        return this.a.q;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }

    /* synthetic */ bi(bb bb2, bc bc2) {
        this(bb2);
    }
}


/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.au;
import a.a.a.a.a.bl;
import a.a.a.a.a.bm;
import a.a.a.a.a.bn;
import a.a.a.a.a.bo;
import a.a.a.a.c.ad;
import a.a.a.a.c.i;
import a.a.a.a.g;
import java.util.Iterator;
import java.util.Map;

final class bs
extends i
implements au {
    final /* synthetic */ bl a;

    private bs(bl bl2) {
        this.a = bl2;
    }

    @Override
    public ad a() {
        return new bn(this.a, null);
    }

    @Override
    public ad b() {
        return new bo(this.a, null);
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int n2 = (Integer)entry.getKey();
        Object v2 = entry.getValue();
        if (n2 == 0) {
            return this.a.m && (this.a.k[this.a.n] == null ? v2 == null : this.a.k[this.a.n].equals(v2));
        }
        int[] arrn = this.a.j;
        int n3 = g.b(n2) & this.a.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return false;
        }
        if (n2 == n4) {
            return this.a.k[n3] == null ? v2 == null : this.a.k[n3].equals(v2);
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.a.l]) != 0) continue;
            return false;
        } while (n2 != n4);
        return this.a.k[n3] == null ? v2 == null : this.a.k[n3].equals(v2);
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int n2 = (Integer)entry.getKey();
        Object v2 = entry.getValue();
        if (n2 == 0) {
            if (this.a.m && (this.a.k[this.a.n] == null ? v2 == null : this.a.k[this.a.n].equals(v2))) {
                bl.a(this.a);
                return true;
            }
            return false;
        }
        int[] arrn = this.a.j;
        int n3 = g.b(n2) & this.a.l;
        int n4 = arrn[n3];
        if (n4 == 0) {
            return false;
        }
        if (n4 == n2) {
            if (this.a.k[n3] == null ? v2 == null : this.a.k[n3].equals(v2)) {
                bl.a(this.a, n3);
                return true;
            }
            return false;
        }
        do {
            if ((n4 = arrn[n3 = n3 + 1 & this.a.l]) != 0) continue;
            return false;
        } while (n4 != n2 || !(this.a.k[n3] == null ? v2 == null : this.a.k[n3].equals(v2)));
        bl.a(this.a, n3);
        return true;
    }

    @Override
    public int size() {
        return this.a.p;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }

    /* synthetic */ bs(bl bl2, bm bm2) {
        this(bl2);
    }
}


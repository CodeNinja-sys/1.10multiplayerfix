/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ai;
import a.a.a.a.b.aj;
import a.a.a.a.b.ak;
import a.a.a.a.b.al;
import a.a.a.a.b.ao;
import a.a.a.a.b.at;
import a.a.a.a.b.bw;
import a.a.a.a.c.ad;
import a.a.a.a.c.aw;
import a.a.a.a.c.j;
import a.a.a.a.c.v;
import a.a.a.a.g;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedSet;

final class ap
extends j
implements bw {
    final /* synthetic */ ai a;

    private ap(ai ai2) {
        this.a = ai2;
    }

    @Override
    public v c() {
        return new ak(this.a);
    }

    public Comparator comparator() {
        return null;
    }

    public aw a(at at2, at at3) {
        throw new UnsupportedOperationException();
    }

    public aw a(at at2) {
        throw new UnsupportedOperationException();
    }

    public aw b(at at2) {
        throw new UnsupportedOperationException();
    }

    public at d() {
        if (this.a.s == 0) {
            throw new NoSuchElementException();
        }
        return new ao(this.a, this.a.n);
    }

    public at e() {
        if (this.a.s == 0) {
            throw new NoSuchElementException();
        }
        return new ao(this.a, this.a.o);
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
        if (l2 == 0L) {
            return this.a.m && (this.a.k[this.a.q] == null ? v2 == null : this.a.k[this.a.q].equals(v2));
        }
        long[] arrl = this.a.j;
        int n2 = (int)g.b(l2) & this.a.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return false;
        }
        if (l2 == l3) {
            return this.a.k[n2] == null ? v2 == null : this.a.k[n2].equals(v2);
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.a.l]) != 0L) continue;
            return false;
        } while (l2 != l3);
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
        if (l2 == 0L) {
            if (this.a.m && (this.a.k[this.a.q] == null ? v2 == null : this.a.k[this.a.q].equals(v2))) {
                ai.a(this.a);
                return true;
            }
            return false;
        }
        long[] arrl = this.a.j;
        int n2 = (int)g.b(l2) & this.a.l;
        long l3 = arrl[n2];
        if (l3 == 0L) {
            return false;
        }
        if (l3 == l2) {
            if (this.a.k[n2] == null ? v2 == null : this.a.k[n2].equals(v2)) {
                ai.a(this.a, n2);
                return true;
            }
            return false;
        }
        do {
            if ((l3 = arrl[n2 = n2 + 1 & this.a.l]) != 0L) continue;
            return false;
        } while (l3 != l2 || !(this.a.k[n2] == null ? v2 == null : this.a.k[n2].equals(v2)));
        ai.a(this.a, n2);
        return true;
    }

    @Override
    public int size() {
        return this.a.s;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    public v c(at at2) {
        return new ak(this.a, at2.b());
    }

    public v f() {
        return new al(this.a);
    }

    @Override
    public v d(at at2) {
        return new al(this.a, at2.b());
    }

    @Override
    public /* synthetic */ aw a(Object object) {
        return this.b((at)object);
    }

    @Override
    public /* synthetic */ aw b(Object object) {
        return this.a((at)object);
    }

    @Override
    public /* synthetic */ ad a() {
        return this.c();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.c();
    }

    public /* synthetic */ Object last() {
        return this.e();
    }

    public /* synthetic */ Object first() {
        return this.d();
    }

    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.b((at)object);
    }

    public /* synthetic */ SortedSet headSet(Object object) {
        return this.a((at)object);
    }

    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a((at)object, (at)object2);
    }

    @Override
    public /* synthetic */ ad b() {
        return this.f();
    }

    /* synthetic */ ap(ai ai2, aj aj2) {
        this(ai2);
    }
}


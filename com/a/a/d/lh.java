/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.ce;
import com.a.a.d.du;
import com.a.a.d.ep;
import com.a.a.d.lf;
import com.a.a.d.li;
import com.a.a.d.lj;
import com.a.a.d.lk;
import com.a.a.d.me;
import com.a.a.d.yd;
import com.a.a.d.yl;
import com.a.a.l.q;
import java.util.Iterator;

final class lh
extends me {
    private final ep e;
    private transient Integer f;
    final /* synthetic */ lf a;

    lh(lf lf2, ep ep2) {
        this.a = lf2;
        super(yd.d());
        this.e = ep2;
    }

    @Override
    public int size() {
        Integer n2 = this.f;
        if (n2 == null) {
            yl yl2;
            long l2 = 0L;
            Iterator iterator = lf.a(this.a).iterator();
            while (iterator.hasNext() && (l2 += (long)du.a(yl2 = (yl)iterator.next(), this.e).size()) < Integer.MAX_VALUE) {
            }
            n2 = this.f = Integer.valueOf(q.b(l2));
        }
        return n2;
    }

    @Override
    public agi aO_() {
        return new li(this);
    }

    @Override
    public agi d() {
        return new lj(this);
    }

    me a(yl yl2) {
        return this.a.e(yl2).a(this.e);
    }

    me a(Comparable comparable, boolean bl2) {
        return this.a(yl.a(comparable, ce.a(bl2)));
    }

    me a(Comparable comparable, boolean bl2, Comparable comparable2, boolean bl3) {
        if (!bl2 && !bl3 && yl.e(comparable, comparable2) == 0) {
            return me.l();
        }
        return this.a(yl.a(comparable, ce.a(bl2), comparable2, ce.a(bl3)));
    }

    me b(Comparable comparable, boolean bl2) {
        return this.a(yl.b(comparable, ce.a(bl2)));
    }

    @Override
    public boolean contains(Object object) {
        if (object == null) {
            return false;
        }
        try {
            Comparable comparable = (Comparable)object;
            return this.a.a(comparable);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    @Override
    int c(Object object) {
        if (this.contains(object)) {
            Comparable comparable = (Comparable)object;
            long l2 = 0L;
            for (yl yl2 : lf.a(this.a)) {
                if (yl2.f(comparable)) {
                    return q.b(l2 + (long)du.a(yl2, this.e).c(comparable));
                }
                l2 += (long)du.a(yl2, this.e).size();
            }
            throw new AssertionError((Object)"impossible");
        }
        return -1;
    }

    @Override
    boolean a() {
        return lf.a(this.a).a();
    }

    @Override
    public String toString() {
        return lf.a(this.a).toString();
    }

    @Override
    Object aR_() {
        return new lk(lf.a(this.a), this.e);
    }

    @Override
    /* synthetic */ me a(Object object, boolean bl2) {
        return this.b((Comparable)object, bl2);
    }

    @Override
    /* synthetic */ me b(Object object, boolean bl2) {
        return this.a((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    static /* synthetic */ ep a(lh lh2) {
        return lh2.e;
    }
}


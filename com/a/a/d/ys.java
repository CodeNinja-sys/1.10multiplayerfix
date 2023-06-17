/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.agi;
import com.a.a.d.ce;
import com.a.a.d.cm;
import com.a.a.d.du;
import com.a.a.d.ep;
import com.a.a.d.et;
import com.a.a.d.me;
import com.a.a.d.yd;
import com.a.a.d.yl;
import com.a.a.d.yt;
import com.a.a.d.yu;
import com.a.a.d.yv;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class ys
extends du {
    private final yl e;
    private static final long f = 0L;

    ys(yl yl2, ep ep2) {
        super(ep2);
        this.e = yl2;
    }

    private du a(yl yl2) {
        return this.e.b(yl2) ? du.a(this.e.c(yl2), this.a) : new et(this.a);
    }

    @Override
    du c(Comparable comparable, boolean bl2) {
        return this.a(yl.a(comparable, ce.a(bl2)));
    }

    @Override
    du b(Comparable comparable, boolean bl2, Comparable comparable2, boolean bl3) {
        if (comparable.compareTo(comparable2) == 0 && !bl2 && !bl3) {
            return new et(this.a);
        }
        return this.a(yl.a(comparable, ce.a(bl2), comparable2, ce.a(bl3)));
    }

    @Override
    du d(Comparable comparable, boolean bl2) {
        return this.a(yl.b(comparable, ce.a(bl2)));
    }

    @Override
    int c(Object object) {
        return this.contains(object) ? (int)this.a.a(this.f(), (Comparable)object) : -1;
    }

    @Override
    public agi aO_() {
        return new yt(this, this.f());
    }

    @Override
    public agi d() {
        return new yu(this, this.g());
    }

    private static boolean d(Comparable comparable, Comparable comparable2) {
        return comparable2 != null && yl.e(comparable, comparable2) == 0;
    }

    @Override
    boolean a() {
        return false;
    }

    public Comparable f() {
        return this.e.b.a(this.a);
    }

    public Comparable g() {
        return this.e.c.b(this.a);
    }

    @Override
    public int size() {
        long l2 = this.a.a(this.f(), this.g());
        return l2 >= Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2 + 1;
    }

    @Override
    public boolean contains(Object object) {
        if (object == null) {
            return false;
        }
        try {
            return this.e.f((Comparable)object);
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection collection) {
        return cm.a((Collection)this, collection);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public du a(du du2) {
        Comparable comparable;
        cl.a(du2);
        cl.a(this.a.equals(du2.a));
        if (du2.isEmpty()) {
            return du2;
        }
        Comparable comparable2 = (Comparable)yd.d().b(this.f(), du2.first());
        return comparable2.compareTo(comparable = (Comparable)yd.d().a(this.g(), du2.last())) < 0 ? du.a(yl.b(comparable2, comparable), this.a) : new et(this.a);
    }

    @Override
    public yl b() {
        return this.a(ce.b, ce.b);
    }

    @Override
    public yl a(ce ce2, ce ce3) {
        return yl.a(this.e.b.a(ce2, this.a), this.e.c.b(ce3, this.a));
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof ys) {
            ys ys2 = (ys)object;
            if (this.a.equals(ys2.a)) {
                return this.f().equals(ys2.f()) && this.g().equals(ys2.g());
            }
        }
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return aad.b((Set)this);
    }

    @Override
    Object aR_() {
        return new yv(this.e, this.a, null);
    }

    @Override
    public /* synthetic */ Object last() {
        return this.g();
    }

    @Override
    public /* synthetic */ Object first() {
        return this.f();
    }

    @Override
    /* synthetic */ me a(Object object, boolean bl2) {
        return this.d((Comparable)object, bl2);
    }

    @Override
    /* synthetic */ me a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b((Comparable)object, bl2, (Comparable)object2, bl3);
    }

    @Override
    /* synthetic */ me b(Object object, boolean bl2) {
        return this.c((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }

    static /* synthetic */ boolean c(Comparable comparable, Comparable comparable2) {
        return ys.d(comparable, comparable2);
    }
}


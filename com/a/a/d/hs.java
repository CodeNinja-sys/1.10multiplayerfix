/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.d.ce;
import com.a.a.d.yd;
import com.a.a.d.yl;
import java.io.Serializable;
import java.util.Comparator;

final class hs
implements Serializable {
    private final Comparator a;
    private final boolean b;
    private final Object c;
    private final ce d;
    private final boolean e;
    private final Object f;
    private final ce g;
    private transient hs h;

    static hs a(yl yl2) {
        Comparable comparable = yl2.d() ? yl2.e() : null;
        ce ce2 = yl2.d() ? yl2.f() : ce.a;
        Comparable comparable2 = yl2.g() ? yl2.h() : null;
        ce ce3 = yl2.g() ? yl2.i() : ce.a;
        return new hs(yd.d(), yl2.d(), comparable, ce2, yl2.g(), comparable2, ce3);
    }

    static hs a(Comparator comparator) {
        return new hs(comparator, false, null, ce.a, false, null, ce.a);
    }

    static hs a(Comparator comparator, Object object, ce ce2) {
        return new hs(comparator, true, object, ce2, false, null, ce.a);
    }

    static hs b(Comparator comparator, Object object, ce ce2) {
        return new hs(comparator, false, null, ce.a, true, object, ce2);
    }

    static hs a(Comparator comparator, Object object, ce ce2, Object object2, ce ce3) {
        return new hs(comparator, true, object, ce2, true, object2, ce3);
    }

    private hs(Comparator comparator, boolean bl2, Object object, ce ce2, boolean bl3, Object object2, ce ce3) {
        this.a = (Comparator)cl.a(comparator);
        this.b = bl2;
        this.e = bl3;
        this.c = object;
        this.d = (ce)((Object)cl.a((Object)ce2));
        this.f = object2;
        this.g = (ce)((Object)cl.a((Object)ce3));
        if (bl2) {
            comparator.compare(object, object);
        }
        if (bl3) {
            comparator.compare(object2, object2);
        }
        if (bl2 && bl3) {
            int n2 = comparator.compare(object, object2);
            cl.a(n2 <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", object, object2);
            if (n2 == 0) {
                cl.a(ce2 != ce.a | ce3 != ce.a);
            }
        }
    }

    Comparator a() {
        return this.a;
    }

    boolean b() {
        return this.b;
    }

    boolean c() {
        return this.e;
    }

    boolean d() {
        return this.c() && this.a(this.h()) || this.b() && this.b(this.f());
    }

    boolean a(Object object) {
        if (!this.b()) {
            return false;
        }
        Object object2 = this.f();
        int n2 = this.a.compare(object, object2);
        return n2 < 0 | n2 == 0 & this.g() == ce.a;
    }

    boolean b(Object object) {
        if (!this.c()) {
            return false;
        }
        Object object2 = this.h();
        int n2 = this.a.compare(object, object2);
        return n2 > 0 | n2 == 0 & this.i() == ce.a;
    }

    boolean c(Object object) {
        return !this.a(object) && !this.b(object);
    }

    hs a(hs hs2) {
        int n2;
        boolean bl2;
        cl.a(hs2);
        cl.a(this.a.equals(hs2.a));
        boolean bl3 = this.b;
        Object object = this.f();
        ce ce2 = this.g();
        if (!this.b()) {
            bl3 = hs2.b;
            object = hs2.f();
            ce2 = hs2.g();
        } else if (hs2.b() && ((bl2 = this.a.compare(this.f(), hs2.f())) < false || !bl2 && hs2.g() == ce.a)) {
            object = hs2.f();
            ce2 = hs2.g();
        }
        bl2 = this.e;
        Object object2 = this.h();
        ce ce3 = this.i();
        if (!this.c()) {
            bl2 = (hs2.e ? 1 : 0) != 0;
            object2 = hs2.h();
            ce3 = hs2.i();
        } else if (hs2.c() && ((n2 = this.a.compare(this.h(), hs2.h())) > 0 || n2 == 0 && hs2.i() == ce.a)) {
            object2 = hs2.h();
            ce3 = hs2.i();
        }
        if (bl3 && bl2 && ((n2 = this.a.compare(object, object2)) > 0 || n2 == 0 && ce2 == ce.a && ce3 == ce.a)) {
            object = object2;
            ce2 = ce.a;
            ce3 = ce.b;
        }
        return new hs(this.a, bl3, object, ce2, bl2, object2, ce3);
    }

    public boolean equals(Object object) {
        if (object instanceof hs) {
            hs hs2 = (hs)object;
            return this.a.equals(hs2.a) && this.b == hs2.b && this.e == hs2.e && this.g().equals((Object)hs2.g()) && this.i().equals((Object)hs2.i()) && cc.a(this.f(), hs2.f()) && cc.a(this.h(), hs2.h());
        }
        return false;
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a, this.f(), this.g(), this.h(), this.i()});
    }

    hs e() {
        hs hs2 = this.h;
        if (hs2 == null) {
            hs2 = new hs(yd.a(this.a).a(), this.e, this.h(), this.i(), this.b, this.f(), this.g());
            hs2.h = this;
            this.h = hs2;
            return this.h;
        }
        return hs2;
    }

    public String toString() {
        return this.a + ":" + (this.d == ce.b ? (char)'[' : '(') + (this.b ? this.c : "-\u221e") + ',' + (this.e ? this.f : "\u221e") + (this.g == ce.b ? (char)']' : ')');
    }

    Object f() {
        return this.c;
    }

    ce g() {
        return this.d;
    }

    Object h() {
        return this.f;
    }

    ce i() {
        return this.g;
    }
}


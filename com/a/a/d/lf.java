/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aba;
import com.a.a.d.abc;
import com.a.a.d.abg;
import com.a.a.d.ay;
import com.a.a.d.dw;
import com.a.a.d.ep;
import com.a.a.d.jl;
import com.a.a.d.lg;
import com.a.a.d.lh;
import com.a.a.d.ll;
import com.a.a.d.lm;
import com.a.a.d.ln;
import com.a.a.d.lo;
import com.a.a.d.me;
import com.a.a.d.yd;
import com.a.a.d.yl;
import com.a.a.d.yr;
import com.a.a.d.zq;
import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public final class lf
extends ay
implements Serializable {
    private static final lf a = new lf(jl.d());
    private static final lf b = new lf(jl.a(yl.c()));
    private final transient jl c;
    private transient lf d;

    public static lf c() {
        return a;
    }

    static lf d() {
        return b;
    }

    public static lf d(yl yl2) {
        cl.a(yl2);
        if (yl2.j()) {
            return lf.c();
        }
        if (yl2.equals(yl.c())) {
            return lf.d();
        }
        return new lf(jl.a(yl2));
    }

    public static lf d(yr yr2) {
        lf lf2;
        cl.a(yr2);
        if (yr2.a()) {
            return lf.c();
        }
        if (yr2.c(yl.c())) {
            return lf.d();
        }
        if (yr2 instanceof lf && !(lf2 = (lf)yr2).h()) {
            return lf2;
        }
        return new lf(jl.a(yr2.l()));
    }

    lf(jl jl2) {
        this.c = jl2;
    }

    private lf(jl jl2, lf lf2) {
        this.c = jl2;
        this.d = lf2;
    }

    @Override
    public boolean c(yl yl2) {
        int n2 = aba.a(this.c, yl.a(), yl2.b, yd.d(), abg.a, abc.a);
        return n2 != -1 && ((yl)this.c.get(n2)).a(yl2);
    }

    @Override
    public yl b(Comparable comparable) {
        int n2 = aba.a(this.c, yl.a(), dw.b(comparable), yd.d(), abg.a, abc.a);
        if (n2 != -1) {
            yl yl2 = (yl)this.c.get(n2);
            return yl2.f(comparable) ? yl2 : null;
        }
        return null;
    }

    @Override
    public yl e() {
        if (this.c.isEmpty()) {
            throw new NoSuchElementException();
        }
        return yl.a(((yl)this.c.get((int)0)).b, ((yl)this.c.get((int)(this.c.size() - 1))).c);
    }

    @Override
    public boolean a() {
        return this.c.isEmpty();
    }

    @Override
    public void a(yl yl2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(yr yr2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(yl yl2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void c(yr yr2) {
        throw new UnsupportedOperationException();
    }

    public lo f() {
        if (this.c.isEmpty()) {
            return lo.j();
        }
        return new zq(this.c, yl.a);
    }

    public lf g() {
        lf lf2 = this.d;
        if (lf2 != null) {
            return lf2;
        }
        if (this.c.isEmpty()) {
            this.d = lf.d();
            return this.d;
        }
        if (this.c.size() == 1 && ((yl)this.c.get(0)).equals(yl.c())) {
            this.d = lf.c();
            return this.d;
        }
        lm lm2 = new lm(this);
        lf2 = this.d = new lf(lm2, this);
        return lf2;
    }

    private jl g(yl yl2) {
        if (this.c.isEmpty() || yl2.j()) {
            return jl.d();
        }
        if (yl2.a(this.e())) {
            return this.c;
        }
        int n2 = yl2.d() ? aba.a((List)this.c, yl.b(), yl2.b, abg.d, abc.b) : 0;
        int n3 = yl2.g() ? aba.a((List)this.c, yl.a(), yl2.c, abg.c, abc.b) : this.c.size();
        int n4 = n3 - n2;
        if (n4 == 0) {
            return jl.d();
        }
        return new lg(this, n4, n2, yl2);
    }

    public lf e(yl yl2) {
        if (!this.a()) {
            yl yl3 = this.e();
            if (yl2.a(yl3)) {
                return this;
            }
            if (yl2.b(yl3)) {
                return new lf(this.g(yl2));
            }
        }
        return lf.c();
    }

    public me a(ep ep2) {
        cl.a(ep2);
        if (this.a()) {
            return me.l();
        }
        yl yl2 = this.e().a(ep2);
        if (!yl2.d()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!yl2.g()) {
            try {
                ep2.e();
            }
            catch (NoSuchElementException noSuchElementException) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new lh(this, ep2);
    }

    boolean h() {
        return this.c.a();
    }

    public static ll i() {
        return new ll();
    }

    Object j() {
        return new ln(this.c);
    }

    @Override
    public /* synthetic */ yr f(yl yl2) {
        return this.e(yl2);
    }

    @Override
    public /* synthetic */ yr k() {
        return this.g();
    }

    @Override
    public /* synthetic */ Set l() {
        return this.f();
    }

    static /* synthetic */ jl a(lf lf2) {
        return lf2.c;
    }
}


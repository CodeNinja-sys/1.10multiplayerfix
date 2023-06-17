/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.aba;
import com.a.a.d.abc;
import com.a.a.d.abg;
import com.a.a.d.dw;
import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.d.jt;
import com.a.a.d.lc;
import com.a.a.d.ld;
import com.a.a.d.le;
import com.a.a.d.sz;
import com.a.a.d.yl;
import com.a.a.d.yq;
import com.a.a.d.zl;
import com.a.a.d.zq;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class lb
implements yq {
    private static final lb a = new lb(jl.d(), jl.d());
    private final jl b;
    private final jl c;

    public static lb a() {
        return a;
    }

    public static lb a(yl yl2, Object object) {
        return new lb(jl.a(yl2), jl.a(object));
    }

    public static lb a(yq yq2) {
        if (yq2 instanceof lb) {
            return (lb)yq2;
        }
        Map map = yq2.f();
        jn jn2 = new jn(map.size());
        jn jn3 = new jn(map.size());
        for (Map.Entry entry : map.entrySet()) {
            jn2.c(entry.getKey());
            jn3.c(entry.getValue());
        }
        return new lb(jn2.b(), jn3.b());
    }

    public static le b() {
        return new le();
    }

    lb(jl jl2, jl jl3) {
        this.b = jl2;
        this.c = jl3;
    }

    @Override
    public Object a(Comparable comparable) {
        int n2 = aba.a((List)this.b, yl.a(), dw.b(comparable), abg.a, abc.a);
        if (n2 == -1) {
            return null;
        }
        yl yl2 = (yl)this.b.get(n2);
        return yl2.f(comparable) ? this.c.get(n2) : null;
    }

    @Override
    public Map.Entry b(Comparable comparable) {
        int n2 = aba.a((List)this.b, yl.a(), dw.b(comparable), abg.a, abc.a);
        if (n2 == -1) {
            return null;
        }
        yl yl2 = (yl)this.b.get(n2);
        return yl2.f(comparable) ? sz.a(yl2, this.c.get(n2)) : null;
    }

    @Override
    public yl c() {
        if (this.b.isEmpty()) {
            throw new NoSuchElementException();
        }
        yl yl2 = (yl)this.b.get(0);
        yl yl3 = (yl)this.b.get(this.b.size() - 1);
        return yl.a(yl2.b, yl3.c);
    }

    @Override
    public void b(yl yl2, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void b(yq yq2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void d() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(yl yl2) {
        throw new UnsupportedOperationException();
    }

    public jt e() {
        if (this.b.isEmpty()) {
            return jt.m();
        }
        zq zq2 = new zq(this.b, yl.a);
        return new zl(zq2, this.c);
    }

    public lb b(yl yl2) {
        int n2;
        if (((yl)cl.a(yl2)).j()) {
            return lb.a();
        }
        if (this.b.isEmpty() || yl2.a(this.c())) {
            return this;
        }
        int n3 = aba.a((List)this.b, yl.b(), yl2.b, abg.d, abc.b);
        if (n3 >= (n2 = aba.a((List)this.b, yl.a(), yl2.c, abg.a, abc.b))) {
            return lb.a();
        }
        int n4 = n3;
        int n5 = n2 - n3;
        lc lc2 = new lc(this, n5, n4, yl2);
        lb lb2 = this;
        return new ld(this, lc2, this.c.a(n3, n2), yl2, lb2);
    }

    @Override
    public int hashCode() {
        return this.e().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof yq) {
            yq yq2 = (yq)object;
            return this.e().equals(yq2.f());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.e().toString();
    }

    @Override
    public /* synthetic */ yq c(yl yl2) {
        return this.b(yl2);
    }

    @Override
    public /* synthetic */ Map f() {
        return this.e();
    }

    static /* synthetic */ jl a(lb lb2) {
        return lb2.b;
    }
}


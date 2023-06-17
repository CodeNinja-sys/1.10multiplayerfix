/*
 * Decompiled with CFR 0.150.
 */
package com.a.b;

import com.a.b.w;
import com.a.b.y;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class t
extends w
implements Iterable {
    private final List a = new ArrayList();

    t a() {
        t t2 = new t();
        for (w w2 : this.a) {
            t2.a(w2.o());
        }
        return t2;
    }

    public void a(w w2) {
        if (w2 == null) {
            w2 = y.a;
        }
        this.a.add(w2);
    }

    public void a(t t2) {
        this.a.addAll(t2.a);
    }

    public int b() {
        return this.a.size();
    }

    public Iterator iterator() {
        return this.a.iterator();
    }

    public w a(int n2) {
        return (w)this.a.get(n2);
    }

    public Number c() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).c();
        }
        throw new IllegalStateException();
    }

    public String d() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).d();
        }
        throw new IllegalStateException();
    }

    public double e() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public BigDecimal f() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).f();
        }
        throw new IllegalStateException();
    }

    public BigInteger g() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).g();
        }
        throw new IllegalStateException();
    }

    public float h() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).h();
        }
        throw new IllegalStateException();
    }

    public long i() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).i();
        }
        throw new IllegalStateException();
    }

    public int j() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).j();
        }
        throw new IllegalStateException();
    }

    public byte k() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).k();
        }
        throw new IllegalStateException();
    }

    public char l() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).l();
        }
        throw new IllegalStateException();
    }

    public short m() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).m();
        }
        throw new IllegalStateException();
    }

    public boolean n() {
        if (this.a.size() == 1) {
            return ((w)this.a.get(0)).n();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object object) {
        return object == this || object instanceof t && ((t)object).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    /* synthetic */ w o() {
        return this.a();
    }
}


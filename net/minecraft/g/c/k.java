/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c;

import com.a.a.d.hw;
import com.a.a.d.jt;
import com.a.a.d.mi;
import com.a.a.d.sz;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.c.g;
import net.minecraft.g.cn;
import net.minecraft.q.n;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.u.b.o;
import net.minecraft.u.b.s;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

class k
extends g {
    private final cn a;
    private final jt b;
    private mi c;

    private k(cn cn2, jt jt2) {
        this.a = cn2;
        this.b = jt2;
    }

    @Override
    public Collection a() {
        return Collections.unmodifiableCollection(this.b.g());
    }

    @Override
    public Comparable a(net.minecraft.g.b.b b2) {
        Comparable comparable = (Comparable)this.b.get(b2);
        if (comparable == null) {
            throw new IllegalArgumentException("Cannot get property " + b2 + " as it does not exist in " + this.a.u());
        }
        return (Comparable)b2.c().cast(comparable);
    }

    @Override
    public b a(net.minecraft.g.b.b b2, Comparable comparable) {
        Comparable comparable2 = (Comparable)this.b.get(b2);
        if (comparable2 == null) {
            throw new IllegalArgumentException("Cannot set property " + b2 + " as it does not exist in " + this.a.u());
        }
        if (comparable2 == comparable) {
            return this;
        }
        b b3 = (b)this.c.b(b2, comparable);
        if (b3 == null) {
            throw new IllegalArgumentException("Cannot set property " + b2 + " to " + comparable + " on block " + cn.v.b(this.a) + ", it is not an allowed value");
        }
        return b3;
    }

    @Override
    public jt b() {
        return this.b;
    }

    @Override
    public cn c() {
        return this.a;
    }

    public boolean equals(Object object) {
        return this == object;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void a(Map map) {
        if (this.c != null) {
            throw new IllegalStateException();
        }
        hw hw2 = hw.k();
        for (Map.Entry entry : this.b.e()) {
            net.minecraft.g.b.b b2 = (net.minecraft.g.b.b)entry.getKey();
            for (Comparable comparable : b2.b()) {
                if (comparable == entry.getValue()) continue;
                hw2.a(b2, comparable, (b)map.get(this.b(b2, comparable)));
            }
        }
        this.c = mi.b(hw2);
    }

    private Map b(net.minecraft.g.b.b b2, Comparable comparable) {
        HashMap hashMap = sz.b(this.b);
        hashMap.put(b2, comparable);
        return hashMap;
    }

    @Override
    public h d() {
        return this.a.v(this);
    }

    @Override
    public boolean e() {
        return this.a.q(this);
    }

    @Override
    public boolean a(net.minecraft.w.n n2) {
        return this.a.a((b)this, n2);
    }

    @Override
    public int f() {
        return this.a.r(this);
    }

    @Override
    public int g() {
        return this.a.t(this);
    }

    @Override
    public boolean h() {
        return this.a.s(this);
    }

    @Override
    public boolean i() {
        return this.a.u(this);
    }

    @Override
    public e j() {
        return this.a.g(this);
    }

    @Override
    public b a(bq bq2) {
        return this.a.a((b)this, bq2);
    }

    @Override
    public b a(bi bi2) {
        return this.a.a((b)this, bi2);
    }

    @Override
    public boolean k() {
        return this.a.e(this);
    }

    @Override
    public ac l() {
        return this.a.a(this);
    }

    @Override
    public int a(n n2, net.minecraft.u.b.b b2) {
        return this.a.c((b)this, n2, b2);
    }

    @Override
    public float m() {
        return this.a.y(this);
    }

    @Override
    public boolean n() {
        return this.a.w(this);
    }

    @Override
    public boolean o() {
        return this.a.x(this);
    }

    @Override
    public boolean p() {
        return this.a.f(this);
    }

    @Override
    public int a(n n2, net.minecraft.u.b.b b2, ad ad2) {
        return this.a.b(this, n2, b2, ad2);
    }

    @Override
    public boolean q() {
        return this.a.c(this);
    }

    @Override
    public int a(net.minecraft.q.k k2, net.minecraft.u.b.b b2) {
        return this.a.b((b)this, k2, b2);
    }

    @Override
    public float b(net.minecraft.q.k k2, net.minecraft.u.b.b b2) {
        return this.a.d(this, k2, b2);
    }

    @Override
    public float a(net.minecraft.w.a.b b2, net.minecraft.q.k k2, net.minecraft.u.b.b b3) {
        return this.a.a((b)this, b2, k2, b3);
    }

    @Override
    public int b(n n2, net.minecraft.u.b.b b2, ad ad2) {
        return this.a.c(this, n2, b2, ad2);
    }

    @Override
    public net.minecraft.g.a.b r() {
        return this.a.a_(this);
    }

    @Override
    public b b(n n2, net.minecraft.u.b.b b2) {
        return this.a.b((b)this, n2, b2);
    }

    @Override
    public a c(net.minecraft.q.k k2, net.minecraft.u.b.b b2) {
        return this.a.c((b)this, k2, b2);
    }

    @Override
    public boolean c(n n2, net.minecraft.u.b.b b2, ad ad2) {
        return this.a.a((b)this, n2, b2, ad2);
    }

    @Override
    public boolean s() {
        return this.a.d(this);
    }

    @Override
    public a d(net.minecraft.q.k k2, net.minecraft.u.b.b b2) {
        return this.a.a((b)this, k2, b2);
    }

    @Override
    public void a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, a a2, List list, net.minecraft.w.n n2) {
        this.a.a(this, k2, b2, a2, list, n2);
    }

    @Override
    public a c(n n2, net.minecraft.u.b.b b2) {
        return this.a.a((b)this, n2, b2);
    }

    @Override
    public o a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, s s2, s s3) {
        return this.a.a((b)this, k2, b2, s2, s3);
    }

    @Override
    public boolean t() {
        return this.a.h(this);
    }

    @Override
    public boolean a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, int n2, int n3) {
        return this.a.a((b)this, k2, b2, n2, n3);
    }

    @Override
    public void a(net.minecraft.q.k k2, net.minecraft.u.b.b b2, cn cn2) {
        this.a.a((b)this, k2, b2, cn2);
    }

    /* synthetic */ k(cn cn2, jt jt2, k k2) {
        this(cn2, jt2);
    }
}


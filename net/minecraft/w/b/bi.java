/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.cm;
import com.a.a.b.cn;
import java.util.List;
import net.minecraft.i.i;
import net.minecraft.i.j;
import net.minecraft.u.b.s;
import net.minecraft.u.r;
import net.minecraft.w.b.af;
import net.minecraft.w.b.au;
import net.minecraft.w.b.bm;
import net.minecraft.w.n;
import net.minecraft.w.t;

public class bi
extends bm {
    private final cm c = new au(this);
    protected t a;
    private final double d;
    private final double e;
    protected n b;
    private final float f;
    private i g;
    private final j h;
    private final Class i;
    private final cm j;

    public bi(t t2, Class class_, float f2, double d2, double d3) {
        this(t2, class_, cn.a(), f2, d2, d3);
    }

    public bi(t t2, Class class_, cm cm2, float f2, double d2, double d3) {
        this.a = t2;
        this.i = class_;
        this.j = cm2;
        this.f = f2;
        this.d = d2;
        this.e = d3;
        this.h = t2.N();
        this.b(1);
    }

    @Override
    public boolean e() {
        List list = this.a.aQ.a(this.i, this.a.cT().b((double)this.f, 3.0, this.f), cn.a(r.d, this.c, this.j));
        if (list.isEmpty()) {
            return false;
        }
        this.b = (n)list.get(0);
        s s2 = af.b(this.a, 16, 7, new s(this.b.aU, this.b.aV, this.b.aW));
        if (s2 == null) {
            return false;
        }
        if (this.b.h(s2.b, s2.c, s2.d) < this.b.n(this.a)) {
            return false;
        }
        this.g = this.h.a(s2.b, s2.c, s2.d);
        return this.g != null;
    }

    @Override
    public boolean a() {
        return !this.h.l();
    }

    @Override
    public void b() {
        this.h.a(this.g, this.d);
    }

    @Override
    public void c() {
        this.b = null;
    }

    @Override
    public void d() {
        if (this.a.n(this.b) < 49.0) {
            this.a.N().a(this.e);
        } else {
            this.a.N().a(this.d);
        }
    }
}


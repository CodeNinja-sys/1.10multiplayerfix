/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.b.g;
import net.minecraft.b.h;
import net.minecraft.i.a;
import net.minecraft.i.i;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.b.af;
import net.minecraft.w.b.bm;
import net.minecraft.w.t;

public class p
extends bm {
    private final t a;
    private final double b;
    private i c;
    private h d;
    private final boolean e;
    private final List f = ov.a();

    public p(t t2, double d2, boolean bl2) {
        this.a = t2;
        this.b = d2;
        this.e = bl2;
        this.b(1);
        if (!(t2.N() instanceof a)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }

    @Override
    public boolean e() {
        this.f();
        if (this.e && this.a.aQ.n()) {
            return false;
        }
        g g2 = this.a.aQ.U().a(new b(this.a), 0);
        if (g2 == null) {
            return false;
        }
        this.d = this.a(g2);
        if (this.d == null) {
            return false;
        }
        a a2 = (a)this.a.N();
        boolean bl2 = a2.e();
        a2.a(false);
        this.c = a2.a(this.d.d());
        a2.a(bl2);
        if (this.c != null) {
            return true;
        }
        s s2 = af.a(this.a, 10, 7, new s(this.d.d().cy_(), this.d.d().k(), this.d.d().l()));
        if (s2 == null) {
            return false;
        }
        a2.a(false);
        this.c = this.a.N().a(s2.b, s2.c, s2.d);
        a2.a(bl2);
        return this.c != null;
    }

    @Override
    public boolean a() {
        if (this.a.N().l()) {
            return false;
        }
        float f2 = this.a.bl + 4.0f;
        return this.a.c(this.d.d()) > (double)(f2 * f2);
    }

    @Override
    public void b() {
        this.a.N().a(this.c, this.b);
    }

    @Override
    public void c() {
        if (this.a.N().l() || this.a.c(this.d.d()) < 16.0) {
            this.f.add(this.d);
        }
    }

    private h a(g g2) {
        h h2 = null;
        int n2 = Integer.MAX_VALUE;
        for (h h3 : g2.f()) {
            int n3 = h3.a(n.c(this.a.aU), n.c(this.a.aV), n.c(this.a.aW));
            if (n3 >= n2 || this.a(h3)) continue;
            h2 = h3;
            n2 = n3;
        }
        return h2;
    }

    private boolean a(h h2) {
        for (h h3 : this.f) {
            if (!h2.d().equals(h3.d())) continue;
            return true;
        }
        return false;
    }

    private void f() {
        if (this.f.size() > 15) {
            this.f.remove(0);
        }
    }
}


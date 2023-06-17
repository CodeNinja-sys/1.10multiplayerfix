/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import net.minecraft.a.c;
import net.minecraft.d.j;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.q.t;
import net.minecraft.u.a.a;
import net.minecraft.u.b.o;
import net.minecraft.u.n;
import net.minecraft.w.c.q;
import net.minecraft.w.d.e;
import net.minecraft.w.l;
import net.minecraft.x.a.g;

public class b
extends q {
    private static final g a = net.minecraft.x.a.o.a(b.class, net.minecraft.x.a.q.h);

    public b(k k2) {
        super(k2);
        this.d(0.3125f, 0.3125f);
    }

    public b(k k2, l l2, double d2, double d3, double d4) {
        super(k2, l2, d2, d3, d4);
        this.d(0.3125f, 0.3125f);
    }

    public static void a(a a2) {
        q.a(a2, "WitherSkull");
    }

    @Override
    protected float a() {
        return this.c() ? 0.73f : super.a();
    }

    public b(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, d5, d6, d7);
        this.d(0.3125f, 0.3125f);
    }

    @Override
    public boolean cy() {
        return false;
    }

    @Override
    public float a(t t2, k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        float f2 = super.a(t2, k2, b2, b3);
        cn cn2 = b3.c();
        if (this.c() && net.minecraft.w.d.e.a(cn2)) {
            f2 = Math.min(0.8f, f2);
        }
        return f2;
    }

    @Override
    protected void a(o o2) {
        if (!this.aQ.C) {
            if (o2.d != null) {
                if (this.b != null) {
                    if (o2.d.a(n.a(this.b), 8.0f)) {
                        if (o2.d.br()) {
                            this.a(this.b, o2.d);
                        } else {
                            this.b.a(5.0f);
                        }
                    }
                } else {
                    o2.d.a(n.n, 5.0f);
                }
                if (o2.d instanceof l) {
                    int n2 = 0;
                    if (this.aQ.R() == net.minecraft.q.l.c) {
                        n2 = 10;
                    } else if (this.aQ.R() == net.minecraft.q.l.d) {
                        n2 = 40;
                    }
                    if (n2 > 0) {
                        ((l)o2.d).c(new j(net.minecraft.a.c.t, 20 * n2, 1));
                    }
                }
            }
            this.aQ.a(this, this.aU, this.aV, this.aW, 1.0f, false, this.aQ.G().b("mobGriefing"));
            this.aa();
        }
    }

    @Override
    public boolean cg_() {
        return false;
    }

    @Override
    public boolean a(n n2, float f2) {
        return false;
    }

    @Override
    protected void cb_() {
        this.bE.a(a, false);
    }

    public boolean c() {
        return (Boolean)this.bE.a(a);
    }

    public void a(boolean bl2) {
        this.bE.b(a, bl2);
    }

    @Override
    protected boolean f() {
        return false;
    }
}

